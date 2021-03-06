package OOP.Mission_2.GameRoom;

import java.util.ArrayList;
import java.util.Collections;

public class GameRoom {
    private double cost;
    private double priceToys;
    public void setCost(double cost) {
        this.cost = cost;
    }
    public double getCost() {
        return cost ;
    }
    public double priceToys() {
        return priceToys ;
    }
    private ArrayList<Toy> toys = new ArrayList<Toy>();

    public GameRoom addToy(Toy toy) {
        priceToys += toy.getPrice();
        if(priceToys< this.getCost()){
            toys.add(toy);
        }
        return this;
    }

    public void sortAgeGroup() {

        Collections.sort(toys, new ComparatorToys());

        for (int i = 0; i < toys.size(); i++) {
            System.out.println(toys.get(i).toString());
        }
    }

    public void findToys(double price1,double price2) {
        int flg = 0;
        for (int i = 0; i < toys.size(); i++) {
            if ((toys.get(i).getPrice()>= price1) & (toys.get(i).getPrice()<= price2)) {
                System.out.println(toys.get(i).toString());
                flg = 1;
            }

        }
        if (flg == 0) {
            System.out.println("Нет такой игрушки");
        }
    }
}
