package com.yjt.struct.adapter.objectp;

import com.yjt.struct.adapter.classp.Source;
import com.yjt.struct.adapter.classp.Targetable;

/**
 * Wrapper 对象的适配器模式
 *
 * 基本思路和类的适配器模式相同，只是将Adapter类作修改，这次不继承Source类，而是持有Source类的实例，以达到解决兼容性的问题。
 *
 * @author YuanJingtao
 * @version 1.0
 * @date 2017-02-10 17:08
 */
public class Wrapper implements Targetable {

    private Source source;

    public Wrapper(Source source){
        super();
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }

    public static void main(String[] args) {
        Source source = new Source();
        Targetable target = new Wrapper(source);
        target.method1();
        target.method2();
    }

}
