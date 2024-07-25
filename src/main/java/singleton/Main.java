package singleton;

public class Main {
    public static void main(String[] args) {
        ShopList shopList = ShopList.getInstance();

        //Inserting itens
        shopList.addItem("Apple", 2);
        shopList.addItem("Banana", 5);
        shopList.addItem("Carrot", 1);
        shopList.addItem("PineApple", 2);
        shopList.addItem("Bread", 6);
        shopList.addItem("Cheese", 1);

        //Reading list
        shopList.viewItens();

        //Editing item
        shopList.editItem("PineApple", 1);

        //Reading list
        shopList.viewItens();

        //Deleting item
        shopList.deleteItem("Cheese");

        //Reading list
        shopList.viewItens();

    }
}
