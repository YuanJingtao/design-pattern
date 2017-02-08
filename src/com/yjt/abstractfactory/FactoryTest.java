package com.yjt.abstractfactory;

import com.yjt.abstractfactory.provide.Provider;
import com.yjt.abstractfactory.provide.SendMailFactory;
import com.yjt.abstractfactory.send.Sender;

/**
 * FactoryTest
 *
 * @author YuanJingtao
 * @version 1.0
 * @date 2017-02-08 13:52
 */
public class FactoryTest {
    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.send();
    }
}
