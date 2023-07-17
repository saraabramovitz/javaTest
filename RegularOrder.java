import java.time.LocalDate;
import java.util.ArrayList;

public class RegularOrder extends Order{
    public RegularOrder(String id, String name, ArrayList<Item> listOfItemsInOrder, Customer orderCustomer, PaymentType paymentType, LocalDate orderDate) {
        super(id, name, listOfItemsInOrder, orderCustomer, paymentType, orderDate);
        super.setTotalPrice(calculateOrderTotalPrice());
    }
    @Override
    public int calculateOrderTotalPrice(){
        int totalPrice = 0;
        for (Item item : super.getListOfItemsInOrder()){
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

}
