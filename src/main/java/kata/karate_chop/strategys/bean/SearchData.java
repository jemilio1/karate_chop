package kata.karate_chop.strategys.bean;

public class SearchData {
	private Integer[] elements;
	private Integer data;
	
	public SearchData(Integer data, Integer[] elements){
		this.data = data;
		this.elements = elements;
	}

	public Integer[] getElements() {
		return elements;
	}

	public Integer getData() {
		return data;
	}
	
}
