package okeHi;

import org.junit.*;
import static org.junit.Assert.*;

import java.awt.Color;

public class AutoTest { //DAS AUTOOO!!! //C++ ist besser!
								//private:
	private Auto a;				//Auto* a;
	private Auto a2;			//Auto* a2;
								//public: 
	
	@Before
	public void bef(){			//void bef()
		a = new Auto(); 		//a = new Auto();
	}
	
	@Test
	public void testKonst(){ 	//void tk()
		Assert.assertEquals("Ford", a.getType());
		Assert.assertEquals(160, a.getLeistung());
		Assert.assertEquals(Color.red, a.getFarbe());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testKonst2(){
		a2 = new Auto(null, null, -1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSetter(){
		a.setFarbe(null);
		a.setType(null);
		a.setLeistung(-1);
	}
	
	@Test
	public void testts(){ 	//void ts()
		Assert.assertEquals("Ford, rot, 160PS", a.toString());
	}
	
	@Test
	public void testBlack(){ 	//void ts()
		a = new Auto("Ford", Color.black, 160); 
		Assert.assertEquals("Ford, black, 160PS", a.toString());
	}
}
