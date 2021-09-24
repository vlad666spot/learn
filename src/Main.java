 public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56,"White");
        hamburger.addHamburgerAddition1("Tomato", 0.23);
        hamburger.addHamburgerAddition2("Spices", 0.2);
        System.out.println("Total price of Burger is - " + hamburger.itemizeHamburger());
    }
}