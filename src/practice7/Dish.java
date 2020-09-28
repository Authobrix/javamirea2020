package practice7;

public abstract class Dish {
    public abstract void wash();
    public abstract  void clean();
    protected void crush(){
        System.out.println("Dish are broken");
    }
}
