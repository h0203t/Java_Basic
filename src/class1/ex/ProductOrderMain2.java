package class1.ex;

public class ProductOrderMain2 {

    public static void main(String[] args) {


        int totalAmount = 0;
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + " 가격: " + order.price + " 수량: " + order.quantity);
            totalAmount += order.quantity * order.price;
        }

    }

    public ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    public void printOrder(ProductOrder productOrder){
        System.out.println("");
    }
}
