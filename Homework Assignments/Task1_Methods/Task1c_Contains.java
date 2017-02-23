
public class Task1c_Contains {
	public static int Task1c_Contains(int [] Array,int element){
		for (int i = 0;i < Array.length;i++){
			if(Array[i] == element){
				return i;
			}
		}
		return -1;
	}

}
