package com.Boredapi.Boredapi.tests;
import com.Boredapi.Boredapi.helpers.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestPOST {
	
	private BoredServiceHelper boredServiceHelper;
	
     @BeforeClass	
     
     public void init() {
    	 boredServiceHelper = new BoredServiceHelper();
     }
     
     @Test
     public void testPostCreateActivity()
     {
    	 boredServiceHelper.createActivity().jsonPath().getString("key");
    	 System.out.println(key);
    	 assertNotNull(key,"key is not null");
    	 
    	 
     }

}
