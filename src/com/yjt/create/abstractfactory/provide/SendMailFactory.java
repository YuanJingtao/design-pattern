package com.yjt.create.abstractfactory.provide;

import com.yjt.create.abstractfactory.send.MailSender;
import com.yjt.create.abstractfactory.send.Sender;

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
