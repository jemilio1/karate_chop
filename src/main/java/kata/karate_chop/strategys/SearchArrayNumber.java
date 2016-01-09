package kata.karate_chop.strategys;

import java.util.Arrays;

public class SearchArrayNumber implements Search{
	private static final int NOT_FOUND = -1;

	public int chop(int data, Integer[] list) {
		int position =Arrays.binarySearch(list, data);
		if(position < 0){
			position = NOT_FOUND;
		} 
		return position;
	}

}
