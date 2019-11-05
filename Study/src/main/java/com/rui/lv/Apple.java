package com.rui.lv;

/**
 * @author LV
 * @date 2019/11/5 13:43
 */
/**
 *  饿汉式单例模式
 */
public class Apple {

    private static final Apple apple = new Apple();
    private Apple(){

    }
     public static Apple getInstance(){
        return apple;
     }
     public static void main(String[] args) throws Exception{
         Apple apple = Apple.getInstance();
         Apple2 apple2 = Apple2.getInstance();
     }
}

/**
 *  懒汉式 单例模式 懒加载，性能低
 */
class Apple2{

    private static Apple2 apple2;

    private Apple2(){

    }
    public static Apple2 getInstance(){
        if(apple2==null){
            apple2 = new Apple2();
            return apple2;
        }
        return null;
    }
}

/**
 * 线程安全的单例模式
 * 这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 */
class Apple3{
    private static Apple3 apple3;
    private Apple3(){

    }

    public static Apple3 getInstance(){
        if (apple3 == null){
            synchronized (Apple3.class){
                if(apple3==null){
                    apple3 = new Apple3();
                }
            }
        }
        return apple3;
    }
}
