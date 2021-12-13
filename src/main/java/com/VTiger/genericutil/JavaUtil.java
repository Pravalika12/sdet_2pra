package com.VTiger.genericutil;

import java.util.Random;

import com.github.javafaker.Faker;

public class JavaUtil {
	public static JavaUtil objJavaUtil()
	{
		JavaUtil jv=new JavaUtil();
		return jv;
	}
	
	/**
	 * @author lenovo
	 * Description:this method generate random numbers
	 * @return random number
	 */
   public int genericRandomNumber()
   {
	   Random r=new Random();
	   return r.nextInt(1000);
   }
   /**
    * @author lenovo
    * @description this method generate all random characters,address,names
    * @return faker
    */
   
   public String getfullname()
   {
	   Faker faker = new Faker();
	   return faker.name().fullName();
   }
   /**
    *@author lenovo 
    *@description this method generate last name
    * @return faker
    */
   public String getlastName()
   {
	   Faker faker = new Faker();
	   return faker.name().lastName();
   }
   /**
    * @author lenovo
    * @return
    */
   public String getfirstName()
   {
	   Faker faker = new Faker();
	   return faker.name().firstName();
   }
   public String getPhonenumber()
   {
	   Faker faker = new Faker();
	   return faker.phoneNumber().cellPhone();
   }
   
   
}
