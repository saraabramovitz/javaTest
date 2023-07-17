import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Order implements CalculateTotalPriceAble{
    private String id;
    private String name;
    private ArrayList<Item> listOfItemsInOrder = new ArrayList<>();
    private Customer orderCustomer;
    private int totalPrice;
    private PaymentType paymentType;
    private LocalDate orderDate;

    public Order(String id, String name, ArrayList<Item> listOfItemsInOrder, Customer orderCustomer, PaymentType paymentType, LocalDate orderDate) {
        this.id = id;
        this.name = name;
        this.listOfItemsInOrder = listOfItemsInOrder;
        this.orderCustomer = orderCustomer;
        this.paymentType = paymentType;
        this.orderDate = orderDate;
        addFavoriteItemsToList();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Item> getListOfItemsInOrder() {
        return listOfItemsInOrder;
    }

    public Customer getOrderCustomer() {
        return orderCustomer;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOrderCustomer(Customer orderCustomer) {
        this.orderCustomer = orderCustomer;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public void addFavoriteItemsToList(){
        ArrayList<String> favoriteItemsByName = new ArrayList<>();
        for (Item favoriteItem : this.orderCustomer.getListOfFavoriteItems()){
            favoriteItemsByName.add(favoriteItem.getName());
        }
        for (Item item : this.listOfItemsInOrder){
            if(!favoriteItemsByName.contains(item.getName())){
                this.orderCustomer.getListOfFavoriteItems().add(item);
            }
        }
    }









}
