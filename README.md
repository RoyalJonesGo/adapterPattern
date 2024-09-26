# Adapter Pattern for Plugging Devices into Power Outlets

## Problem Statement
You are developing an application that helps users manage and control various electronic devices by plugging them into power outlets. Each device has different plug types, voltage, and amperage requirements. To ensure compatibility and safety, you need to create adapters for different devices to allow them to be plugged into standard power outlets.

### Classes:
- **Laptop**: Represents a laptop with a `charge()` method.
- **Refrigerator**: Represents a refrigerator with a `startCooling()` method.
- **SmartphoneCharger**: Represents a smartphone charger with a `chargePhone()` method.
- **PowerOutlet**: Interface for plugging in devices using a `plugIn()` method.
- **LaptopAdapter**: Adapter for Laptop.
- **RefrigeratorAdapter**: Adapter for Refrigerator.
- **SmartphoneAdapter**: Adapter for SmartphoneCharger.

### UML Class Diagram
Refer to the `adapterPatternImage.png` file for the UML class diagram.

## How to Run
1. Clone the repository.
2. Compile and run the `Main.java` file to see the output of each device being plugged into the power outlet via adapters.
