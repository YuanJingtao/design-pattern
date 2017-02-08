package com.yjt.abstractfactory.provide;

import com.yjt.abstractfactory.send.MailSender;
import com.yjt.abstractfactory.send.Sender;

/**
 * SendMailFactory
 *
 * @author YuanJingtao
 * @version 1.0
 * @date 2017-02-08 13:45
 */
public class SendMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
