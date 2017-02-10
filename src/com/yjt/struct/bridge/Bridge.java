package com.yjt.struct.bridge;

/**
 * Bridge
 *
 * @author YuanJingtao
 * @version 1.0
 * @date 2017-02-10 17:39
 */
public abstract class Bridge {

    private Sourceable source;

    public void method(){
        source.method();
    }

    public Sourceable getSource() {
        return source;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }

}
