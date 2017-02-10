package com.yjt.create.singleton;

/**
 * Singleton
 * a>Note、B线程同时进入了第一个if判断
 * b>A首先进入synchronized块，由于instance为null，所以它执行instance = new Singleton();
 * c>由于JVM内部的优化机制，JVM先画出了一些分配给Singleton实例的空白内存，并赋值给instance成员（注意此时JVM没有开始初始化这个实例），然后A离开了synchronized块。
 * d>B进入synchronized块，由于instance此时不是null，因此它马上离开了synchronized块并将结果返回给调用该方法的程序。
 * e>此时B线程打算使用Singleton实例，却发现它没有被初始化，于是错误发生了。
 *
 * 解决方法：
 * 实际情况是，单例模式使用内部类来维护单例的实现，JVM内部的机制能够保证当一个类被加载的时候，这个类的加载过程是线程互斥的。这样当我们第一次调用getInstance的时候，
 * JVM能够帮我们保证instance只被创建一次，并且会保证把赋值给instance的内存初始化完毕，这样我们就不用担心上面的问题。同时该方法也只会在第一次调用的时候使用互斥机
 * 制，这样就解决了低性能问题。这样我们暂时总结一个完美的单例模式：
 *
 * @author YuanJingtao
 * @version 1.0
 * @date 2017-02-08 14:13
 */
//public class Singleton {
//
//    /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
//    private static Singleton instance = null;
//
//    /* 私有构造方法，防止被实例化*/
//    private Singleton() {
//
//    }
//
//    public static Singleton getInstance() {
//        if (instance == null) {
//            //用于保证线程安全
//            synchronized (instance) {
//                instance = new Singleton();
//            }
//        }
//        return instance;
//    }
//
//    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
//    public Object readResolve() {
//        return instance;
//    }
//}

public class Singleton {

    /* 私有构造方法，防止被实例化*/
    private Singleton() {

    }

    /* 此处使用一个内部类来维护单例 */
    private static class SingletonFactory {
        private static Singleton instance = new Singleton();
    }

    /* 获取实例 */
    public static Singleton getInstance() {
        return SingletonFactory.instance;
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return getInstance();
    }
}

//public class Singleton {
//
//    private static Singleton instance = null;
//
//    private SingletonTest() {
//    }
//
//    private static synchronized void syncInit() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//    }
//
//    public static Singleton getInstance() {
//        if (instance == null) {
//            syncInit();
//        }
//        return instance;
//    }
//}
