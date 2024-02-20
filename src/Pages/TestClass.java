package Pages;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestClass {

    @Test
    public void testMethod1() {
        // Your test logic here
    	System.out.println("Done1");
    }

    @Test
    public void testMethod2() {
        // Your test logic here
    	System.out.println("Done2");

    }

    @Test
    public void testMethod3() {
        // Your test logic here
    	System.out.println("Done3");

    }

    public static void main(String[] args) {
        TestClass testClass = new TestClass();

        // Define the order in which you want to run the tests dynamically
        List<String> testExecutionOrder = new ArrayList<>();
        testExecutionOrder.add("testMethod2");
        // testExecutionOrder.add("testMethod1");
        testExecutionOrder.add("testMethod3");

        // Disable specific tests
        disableTest(testExecutionOrder, "testMethod1");

        // Shuffle the list or reorder based on your runtime conditions
        // Collections.shuffle(testExecutionOrder);

        // Execute the tests in the defined order
        for (String methodName : testExecutionOrder) {
            if (shouldRunTest(methodName)) {
                executeTestMethod(testClass, methodName);
            } else {
                System.out.println("Test '" + methodName + "' skipped based on conditions.");
            }
        }
    }

    private static void executeTestMethod(TestClass testClass, String methodName) {
        try {
            testClass.getClass().getMethod(methodName).invoke(testClass);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean shouldRunTest(String methodName) {
        // Implement your condition to determine whether the test should be run
        // For example, check a configuration, environment variable, or any other condition
        return !disabledTests.contains(methodName);
    }

    // List to store disabled tests
    private static List<String> disabledTests = new ArrayList<>();

    private static void disableTest(List<String> testExecutionOrder, String methodName) {
        // Add the test to the list of disabled tests
        disabledTests.add(methodName);

        // Remove the test from the execution order
        testExecutionOrder.remove(methodName);
    }
}
