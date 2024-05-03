package hiperdino.client;

import java.util.Stack;

import hiperdino.people.People;
import hiperdino.products.Products;

public class Client {
    private Stack<String> randomBuyList = Products.randomBuyList();
    private String name = People.people();

    public Client(Stack<String> randomBuyList, String name) {
        this.randomBuyList = randomBuyList;
        this.name = name;
    }

    public Stack<String> getRandomBuyList() {
        return randomBuyList;
    }

    public void setRandomBuyList(Stack<String> randomBuyList) {
        this.randomBuyList = randomBuyList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

}