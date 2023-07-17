import java.util.ArrayList;

public class Customer {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private Address deliveryAddress;
    private CustomerType customerType;
    private int discount;
    private ArrayList<Item> listOfFavoriteItems;
    private Gift gift;

    public Customer(String id, String firstName, String lastName, String email, Address deliveryAddress, CustomerType customerType,
                    int discount, ArrayList<Item> listOfFavoriteItems, Gift gift) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.deliveryAddress = deliveryAddress;
        this.customerType = customerType;
        this.discount = discount;
        this.listOfFavoriteItems = new ArrayList<>();
        this.gift = gift;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public int getDiscount() {
        return discount;
    }

    public ArrayList<Item> getListOfFavoriteItems() {
        return listOfFavoriteItems;
    }

    public GiftAble getGift() {
       return gift;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void setListOfFavoriteItems(ArrayList<Item> listOfFavoriteItems) {
        listOfFavoriteItems = listOfFavoriteItems;
    }

    public void setGift(Gift gift) {
        this.gift = gift;
    }

    public void updateFavoriteItems(Item item){
        this.listOfFavoriteItems.add(item);
    }

    public void removeFavoriteItems(Item item){
        this.listOfFavoriteItems.remove(item);
    }

    public void takeGift(Gift gift){
        this.gift = gift;
    }

    public void openGift(){
        if(!(this.gift == null)){
            gift.openGift();
        }
    }






}
