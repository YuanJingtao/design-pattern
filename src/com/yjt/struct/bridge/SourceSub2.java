package com.yjt.struct.bridge;

/**
 * SourceSub1
 *
 * @author YuanJingtao
 * @version 1.0
 * @date 2017-02-10 17:38
 */
public class SourceSub2 implements Sourceable {

    @Override
    public void method() {
        System.out.println("this is the second sub!");
    }

}
