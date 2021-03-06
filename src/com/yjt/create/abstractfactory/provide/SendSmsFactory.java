package com.yjt.create.abstractfactory.provide;

import com.yjt.create.abstractfactory.send.Sender;
import com.yjt.create.abstractfactory.send.SmsSender;

/**
 * SendSmsFactory
 *
 * @author YuanJingtao
 * @version 1.0
 * @date 2017-02-08 13:46
 */
public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
