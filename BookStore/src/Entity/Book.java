package Entity;

public class Book {
    private int id;
    private String name;
    private float price;
    private String Athor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getAthor() {
        return Athor;
    }

    public void setAthor(String athor) {
        Athor = athor;
    }

    public Book(String name, float price, String athor) {
        this.name = name;
        this.price = price;
        Athor = athor;
    }

    public Book() {
    }
}
