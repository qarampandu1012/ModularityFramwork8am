package demoTestng;
import org.testng.ITestNGMethod;
import org.testng.annotations.Test;

public class TestClass {

    @Test(priority = 4)
    public void testMethod1() {
        // Your test logic here
    }

    @Test(priority = 2)
    public void testMethod2() {
        // Your test logic here
    }

    public static void main(String[] args) {
        // Assuming you have an instance of the test class
        TestClass testClass = new TestClass();

        // Get the class object
        Class<?> clazz = testClass.getClass();

        // Get all methods with @Test annotation
        java.lang.reflect.Method[] methods = clazz.getMethods();
        for (java.lang.reflect.Method method : methods) {
            Test testAnnotation = method.getAnnotation(Test.class);
            if (testAnnotation != null) {
                int priority = testAnnotation.priority();
                System.out.println("Method: " + method.getName() + ", Priority: " + priority);
            }
        }
    }
}
