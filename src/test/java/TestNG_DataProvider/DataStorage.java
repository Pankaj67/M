package TestNG_DataProvider;

import org.testng.annotations.DataProvider;

public class DataStorage {
	
	
	
	@DataProvider
	public String[][] dataSender()
	{
		String[][] data= {{"admin","admin"},{"ad","admin"},{"standard_user","secret_sauce"}};
		return data; 
	}
	

	@DataProvider
	public String[][] Register()
	{
		String[][] data= {{"admin","admin"},{"ad","admin"},{"standard_user","secret_sauce"}};
		return data; 
	}
	

}
