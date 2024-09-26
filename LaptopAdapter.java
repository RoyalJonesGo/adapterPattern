public class LaptopAdapter implements PowerOutlet {
    private Laptop laptop;

    public LaptopAdapter(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public void plugIn() {
        laptop.charge(); // Adapt the plugIn method to the charge method of Laptop
    }
}
