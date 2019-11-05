package com.rui.lv.factory;

/**
 * @author LV
 * @date 2019/11/5 14:14
 */

/**
 *  抽象工厂类
 */
public abstract class AbstarctFactory {

    public abstract Color getColor(String colorType);
    public abstract House getHouse(String houseType);
}
