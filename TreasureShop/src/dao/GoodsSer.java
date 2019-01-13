package dao;

import entity.Goods;

import java.util.List;

public interface GoodsSer {
    List<Goods> goodsList();
    boolean addGoods(Goods goods);
    boolean delGoods();
    boolean updateGoods();
    List<String> typeList();
    boolean addType( String type);
}
