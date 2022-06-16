public class Drink {
    private final String name; private final Ingredient i1; private final Ingredient i2; private final Ingredient i3;
    public Drink(String name, Ingredient i1, Ingredient i2, Ingredient i3) { this.name = name;
        this.i1 = i1;
        this.i2 = i2;
        this.i3 = i3; }
    public int getPrice() {
        return i1.getPrice() + i2.getPrice() + i3.getPrice();
    }
    public int getCalories() {
        return i1.getCalories() + i2.getCalories() + i3.getCalories(); }
    public String getName() { return name;
    } }