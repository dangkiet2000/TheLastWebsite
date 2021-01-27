package vn.edu.nlu.bean;



import java.io.Serializable;

public class Product implements Serializable{
    private String id;
    private String name;
    private String img;
    private long price;
    private long priceSale;
    private int quantity;
    private  String id_categories;
    private String id_supplier;

    public Product(String string, String rsString, String s, long aLong, long rsLong, long l){

    }

    public String getId_categories() {
        return id_categories;
    }

    public void setId_categories(String id_categories) {
        this.id_categories = id_categories;
    }

    public Product(String id, String name, String img, long price, long priceSale){
        this.id = id;
        this.name = name;
        this.img = img;
        this.price = price;
        this.priceSale = priceSale;
    }
    public Product(String id, String name, String img, long price, long priceSale,String id_categories,String id_supplier){
        this.id = id;
        this.name = name;
        this.img = img;
        this.price = price;
        this.priceSale = priceSale;
        this.id_categories=id_categories;
        this.id_supplier=id_supplier;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getPriceSale() {
        return priceSale;
    }

    public void setPriceSale(long priceSale) {
        this.priceSale = priceSale;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getId_supplier() {
        return id_supplier;
    }

    public void setId_supplier(String id_supplier) {
        this.id_supplier = id_supplier;
    }

    public  void add(){
        quantity++;
    }
    public  void remove(){
        quantity--;
    }
    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", img='" + img + '\'' +
                ", price=" + price +
                ", priceSale=" + priceSale +
                '}';
    }
}




