import java.util.Calendar;


public class VehicleMonitor {
	private String type;
	private String model;
	private int power;
	private float fuelConsumption;
	private int yearProduced;
	private int licenseNO;
	private float weight;
	private String color;
	private static String ID = "0000";

	VehicleMonitor(String type,String model,int power,float fuelConsumption,int yearProduced,int licenseNO){
		this.type = type;
		this.model = model;
		this.power = power;
		this.fuelConsumption = fuelConsumption;
		this.yearProduced = yearProduced;
		this.licenseNO = licenseNO;
		weight = 2;
		color = "N/A";
	}
	VehicleMonitor(String type,String model,int power,float fuelConsumption,int yearProduced,int licenseNO,float weight,String color){
		this.type = type;
		this.model = model;
		this.power = power;
		this.fuelConsumption = fuelConsumption;
		this.yearProduced = yearProduced;
		this.licenseNO = licenseNO;
		this.weight = 2;
		this.color = "N/A";
	}
	
	private double computeTypeCoefficent(){
		if (type == "car"){
			return 1.00;
		}
		if (type == "suv"){
			return 1.12;
		}
		if (type == "truck"){
			return 1.20;
		} else if (type == "motorcycle"){
			return 1.50;
		}
		return 1.00;
		
	}
	public double calculateTripPrice(double fuelPrice, double distance){
		return (fuelConsumption/100.0)*distance*fuelPrice;
	}
	public double getInsurancePrice(){
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		double typeCoefficient = computeTypeCoefficent();
		int carAge = currentYear - yearProduced;
		return (0.16*power)*(1.25*carAge)*(0.05*fuelConsumption)*typeCoefficient;
	}

}
