import java.time.LocalDate;
import java.util.ArrayList;

public class VipOrder extends Order{
    public VipOrder(String id, String name, ArrayList<Item> listOfItemsInOrder, Customer orderCustomer, PaymentType paymentType, LocalDate orderDate) {
        super(id, name, listOfItemsInOrder, orderCustomer, paymentType, orderDate);
        super.setTotalPrice(calculateOrderTotalPrice());
    }

    @Override
    public int calculateOrderTotalPrice(){
        int totalPrice = 0;
        if(super.getOrderCustomer().getCustomerType() == CustomerType.VIP){
            for (Item item : super.getListOfItemsInOrder()){
                totalPrice += item.getPrice();
            }
            totalPrice -= super.getOrderCustomer().getDiscount();
        }
        else {
            throw new ArithmeticException("The customer is not a vip customer.");
        }
        return totalPrice;
    }



}
