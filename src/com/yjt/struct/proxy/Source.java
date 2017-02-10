package com.yjt.struct.proxy;

/**
 * Source
 *
 * @author YuanJingtao
 * @version 1.0
 * @date 2017-02-10 17:28
 */
public class Source implements Sourceable {

    @Override
    public void method() {
        System.out.println("the original method!");
    }

}
