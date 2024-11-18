package concepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {

	@BeforeSuite
	public void beforesuite() {
		System.out.println("befoersuite");
	}
	@BeforeTest
    public void beforetest() {
		System.out.println("beforetest");
	}
	@BeforeClass
    public void beforeclass() {
    	System.out.println("beforeclass");
    }
	@BeforeMethod
    public void beforemethod() {
    	System.out.println("beforemethod");
	}
	@Test
    public void test1() {
    	System.out.println("test1");
	
    }
	@AfterMethod
    public void aftermethod() {
    	System.out.println("aftermethod");
	
    }
	@AfterClass
    public void afterclass() {
    	System.out.println("afterclass");
	
    }
	@AfterTest
    public void aftertest() {
    	System.out.println("aftertest");
    }
	@AfterSuite
    public void aftersuite() {
	System.out.println("aftersuite");
    }
	@BeforeSuite
    public void beforesuite1() {
    	System.out.println("beforesuite1");
	
    }
	@BeforeTest
    public void beforetest1() {
    	System.out.println("beforetest1");
	
    }
	@BeforeClass
    public void beforeclass1() {
    	System.out.println("beforeclass1");
	
    }
	@BeforeMethod
    public void beforemethod1() {
    	System.out.println("beforemethod1");
	
    }
	@Test
    public void test2() {
    	System.out.println("test2");
	
    }
	@AfterMethod
    public void aftermethod1() {
    	System.out.println("aftermethod1");
	
    }
	@AfterClass
    public void afterclass1() {
    	System.out.println("afterclass1");
	
    } 
	@AfterTest
    public void aftertest1() {
    	System.out.println("aftertest1");
	
    }
	@AfterSuite
    public void aftersuite1() {
    	System.out.println("aftersuite1");
	
    }

}
