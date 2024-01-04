package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {

	
	
	

	@Test(dataProvider = "getData",dataProviderClass=Data_Provider.class)
	public void testData_Provider(String email, String pwd) {
		System.out.println(email+"   "+pwd);
	}


	
	/*@DataProvider(name = "getData")
	public Object[][] getData() {
		 Object[][] data ={ { "daeg@gmail.com", "avb" }, { "kurf@gmail.com", "iuwue" },{ "gsdt@gmail.com", "uryur" } };
		 return data;
	}*/
}

	
	
	
