package tests;

import static org.junit.Assert.*;
import static org.testng.Assert.assertEquals;

import org.junit.Test;

import lib.Converter;

public class ConverterTest {

		
		@Test
		public void testkmTomile() {
			int length=100;
			double exp=62.1;
			
			double act=Converter.kmTomile(length);
			assertEquals(exp,act,0.01);
	}
		@Test
		public void testCelToFar()
		{
			int temp=50;
			int exp=122;
			
			int act=Converter.cToF(temp);
			assertEquals(exp,act);
		}

}
