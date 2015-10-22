package data;

import java.util.Hashtable;

public class GoodsRoman {

	private static Hashtable<String, String> goodsRoman = new Hashtable<String, String>();

	public void setGoodsRoman(String goods, String roman) {
		goodsRoman.put(goods, roman);
	}

	public String getRoman(String key) {

		return goodsRoman.get(key);
	}

	public boolean hasGoods(String goods) {

		return goodsRoman.containsKey(goods);
	}

	public boolean hasRoman(String roman) {

		return goodsRoman.containsValue(roman);
	}

}









package data;

import java.util.Hashtable;

public class GalacticRoman {
	private static Hashtable<String, String> galRoman = new Hashtable<String, String>();

	public void setGalacticRoman(String gal, String roman) {
		
		galRoman.put(gal, roman);
	}

	public String getRoman(String key) {

		return galRoman.get(key);
	}

	public boolean hasGalactic(String gal) {

		return galRoman.containsKey(gal);
	}

	public boolean hasRoman(String roman) {

		return galRoman.containsValue(roman);
	}


}
