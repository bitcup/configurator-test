package com.bitcup.configurator.spring;

import com.bitcup.configurator.FileConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * User: omar
 */
public class AppBean {

    private int number;

    @Autowired
    @Qualifier("someConfigs")
    private FileConfig fileConfig;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getDynamicNumber() {
        return fileConfig.getInt("appBean.num");
    }
}
