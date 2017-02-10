package com.yjt.create.factory.send;

/**
 * SmsSender
 *
 * @author YuanJingtao
 * @version 1.0
 * @date 2017-02-08 13:16
 */
public class SmsSender implements Sender{
    @Override
    public void send() {
        System.out.print("this is sms sender");
    }
}
