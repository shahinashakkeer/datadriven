package testpackage;

import org.testng.annotations.Test;

import basepackage.baseclass;
import pagepackage.pageclass;
import utilities.Excelutil;

public class testclass {
	public class fbtest extends baseclass
	{
		@Test
		public void verifyLoginWithvalidCred()
		{
			//pageclass P1= new pageclass(driver);
			pageclass P1=new pageclass(driver);
			
			String xl="D:\\data.xlsx";


			String sheet="Sheet1";
			int rowCount= Excelutil.getRowCount(xl,sheet);
			
			
			for(int i=1;i<=rowCount;i++)
			{
				String UserName= Excelutil.getCellValue(xl,sheet,i,0);
				System.out.println("username---"+UserName);
				String Pwd=Excelutil.getCellValue(xl,sheet,i,1);
				System.out.println("password---"+Pwd);
				
				 P1.setvalues(UserName, Pwd);
				 P1.login();
			}
			
		}
	}
	}


