package genericUtilities;

import org.apache.commons.lang3.RandomStringUtils;

public class javaUtility {
		
	public String randomString()
	{
		String generatedString=RandomStringUtils.randomAlphabetic(5);
//		System.out.println(generatedString);
		return generatedString;
		}
	
	public String randomNumber()
	{
		String generatedNumber=RandomStringUtils.randomNumeric(10);
//		System.out.println(generatedNumber);
		return generatedNumber;
	}
	
	public String randomAlphaNumeric()
	{
		String str=RandomStringUtils.randomAlphabetic(3);
		String num=RandomStringUtils.randomNumeric(3);
//		System.out.println(str+"@"+num);
		return (str+"@"+num);
	}
	}
