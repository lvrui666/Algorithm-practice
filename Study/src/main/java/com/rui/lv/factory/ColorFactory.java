package com.rui.lv.factory;

/**
 * @author LV
 * @date 2019/11/5 14:04
 */
/**
 * 工厂设计模式  颜色工厂类
 */
public class ColorFactory extends AbstarctFactory {

    @Override
    public Color getColor(String colorType){
        if(colorType == null){
            return null;
        }
        if("red".equalsIgnoreCase(colorType)){
            return new Red();
        }else if("black".equalsIgnoreCase(colorType)){
            return new Black();
        }else if("yellow".equalsIgnoreCase(colorType)){
            return new Yellow();
        }else {
            return null;
        }

    }

    @Override
    public House getHouse(String houseType) {
        return null;
    }

    public static void main(String[] args) throws Exception{

        AbstarctFactory houseFactory = FactoryProducer.getFactory("house");
        House big = houseFactory.getHouse("big");
        big.getHouse();
        House middle = houseFactory.getHouse("middle");
        middle.getHouse();
        House small = houseFactory.getHouse("small");
        small.getHouse();
        AbstarctFactory colorFactory = FactoryProducer.getFactory("color");
        Color red = colorFactory.getColor("red");
        red.getColor();
        Color black = colorFactory.getColor("black");
        black.getColor();
        Color yellow = colorFactory.getColor("yellow");
        yellow.getColor();

    }

}
