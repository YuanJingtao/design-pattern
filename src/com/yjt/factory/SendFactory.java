package com.yjt.factory;

import com.yjt.factory.send.MailSender;
import com.yjt.factory.send.Sender;
import com.yjt.factory.send.SmsSender;

/**
 * Provider
 *
 * @author YuanJingtao
 * @version 1.0
 * @date 2017-02-08 13:13
 */
public class SendFactory {
    private Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.print("请输入正确的类型!");
            return null;
        }
    }

    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produce("mail");
        sender.send();
    }
}
