package dao;

import entity.Shop;

import java.util.List;

public class ShopEnt {
    SQLiteUtil util = new SQLiteUtil();
    public List<Shop> shopList(String userid){
        return null;
    }
    public boolean addShop(Shop shop){
        String strSQL = "insert into shop values (?,?,?,?)";
        return util.update(strSQL,shop.getGoodsid(),shop.getUserid(), String.valueOf(shop.getCount()),shop.getType());
    }
}
