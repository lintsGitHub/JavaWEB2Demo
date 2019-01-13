package dao;

import entity.Goods;

import java.util.List;

public class GoodsEnt implements GoodsSer {
    SQLiteUtil util = new SQLiteUtil();

    @Override
//    查商品表
    public List<Goods> goodsList() {
        String strSQL = "select i.S_id,i.S_path,i.S_name,i.S_price,t.pType from porductInformation i , productType t where i.S_TypeID = t.pID";
        return util.seleGoods(strSQL);
    }

    @Override
//    添加商品
    public boolean addGoods(Goods goods) {
        String strSQL = "insert into porductInformation (S_id,S_path,S_name,S_price,S_TypeID) values (?,?,?,?,(select pID from productType where pType = ?) )";
        return util.update(strSQL,String .valueOf(goods.getGoodsID()),goods.getGoodsPath(),goods.getGoodsName(),String.valueOf(goods.getGoodsPrice()),goods.getGoodType());
    }

    @Override
    public boolean delGoods() {
        return false;
    }

    @Override
    public boolean updateGoods() {
        return false;
    }

    @Override
//    查询商品类型表
    public List<String> typeList() {
        String strSQL = "select pType from productType";
        return util.typeList(strSQL);
    }

    @Override
//    添加商品类型
    public boolean addType(String type) {
        String strSQL  = "insert into productType (pType) values (?)";
        return util.update(strSQL,type);
    }
    public int goodsCount(String userName){
        String strSQL = "select count(*) from shop where status = 'buy' and userID = (select userID from user where userName = ?)";
        List<String> list = util.typeList(strSQL, userName);
        return Integer.parseInt(list.get(0));
    }
    public List<Goods> seleGoods(String str){
        String strSQL = "select i.S_id,i.S_path,i.S_name,i.S_price,t.pType from porductInformation i , productType t where i.S_TypeID = t.pID and i.S_name like ?";
        return util.seleGoods(strSQL,str);
    }
}
