
public class SwiftDate {
		int year;
		int month;
		int day;
		static int [] dayspermonth = {31,28,31,30,31,30,31,31,30,31,30,31}; // in a common year
		
		public boolean isLeapYear(){
			if(((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0 ){
				return true;
			}
			return false;
		}
		public static int isLeapYear(int yr){
			if(((yr % 4 == 0) && (yr % 100 != 0)) || yr % 400 == 0 ){
				return 1;
			}
			return 0;
		}
		static int sumOfSubArray(int [] arr,int i){
			int sum = 0;
			for (int j = i + 1;j < arr.length;j++){
				sum += arr[j];
			}
			return sum;
		}
		public int getCentury(){
			return (year/100 + 1);
		}
		public int getDaysDifference(SwiftDate other){
			int DiffinYearsbyDays = 0;
			for (int i = Math.min(year,other.year) + 1;i < Math.max(year,other.year);i++){
				DiffinYearsbyDays += 365 + isLeapYear(i);
			}
			int DiffinDays = 0;
			if (year == other.year){
				int daysToYearEnd = 0;
				int daysToEndYearOther = 0;
				for (int j = 0;j < dayspermonth.length;j++){
					if (j == month - 1){
						daysToYearEnd = dayspermonth[j] - day + sumOfSubArray(dayspermonth,j);
						if (j <= 1 && isLeapYear(year) > 0){
							daysToYearEnd += 1;
						}
					}
					if (j == other.month - 1){
						daysToEndYearOther = dayspermonth[j] - other.day + sumOfSubArray(dayspermonth,j);
						if (j <= 1 && isLeapYear(other.year) > 0){
							daysToEndYearOther+= 1;
						}
					}	
				}
				return DiffinDays = Math.abs(daysToYearEnd - daysToEndYearOther) + 1;
			} else {
				int daysToYearEnd = 0;
				int daysFromYearStart = 0;
				if (year > other.year){
					daysToYearEnd = dayspermonth[other.month - 1] - other.day + sumOfSubArray(dayspermonth,other.month - 1);
					daysFromYearStart = day + 365 - sumOfSubArray(dayspermonth,month - 2);
					if (month >= 2 && isLeapYear(year) > 0){
						daysFromYearStart += 1;
					}
					if (other.month <= 2 && isLeapYear(other.year) > 0){
						daysToYearEnd += 1;
					}
					return DiffinDays = daysToYearEnd + daysFromYearStart + DiffinYearsbyDays + 1;
				} else {
					daysToYearEnd = dayspermonth[month - 1] - day + sumOfSubArray(dayspermonth,month - 1);
					daysFromYearStart = other.day + 365 - sumOfSubArray(dayspermonth,other.month - 2);
					if (other.month >= 2 && isLeapYear(other.year) > 0){
						daysFromYearStart += 1;
					}
					if (month <= 2 && isLeapYear(year) > 0){
						daysToYearEnd += 1;
					}
					return DiffinDays = daysToYearEnd + daysFromYearStart + DiffinYearsbyDays + 1;
				}
				
			}	
		}
		public String getInfo(){
			if (!isLeapYear()){
			    if (day < 10 && month >= 10){
			       return (year + " " + month + " " +  "0" + day + " - " + getCentury() + " " + "century.");
			    } else if (day >= 10 && month >= 10){
				   return (year + " " + month + " " +  day + " - " + getCentury() + " " + "century.");	
			    } else if (day < 10 && month < 10){
				   return (year + " " + "0" + month + " " + "0" + day + " - " + getCentury() + " " + "century.");	
				} else {
				   return (year + " " + "0" + month + " " + day + " - " + getCentury() + " " + "century.");
				}
			} else {
				if (day < 10 && month >= 10){
				       return (year + " " + month + " " +  "0" + day + " - " + getCentury() + " " + "century." + "It is a LEAP year.");
				    } else if (day >= 10 && month >= 10){
					   return (year + " " + month + " " +  day + " - " + getCentury() + " " + "century." + "It is a LEAP year.");	
				    } else if (day < 10 && month < 10){
					   return (year + " " + "0" + month + " " + "0" + day + " - " + getCentury() + " " + "century." + "It is a LEAP year.");	
					} else {
					   return (year + " " + "0" + month + " " + day + " - " + getCentury() + " " + "century." + "It is a LEAP year.");
					}
				
			}
		}
}



