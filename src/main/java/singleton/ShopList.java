package singleton;

import java.util.HashMap;
import java.util.Map;

public class ShopList {
    private static final ShopList SL = new ShopList();
    private final Map<String, Integer> shopList = new HashMap<>();

    public static ShopList getInstance(){
        return SL;
    }
    public void addItem(String item, int qtd) {
        SL.shopList.put(item, qtd);
    }
    public void viewItens(){
        System.out.println(SL.shopList.toString());
    }

    public void editItem(String item, int qtd){
        SL.shopList.replace(item, qtd);
    }

    public void deleteItem(String item){
        SL.shopList.remove(item);
    }
}
