package com.yjt.struct.decorator;

/**
 * Decorator
 *
 * @author YuanJingtao
 * @version 1.0
 * @date 2017-02-10 17:25
 */
public class Decorator implements Sourceable {

    private Sourceable source;

    public Decorator(Sourceable source){
        super();
        this.source = source;
    }
    @Override
    public void method() {
        System.out.println("before decorator!");
        source.method();
        System.out.println("after decorator!");
    }

}
