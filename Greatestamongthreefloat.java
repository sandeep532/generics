import java.util.*;
  
class Greatestamongthreefloat{
    
    // Function to find the biggest of three numbers
    static float biggestOfThree(float x, float y, float z)
    {
  
        return z > (x > y ? x : y) ? z : ((x > y) ? x : y);
    }
  
    // Main driver function
    public static void main(String[] args)
    {
  
        // Declaring variables for 3 numbers
        float a, b, c;
  
        // Variable holding the lagest number
        float largest;
 
	Scanner s = new Scanner(System.in);
	System.out.println("Enter Three numbers");
	a=s.nextFloat();
	b=s.nextFloat();
	c=s.nextFloat();
        // Calling the above function in main
        largest = biggestOfThree(a, b, c);
  
        // Printing the largest number
        System.out.println(largest+ " is the largest number.");
    }
}