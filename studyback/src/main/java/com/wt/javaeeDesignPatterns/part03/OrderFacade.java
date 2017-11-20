package com.wt.javaeeDesignPatterns.part03;

/**
 * 订单门面，将复杂的订单逻辑及支付逻辑隐藏起来
 */
public class OrderFacade {
    private Order order;

    private PayMent payMent;

    public OrderFacade(){
        order = new Order();
        payMent = new PayMent();
    }

    public void buy(){
        order.check();
        order.create();
        payMent.check();
        payMent.callThirdParty();
    }

}


/**
 * 订单类
 */
class Order {
    //检查订单数据
    public void check() {

    }

    /**
     * 创建订单
     */
    public void create() {

    }

}

/**
 * 支付类
 */
class PayMent {
    /**
     * 检查
     */
    public void check(){

    }

    /**
     * 调用支付借口
     */
    public void callThirdParty(){

    }
}