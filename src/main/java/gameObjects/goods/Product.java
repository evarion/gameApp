package gameObjects.goods;

abstract class Product {
    String name = "";
    float price = 0.0f;
    int weight = 0;

    public abstract void buyProduct();
    public abstract void saleProduct();



}
