package practice7;

public class Plate extends Dish {
    String name;
    int calories;
    @Override
    public void wash() {
    }

    @Override
    public void clean() {
    }
    public void Meal(String name, int calories){
        this.name = name;
        this.calories= calories;
    }
}
