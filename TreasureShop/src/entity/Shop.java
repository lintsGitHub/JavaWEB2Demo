package entity;

public class Shop {
    private String userid;
    private String goodsid;
    private int count;
    private String type;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(String goodsid) {
        this.goodsid = goodsid;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Shop(String userid, String goodsid, int count, String type) {
        this.userid = userid;
        this.goodsid = goodsid;
        this.count = count;
        this.type = type;
    }

    public Shop() {
    }
}
