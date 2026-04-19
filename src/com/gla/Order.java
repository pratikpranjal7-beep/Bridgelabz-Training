package com.gla;

class Order{
    int orderId;
    String orderDate;
    Order(int orderId,String orderDate){
        this.orderId=orderId;
        this.orderDate=orderDate;
    }
    String getOrderStatus(){
        return"Order Placed";
    }
}
class ShippedOrder extends Order{
    String trackingNumber;
    ShippedOrder(int orderId,String orderDate,String trackingNumber){
        super(orderId,orderDate);
        this.trackingNumber=trackingNumber;
    }
    @Override
    String getOrderStatus(){
        return"Order Shipped";
    }
}
class DeliveredOrder extends ShippedOrder{
    String deliveryDate;
    DeliveredOrder(int orderId,String orderDate,String trackingNumber,String deliveryDate){
        super(orderId,orderDate,trackingNumber);
        this.deliveryDate=deliveryDate;
    }
    @Override
    String getOrderStatus(){
        return"Order Delivered";
    }
}
class Main7{
    public static void main(String[]args){
        Order o=new DeliveredOrder(1,"10-01","TR123","12-01");
        System.out.println(o.getOrderStatus());
    }
}
