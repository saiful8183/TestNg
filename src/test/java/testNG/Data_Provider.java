package testNG;

import org.testng.annotations.DataProvider;

public class Data_Provider {

	
	
	@DataProvider(name = "getData")
	public Object[][] getData() {
		 Object[][] data ={ { "daeg@gmail.com", "avb" }, { "kurf@gmail.com", "iuwue" },{ "gsdt@gmail.com", "uryur" } };
		 return data;
	}
}
