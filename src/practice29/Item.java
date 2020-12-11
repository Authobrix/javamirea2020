package practice29;

public interface Item {
    String getName();
    int getCost();
    void setCost(int cost);
    void setName(String name);
    Dish getDescription();
    void setDescription(Dish description);
}