package test.com.interface21.context.support; 

import junit.framework.Test; 
import junit.framework.TestSuite; 
import junit.framework.TestCase; 

/** 
* ClassPathXmlApplicationContextTest Tester. 
* 
* @author <Authors name> 
* @since <pre>10/21/2019</pre> 
* @version 1.0 
*/ 
public class ClassPathXmlApplicationContextTestTest extends TestCase { 
public ClassPathXmlApplicationContextTestTest(String name) { 
super(name); 
} 

public void setUp() throws Exception { 
super.setUp(); 
} 

public void tearDown() throws Exception { 
super.tearDown(); 
} 



public static Test suite() { 
return new TestSuite(ClassPathXmlApplicationContextTestTest.class); 
}

    public void testCreateParentContext() {
    }

    public void testGetResourceByPath() {
    }

    public void testGetResourceBasePath() {
        System.out.println();
    }
}
