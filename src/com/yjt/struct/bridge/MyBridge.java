package com.yjt.struct.bridge;

/**
 * MyBridge
 *
 * @author YuanJingtao
 * @version 1.0
 * @date 2017-02-10 17:39
 */
public class MyBridge extends Bridge {

    public void method(){
        getSource().method();
    }

}
