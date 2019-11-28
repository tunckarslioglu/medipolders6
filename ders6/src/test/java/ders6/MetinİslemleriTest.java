package ders6;

import org.junit.*;


public class MetinİslemleriTest {

	@Test
	public void testbuyukHarf() {
         String sonuc = Metinİslemleri
        		 .buyukHarf("ali");
         Assert.assertEquals("ALİ", sonuc);

	}
	
}


