package kata.karate_chop.strategys;

import kata.karate_chop.strategys.bean.SearchData;

public class SearchIterativeBinary implements Search{
	private static final int INIT_ARRAY = 0;
	public SearchData searchData;
	private static final int NOT_FOUND = -1;

	public int chop(int data, Integer[] list) {
		if(isEmpty(list)){
			return NOT_FOUND;
		}
		return calculateIterativeBinarySearch(data, list);
	}

	private boolean isEmpty(Integer[] list) {
		return list.length ==0;
	}

	private int calculateIterativeBinarySearch(int data, Integer[] list) {
		this.searchData = new SearchData(data,list);
		int from = INIT_ARRAY;
		int to = list.length-1;
		int position = INIT_ARRAY;
		
		while(!crossIndex(from, to)){
			position = calculatePosition(from, to);
			if(isEquals(position)){
				return position;
			}
			if(isGreater(position)){
				to = --position;
			}
			if(isLower(position)){
				from = ++position;
			}	
		}
		return NOT_FOUND;
	}
	
	private boolean crossIndex(int from, int to) {
		return from >to;
	}

	private boolean isLower(int position) {
		return searchData.getElements()[position] <searchData.getData();
	}

	private boolean isGreater(int position) {
		return searchData.getElements()[position] > searchData.getData();
	}

	private boolean isEquals(int position) {
		return searchData.getElements()[position] == searchData.getData();
	}

	private int calculatePosition(int from, int to) {
		return ((to -from)/2)+from;
	}
}