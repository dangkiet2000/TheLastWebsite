package vn.edu.nlu.bean;



import java.io.Serializable;

public class Product implements Serializable{
    private String id;
    private String name;
    private String img1;
    private String img2;
    private String img3;
    private long price;
    private long priceSale;
    private int quantity;
<<<<<<< HEAD
    private  String id_categories;
    private String id_supplier;
=======
    private String sup;
    private  int active;
    // chỉnh sửa cho nay
    public Product(String id, String name, String img1, long price, long priceSale, String img2, String img3, int quantity) {
        this.id = id;
        this.name = name;
        this.img1 = img1;
        this.price = price;
        this.priceSale = priceSale;
        this.img2 = img2;
        this.img3 = img3;
        this.quantity = quantity;
    }
    // hết
    public Product(String id, String img1, String name, String sup, long price, long priceSale, int quantity, int active) {
        this.id = id;
>>>>>>> 82a67e9d3b80dfd9ac5b95df800b8123b2997be8

        this.img1 = img1;
        this.name = name;
        this.sup = sup;
        this.price = price;
        this.priceSale = priceSale;
        this.quantity = quantity;

        this.active = active;
    }

<<<<<<< HEAD
    public String getId_categories() {
        return id_categories;
    }

    public void setId_categories(String id_categories) {
        this.id_categories = id_categories;
    }

=======
>>>>>>> 82a67e9d3b80dfd9ac5b95df800b8123b2997be8
    public Product(String id, String name, String img, long price, long priceSale){
        this.id = id;
        this.name = name;
        this.img1 = img;
        this.price = price;
        this.priceSale = priceSale;
<<<<<<< HEAD
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
=======
>>>>>>> 82a67e9d3b80dfd9ac5b95df800b8123b2997be8

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
        return img1;
    }

    public void setImg(String img) {
        this.img1 = img;
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

<<<<<<< HEAD
    public String getId_supplier() {
        return id_supplier;
    }

    public void setId_supplier(String id_supplier) {
        this.id_supplier = id_supplier;
=======
    public String getImg1() {
        return img1;
    }

    public void setImg1(String img1) {
        this.img1 = img1;
    }

    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
    }

    public String getImg3() {
        return img3;
    }

    public void setImg3(String img3) {
        this.img3 = img3;
    }

    public String getSup() {
        return sup;
    }

    public void setSup(String sup) {
        this.sup = sup;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
>>>>>>> 82a67e9d3b80dfd9ac5b95df800b8123b2997be8
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
                ", img1='" + img1 + '\'' +
                ", img2='" + img2 + '\'' +
                ", img3='" + img3 + '\'' +
                ", price=" + price +
                ", priceSale=" + priceSale +
                ", quantity=" + quantity +
                ", sup='" + sup + '\'' +
                ", active=" + active +
                '}';
    }
}




