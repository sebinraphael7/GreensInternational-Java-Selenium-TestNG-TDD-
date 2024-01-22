package genericUtilities;

import java.io.FileInputStream;
import java.util.Properties;

public class propertyFileUtility implements IPathConstant
{

	
	public String getDataFromPropertyFile (String key) throws Throwable
{
	FileInputStream fis=new FileInputStream(IPathConstant.propertyFilePath);
	Properties prop=new Properties();
	prop.load(fis);
	String Key=prop.getProperty(key);
	return Key;
}
}
