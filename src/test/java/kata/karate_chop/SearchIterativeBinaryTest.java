package kata.karate_chop;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import kata.karate_chop.strategys.SearchIterativeBinary;

public class SearchIterativeBinaryTest {
	private SearchChop number;
	
	@Before
	public void init(){
		number = new SearchChop(new SearchIterativeBinary());
	}
	@Test()
	public void testchopEmptyArray() {
		Integer[] listaNumeros = new Integer[]{};
		Assert.assertEquals("testchopEmptyArray", number.chop(3, listaNumeros) ,-1);  
	}

	@Test()
	public void testchopArray1Element() {
		Integer[] listaNumeros = new Integer[]{1};
		Assert.assertEquals("testchopArray1Element", number.chop(3, listaNumeros) ,-1);  
	}
	@Test()
	public void testchopArray1ElementFound() {
		Integer[] listaNumeros = new Integer[]{1};
		Assert.assertEquals("testchopArray1ElementFound", number.chop(1, listaNumeros) ,0);  
	}
	@Test()
	public void testchopArray2ElementNotFound(){
		Integer[] listaNumeros = new Integer[]{1,2};
		Assert.assertEquals("testchopArray1ElementFound", number.chop(3, listaNumeros) ,-1);
	}
	@Test()
	public void testchopArray2ElementFound(){
		Integer[] listaNumeros = new Integer[]{1,2};
		Assert.assertEquals("testchopArray1ElementFound", number.chop(1, listaNumeros) ,0);
	}
	@Test()
	public void testchopArray2ElementFound2(){
		Integer[] listaNumeros = new Integer[]{1,2};
		Assert.assertEquals("testchopArray1ElementFound", number.chop(2, listaNumeros) ,1);
	}
	
	@Test()
	public void testchopArray3ElementFound(){
		Integer[] listaNumeros = new Integer[]{1,2,3};
		Assert.assertEquals("testchopArray1ElementFound", number.chop(3, listaNumeros) ,2);
	}
	@Test()
	public void testchopArray3ElementNotFound(){
		Integer[] listaNumeros = new Integer[]{1,2,3};
		Assert.assertEquals("testchopArray1ElementFound", number.chop(4, listaNumeros) ,-1);
	}
	@Test()
	public void testchopArray5ElementFound(){
//		Integer[] listaNumeros = new Integer[]{1,2,3,4,5};
		Integer[] listaNumeros = new Integer[]{4,6,8,10,11};
		Assert.assertEquals("testchopArray1ElementFound", number.chop(7, listaNumeros) ,-1);
		Assert.assertEquals("testchopArray1ElementFound", number.chop(6, listaNumeros) ,1);
	}
	
}
