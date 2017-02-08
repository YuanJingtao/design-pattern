package com.yjt.abstractfactory.send;

/**
 * MailSender
 *
 * @author YuanJingtao
 * @version 1.0
 * @date 2017-02-08 13:15
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.print("this is mail sender");
    }
}
