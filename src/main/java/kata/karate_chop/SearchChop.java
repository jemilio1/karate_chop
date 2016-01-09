package kata.karate_chop;

import kata.karate_chop.strategys.Search;

public class SearchChop {

	private Search search;

	public SearchChop(Search strategy){
		this.search = strategy;
	}

	public int chop(int data, Integer[] list){
	      return search.chop(data, list);
	}
}
