import java.util.Calendar;


public class VehicleMonitor {
	private String type;
	private String model;
	private int power;
	private float fuelConsumption;
	private int yearProduced;
	private float weight;
	private String color;
	private static String ID = "000-1";

	VehicleMonitor(String type,String model,int power,float fuelConsumption,int yearProduced){
		this.type = type;
		this.model = model;
		this.power = power;
		this.fuelConsumption = fuelConsumption;
		this.yearProduced = yearProduced;
		weight = 2;
		color = "N/A";
		incrementID();
	}
	VehicleMonitor(String type,String model,int power,float fuelConsumption,int yearProduced,float weight,String color){
		this.type = type;
		this.model = model;
		this.power = power;
		this.fuelConsumption = fuelConsumption;
		this.yearProduced = yearProduced;
		this.weight = weight;
		this.color = color;
		incrementID();
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
	private void incrementID(){
		if (Integer.parseInt(ID) + 1 < 10){
			ID = "000" + Integer.parseInt(ID) + 1;
		}
		if (Integer.parseInt(ID) + 1 < 100){
			ID = "00" + Integer.parseInt(ID) + 1;
		}
		if (Integer.parseInt(ID) + 1 < 1000){
			ID = "0" + Integer.parseInt(ID) + 1;
		}
		if (Integer.parseInt(ID) + 1 < 10000){
			ID = "" + Integer.parseInt(ID) + 1;
		}	
	}
	
	public void getDescription(double fuelPrice,double distance){
		System.out.println(ID + " - " + model + "," + yearProduced + "," + color);
		System.out.println("Insurance cost : " + getInsurancePrice() + " - " + "Travel cost : " +  calculateTripPrice(fuelPrice,distance));
	}

}
