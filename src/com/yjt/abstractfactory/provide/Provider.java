package com.yjt.abstractfactory.provide;

import com.yjt.abstractfactory.send.Sender;

/**
 * Provider
 *
 * @author YuanJingtao
 * @version 1.0
 * @date 2017-02-08 13:13
 */
public interface Provider {
    Sender produce();
}
