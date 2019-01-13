package entity;

public class Goods {
    private int goodsID;
    private String goodsPath;
    private String goodsName;
    private double goodsPrice;
    private String goodType;

    public int getGoodsID() {
        return goodsID;
    }

    public void setGoodsID(int goodsID) {
        this.goodsID = goodsID;
    }

    public String getGoodsPath() {
        return goodsPath;
    }

    public void setGoodsPath(String goodsPath) {
        this.goodsPath = goodsPath;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodType() {
        return goodType;
    }

    public void setGoodType(String goodType) {
        this.goodType = goodType;
    }

    public Goods(int goodsID, String goodsPath, String goodsName, double goodsPrice, String goodType) {
        this.goodsID = goodsID;
        this.goodsPath = goodsPath;
        this.goodsName = goodsName;
        this.goodsPrice = goodsPrice;
        this.goodType = goodType;
    }

    public Goods() {
    }
}
