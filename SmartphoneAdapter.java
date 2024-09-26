public class SmartphoneAdapter implements PowerOutlet {
    private SmartphoneCharger charger;

    public SmartphoneAdapter(SmartphoneCharger charger) {
        this.charger = charger;
    }

    @Override
    public void plugIn() {
        charger.chargePhone(); // Adapt plugIn method to chargePhone of SmartphoneCharger
    }
}
