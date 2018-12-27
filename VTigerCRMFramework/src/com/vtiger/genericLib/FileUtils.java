package com.vtiger.genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtils {
	
	public void getPropertyObject() throws IOException
	{
		FileInputStream fis=new FileInputStream("./Test Data/CommonData.properties");
		Properties pObj=new Properties();
		pObj.load(fis);
	}
	
	public void getExcelData() throws FileNotFoundException
	{
		FileInputStream fis=new FileInputStream("./Test Data/TestData.xlsx");
		
	}

}
