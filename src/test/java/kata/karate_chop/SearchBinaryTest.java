package kata.karate_chop;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import kata.karate_chop.strategys.SearchBinaryChop;

public class SearchBinaryTest {
	private SearchChop number;
	
	@Before
	public void init(){
		number = new SearchChop(new SearchBinaryChop());
	}
	@Test()
	public void testbinaryChopEmptyArray() {
		Integer[] listaNumeros = new Integer[]{};
		Assert.assertEquals("testbinaryChopEmptyArray", number.chop(3, listaNumeros) ,-1);  
	}

	@Test()
	public void testbinaryChopArray1Element() {
		Integer[] listaNumeros = new Integer[]{1};
		Assert.assertEquals("testbinaryChopArray1Element", number.chop(3, listaNumeros) ,-1);  
	}
	@Test()
	public void testbinaryChopArray1ElementFound() {
		Integer[] listaNumeros = new Integer[]{1};
		Assert.assertEquals("testbinaryChopArray1ElementFound", number.chop(1, listaNumeros) ,0);  
	}
	@Test()
	public void testbinaryChopArray2ElementNotFound(){
		Integer[] listaNumeros = new Integer[]{1,2};
		Assert.assertEquals("testbinaryChopArray1ElementFound", number.chop(3, listaNumeros) ,-1);
	}
	@Test()
	public void testbinaryChopArray2ElementFound(){
		Integer[] listaNumeros = new Integer[]{1,2};
		Assert.assertEquals("testbinaryChopArray1ElementFound", number.chop(1, listaNumeros) ,0);
	}
	@Test()
	public void testbinaryChopArray2ElementFound2(){
		Integer[] listaNumeros = new Integer[]{1,2};
		Assert.assertEquals("testbinaryChopArray1ElementFound", number.chop(2, listaNumeros) ,1);
	}
	
	@Test()
	public void testbinaryChopArray3ElementFound(){
		Integer[] listaNumeros = new Integer[]{1,2,3};
		Assert.assertEquals("testbinaryChopArray1ElementFound", number.chop(3, listaNumeros) ,2);
	}
	@Test()
	public void testbinaryChopArray3ElementNotFound(){
		Integer[] listaNumeros = new Integer[]{1,2,3};
		Assert.assertEquals("testbinaryChopArray1ElementFound", number.chop(4, listaNumeros) ,-1);
	}
	@Test()
	public void testbinaryChopArray5ElementFound(){
//		Integer[] listaNumeros = new Integer[]{1,2,3,4,5};
		Integer[] listaNumeros = new Integer[]{4,6,8,10,11};
		Assert.assertEquals("testbinaryChopArray1ElementFound", number.chop(7, listaNumeros) ,-1);
		Assert.assertEquals("testbinaryChopArray1ElementFound", number.chop(6, listaNumeros) ,1);
	}
	
}
