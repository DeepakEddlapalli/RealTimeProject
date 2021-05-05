import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
public class JUnitTest {
    @Test
    public void testcase1() {
       // String welcomeMessage ="Welcome to jUnit";
    	GreetMessenger greetMsg = new GreetMessenger("Welcome to JUnit");
        assertEquals("Welcome to JUnit",greetMsg.getGreeting());
    }
    @Test
   public void testcase2() {
        String welcomeMessage ="Welcome to JUnit";
       assertEquals("Welcome to JUnit",welcomeMessage);
       System.out.println("passed");
    }
@Test
public void testcase3() {
	int empno=7839;
	String empname="KING";
	String empjob="PRESIDENT";
	 
	assertEquals("PRESIDENT",empjob);
	System.out.println("empjob passed..");
	
	assertTrue(empno>1000);
	System.out.println("empno passed..");
	
	assertNotNull(empname);
	System.out.println("empname passed..");
	
	System.out.println("testSomeAssertions is over...");
	
}
	
}