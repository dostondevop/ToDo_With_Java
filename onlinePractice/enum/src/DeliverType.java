public enum DeliverType {
    PLANE("Plane", 100) {

    } ,
    CAR("Car",1),
    SEA("Sea",500);

    private final String name;
    private final int amount;

    public String getName() {
        return name;
    }

    DeliverType(String type, int amount) {
        this.name = type;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
