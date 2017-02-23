import java.util.Calendar;


public class Car {
	String carBrand;
	String carModel;
	int hrsPowers;
	int manufactYear;
	public int insuranceCategory(){
		int carAge = Calendar.getInstance().get(Calendar.YEAR) - manufactYear;
		if (carAge <= 8) return 1;
		if (carAge > 8 && carAge <= 15) return 2;
		if (carAge > 15 && carAge <= 25) return 3;
		if (carAge >= 15) return 4;
		return -1;
	}
	public int carTaxes(){
		int insuranceCategory = insuranceCategory();
		if (insuranceCategory == 1) {
			if (hrsPowers <= 80){
			    return (150 + 150/5);
			}
			if (hrsPowers >= 140){
				return (150 + (150*45)/100);
				}
		}
		if (insuranceCategory == 2) {
			if (hrsPowers <= 80){
				return (200 + 200/5);
				}
			if (hrsPowers >= 140){
				return (200 + (200*45)/100);
				}
		}
		if (insuranceCategory == 3) {
			if (hrsPowers <= 80){
				return (300 + 300/5);
				}
			if (hrsPowers >= 140){
				return (300 + (300*45)/100);
				}
		}
		if (insuranceCategory == 4) {
			if (hrsPowers <= 80){
				return (500 + 500/5);
				}
			if (hrsPowers >= 140){
				return (500 + (500*45)/100);
				}
		}
		return -1;
	}
}
