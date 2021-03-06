package test_spring2020B18Automation.day09_testBase_properties_driverUtil1;

public class Singleton {
	
	private Singleton(){
	}
	
	private static String word;
	
	public static String getWord(){
		if(word == null){
			System.out.println("First call. Word object is null." +
					"Assigning value to word right now.");
			word = "something";
		}else{
			System.out.println("Word already has value");
		}
		return word;
		
	}
	
}