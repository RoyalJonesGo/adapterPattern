public class Main {
    public static void main(String[] args) {
        // test laptop adapter
        Laptop laptop = new Laptop();
        PowerOutlet laptopAdapter = new LaptopAdapter(laptop);
        laptopAdapter.plugIn();  // Output: Laptop is charging.

        // test ref adapter
        Refrigerator refrigerator = new Refrigerator();
        PowerOutlet fridgeAdapter = new RefrigeratorAdapter(refrigerator);
        fridgeAdapter.plugIn();  // Output: Refrigerator is now cooling.

        // test smartphone adapter
        SmartphoneCharger charger = new SmartphoneCharger();
        PowerOutlet phoneAdapter = new SmartphoneAdapter(charger);
        phoneAdapter.plugIn();  // Output: Smartphone is charging.
    }
}
