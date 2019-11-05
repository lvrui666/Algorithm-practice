package com.rui.lv.factory;

/**
 * @author LV
 * @date 2019/11/5 14:19
 */

/**
 * 房子工厂类
 */
public class HouseFactory extends AbstarctFactory{
    @Override
    public Color getColor(String colorType) {
        return null;
    }

    @Override
    public House getHouse(String houseType) {

        if("big".equalsIgnoreCase(houseType)){
            return new BigHouse();
        }else if("middle".equalsIgnoreCase(houseType)){
            return new MiddleHouse();
        }else if("small".equalsIgnoreCase(houseType)){
            return new SmallHouse();
        }else {
            return null;
        }

    }
}
