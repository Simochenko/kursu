package OOP.Mission_3.Peellable;

public class Bow extends Vegetable {

    private final static String name = "Лук";

    public Bow (double weight,String color,String maturity,String condition,boolean cleaning) {
        super(name, weight, color, maturity,condition,cleaning);
    }
    @Override
    public String toString() {
        return super.toString();
    }
    @Override
    public void peell(){
        super.peell();
    }
}
