package galacticData;

public class DataHandler {

	private String[] words;

	public DataHandler(String line) {

		words = line.split(" ");

		if (Search.hasRoman(words)) {

			GalacticNoHandler galacticNo = new GalacticNoHandler(words);
		} else if (Search.hasGalacticNo(words)) {

			GoodsHandler goods = new GoodsHandler(words);

		}

	}

}



package galacticData;

import java.util.Arrays;



public class RomanIntConvertor {
	
	public static final String[] Roman = {"I","V","X","L","C","D","M"} ;
	public static final int[] Integer={1,5,10,50,100,500,1000};
	private static String roman;
	private static int temp;	
	
		
	public static String getRoman(int number)
		{
		int search = Arrays.binarySearch(Integer,number);
		
		if(search >= 0){
			roman = Roman[search];
		} 
		
		return roman;
	}
	
	public static int getInt(String roman){
		
		return 0;
		
		
	}
	
//	public 
	

}




package galacticData;

public class RomanToInt {
	
	private String Roman;
	private int integer;
	
	public RomanToInt(String r, int i){
		
		Roman = r;
		integer = i;
	}
	
	}




package galacticData;

public class RomanToInt {
	
	
	
	private String Roman;
	private int integer;
	
	public RomanToInt(String r, int i){
		
		Roman = r;
		integer = i;
	}
	
	public String getRoman(){
		
		return Roman;
	}
	
public int getInt(){
		
		return integer;
	}
	
	}
