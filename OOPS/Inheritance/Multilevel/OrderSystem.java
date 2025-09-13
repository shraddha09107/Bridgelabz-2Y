package Multilevel;
class Order {
    int orderId;
    String orderDate;

    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order Placed";
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Order Shipped, Tracking: " + trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order Delivered on " + deliveryDate;
    }
}

public class OrderSystem {
    public static void main(String[] args) {
        DeliveredOrder order = new DeliveredOrder(101, "2025-09-13", "TRK12345", "2025-09-15");
        System.out.println("Order ID: " + order.orderId);
        System.out.println("Date: " + order.orderDate);
        System.out.println("Status: " + order.getOrderStatus());
    }
}
