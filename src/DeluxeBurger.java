public class DeluxeBurger extends Hamburger {
    private String chips;
    private String drinks;
    public DeluxeBurger() {
        super("Delux Burger", "Delux meat", 19.10, "Delux Bread");
        this.chips = "chips";
        this.drinks = "drinks";
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("No additional items can be added to delux burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("No additional items can be added to delux burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("No additional items can be added to delux burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("No additional items can be added to delux burger");
    }
}
