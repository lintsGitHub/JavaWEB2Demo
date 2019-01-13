package Entity;

public class Perfume {
    private int id ;
    private String name; //名字
    private String brand; //品牌
    private String fragrance; //香调
    private String odor;    //香味
    private String perfumer; //调香师
    private double price; //价格

    public Perfume(int id, String name, String brand, String fragrance, String odor, String perfumer, double price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.fragrance = fragrance;
        this.odor = odor;
        this.perfumer = perfumer;
        this.price = price;
    }

    public Perfume() {
    }

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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFragrance() {
        return fragrance;
    }

    public void setFragrance(String fragrance) {
        this.fragrance = fragrance;
    }

    public String getOdor() {
        return odor;
    }

    public void setOdor(String odor) {
        this.odor = odor;
    }

    public String getPerfumer() {
        return perfumer;
    }

    public void setPerfumer(String perfumer) {
        this.perfumer = perfumer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Perfume{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", fragrance='" + fragrance + '\'' +
                ", odor='" + odor + '\'' +
                ", perfumer='" + perfumer + '\'' +
                ", price=" + price +
                '}';
    }
}
