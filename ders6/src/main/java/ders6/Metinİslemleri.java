package ders6;

import java.util.Locale;

public class Metinİslemleri {


	public static String buyukHarf(String metin) {

		return metin.toUpperCase(
				Locale.forLanguageTag("tr")
				);
	}

}