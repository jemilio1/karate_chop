package kata.karate_chop.strategys;

import kata.karate_chop.strategys.bean.SearchData;

public class SearchBinaryChop implements Search{
	public SearchData searchData;
	private static final int NOT_FOUND = -1;

	public int chop(int data, Integer[] list) {
		if(list.length ==0){
			return NOT_FOUND;
		}
		this.searchData = new SearchData(data,list);
		return binaryChop(0,list.length-1);
	}

	private int binaryChop(int from, int to){
		int position = calculatePosition(from, to);
		
		if(crossIndex(from, to)){
			return NOT_FOUND;
		}
		if(isEquals(position)){
			return position;
		}
		return continueSearching(position, to, from);
	}
	
	private int continueSearching(int position, int to, int from) {
		if(isGreater(position)){
			to = --position;
		}
		if(isLower(position)){
			from = ++position;
		}
		return binaryChop(from, to);
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