package com.yjt.struct.decorator;

/**
 * Source
 *
 * @author YuanJingtao
 * @version 1.0
 * @date 2017-02-10 17:24
 */
public class Source implements Sourceable {

    @Override
    public void method() {
        System.out.println("the original method!");
    }

}
