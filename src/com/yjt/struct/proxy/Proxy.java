package com.yjt.struct.proxy;

/**
 * Proxy
 *
 * @author YuanJingtao
 * @version 1.0
 * @date 2017-02-10 17:29
 */
public class Proxy implements Sourceable {

    private Source source;
    public Proxy(){
        super();
        this.source = new Source();
    }
    @Override
    public void method() {
        before();
        source.method();
        atfer();
    }
    private void atfer() {
        System.out.println("after proxy!");
    }
    private void before() {
        System.out.println("before proxy!");
    }

}
