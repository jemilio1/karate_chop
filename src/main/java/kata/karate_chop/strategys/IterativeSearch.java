package kata.karate_chop.strategys;

public class IterativeSearch implements Search{
	private static final int NOT_FOUND = -1;

	public int chop(int data, Integer[] list) {
		for (int i =0;i<list.length;i++) {
			if(list[i] == data){
				return i;
			}
		}
		return NOT_FOUND;
	}

}
