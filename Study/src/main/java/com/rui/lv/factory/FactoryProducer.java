package com.rui.lv.factory;

/**
 * @author LV
 * @date 2019/11/5 14:22
 */

/**
 *  工厂生成器类
 */
public class FactoryProducer {

    public static AbstarctFactory getFactory(String factoryType){
        if("house".equalsIgnoreCase(factoryType)){
            return new HouseFactory();
        }else if("color".equalsIgnoreCase(factoryType)){
            return new ColorFactory();
        }else {
            return null;
        }
    }
}
