import java.util.Calendar;

public class VehicleMonitor {
	private String type;
	private String model;
	private int power;
	private float fuelConsumption;
	private int yearProduced;
	private float weight;
	private String color;
	private static int ID = 0;

	VehicleMonitor(String type, String model, int power, float fuelConsumption,
			int yearProduced) {
		this.type = type;
		this.model = model;
		this.power = power;
		this.fuelConsumption = fuelConsumption;
		this.yearProduced = yearProduced;
		weight = 2;
		color = "N/A";
		ID++;
	}

	VehicleMonitor(String type, String model, int power, float fuelConsumption,
			int yearProduced, float weight) {
		this.type = type;
		this.model = model;
		this.power = power;
		this.fuelConsumption = fuelConsumption;
		this.yearProduced = yearProduced;
		this.weight = weight;
		this.color = "";
		ID++;
	}

	VehicleMonitor(String type, String model, int power, float fuelConsumption,
			int yearProduced, float weight, String color) {
		this.type = type;
		this.model = model;
		this.power = power;
		this.fuelConsumption = fuelConsumption;
		this.yearProduced = yearProduced;
		this.weight = weight;
		this.color = color;
		ID++;
	}

	private double computeTypeCoefficent() {
		if (type == "car") {
			return 1.00;
		}
		if (type == "suv") {
			return 1.12;
		}
		if (type == "truck") {
			return 1.20;
		} else if (type == "motorcycle") {
			return 1.50;
		}
		return 1.00;

	}

	public double calculateTripPrice(double fuelPrice, double distance) {
		return (fuelConsumption / 100.0) * distance * fuelPrice;
	}

	public double getInsurancePrice() {
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		double typeCoefficient = computeTypeCoefficent();
		int carAge = currentYear - yearProduced - 1;
		return (0.16 * power) * (1.25 * carAge) * (0.05 * fuelConsumption)
				* typeCoefficient;
	}

	public void getDescription(double fuelPrice, double distance) {
		if (ID < 10) {
			System.out.println("000" + VehicleMonitor.ID + " - " + model + ","
					+ yearProduced + "," + color);
			System.out.println("Insurance cost : " + getInsurancePrice()
					+ " - " + "Travel cost : "
					+ calculateTripPrice(fuelPrice, distance));
		} else if (10 <= ID && ID < 100) {
			System.out.println("00" + VehicleMonitor.ID + " - " + model + ","
					+ yearProduced + "," + color);
			System.out.println("Insurance cost : " + getInsurancePrice()
					+ " - " + "Travel cost : "
					+ calculateTripPrice(fuelPrice, distance));

		} else if (100 <= ID && ID < 1000) {
			System.out.println("0" + VehicleMonitor.ID + " - " + model + ","
					+ yearProduced + "," + color);
			System.out.println("Insurance cost : " + getInsurancePrice()
					+ " - " + "Travel cost : "
					+ calculateTripPrice(fuelPrice, distance));

		} else if (1000 <= ID && ID < 10000) {
			System.out.println(VehicleMonitor.ID + " - " + model + ","
					+ yearProduced + "," + color);
			System.out.println("Insurance cost : " + getInsurancePrice()
					+ " - " + "Travel cost : "
					+ calculateTripPrice(fuelPrice, distance));

		}
	}

}
