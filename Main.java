import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Item ball = new Item("1", "Ball", 50);
        Item computer = new Item("2", "Computer", 1250);
        Item bag = new Item("3", "Bag", 200);
        Item iphone = new Item("4", "Iphone", 3500);
        ArrayList<Item> itemsA = new ArrayList<>();
        itemsA.add(ball);
        itemsA.add(computer);

        Gift gift = new Gift();
        Address firstCustomerAddress = new Address("Israel", "Haifa", "Havered", 12);
        Customer firstCustomer = new Customer("1", "Dan", "Shay", "dan@gmail.com", firstCustomerAddress,
                CustomerType.REGULAR, 0, null, null);

        for (Item item : firstCustomer.getListOfFavoriteItems()){
            item.printItem();
        }

        RegularOrder regularOrder = new RegularOrder("1ro", "Regular Order",  itemsA, firstCustomer, PaymentType.CASH, LocalDate.now());
        System.out.println(regularOrder.getId());
        System.out.println(regularOrder.getName());
        System.out.println(regularOrder.getTotalPrice());
        for (Item item : firstCustomer.getListOfFavoriteItems()){
            item.printItem();
        }

        firstCustomer.removeFavoriteItems(ball);
        for (Item item : firstCustomer.getListOfFavoriteItems()){
            item.printItem();
        }

        ArrayList<Item> itemsB = new ArrayList<>();
        itemsB.add(iphone);
        itemsB.add(computer);
        itemsB.add(bag);
        System.out.println("###########");
        RegularOrder regularOrderB = new RegularOrder("1ro", "Regular Order",  itemsB, firstCustomer, PaymentType.CREDIT_CARD, LocalDate.now());
        for (Item item : firstCustomer.getListOfFavoriteItems()){
            item.printItem();
        }
        System.out.println(regularOrderB.calculateOrderTotalPrice());

        firstCustomer.openGift();
        System.out.println("###########");
        firstCustomer.takeGift(gift);
        firstCustomer.openGift();

        System.out.println("*******");

        Address secondCustomerAddress = new Address("Israel", "Netania", "Havered", 52);

        Customer secondCustomer = new Customer("2", "Chen", "Lavi", "chen@gmail.com", secondCustomerAddress,
                CustomerType.VIP, 1000, null, null);
        for (Item item : secondCustomer.getListOfFavoriteItems()){
            item.printItem();
        }
        System.out.println(secondCustomer.getCustomerType());
        ArrayList<Item> itemsC = new ArrayList<>();
        itemsC.add(computer);

        VipOrder vipOrder = new VipOrder("1ro", "Regular Order",  itemsA, secondCustomer, PaymentType.CASH, LocalDate.now());
        System.out.println(vipOrder.getTotalPrice());
        VipOrder vipOrder1 = new VipOrder("2ro", "Regular Order",  itemsA, firstCustomer, PaymentType.CASH, LocalDate.now());
        System.out.println(vipOrder1.getTotalPrice());


    }

}