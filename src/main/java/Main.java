import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        
        int number = getInputNumber();
        
        int sum = sumOfNumbers(number);

        int sum2 = gaussianSumOfNumbers(number); 
        
        System.out.println(sum);
        System.out.println(sum2);

    }
    
    // do this one and the lab is complete. really.
    // return the sum of 0 to n... if n == 3, the result should be 6
    static int sumOfNumbers(int n) {
        long start = System.currentTimeMillis();
        int hold = 0;
        for(int i =0; i <= n; i++){
            hold = hold + i;
        }
        long end =  System.currentTimeMillis() - start; 
        System.out.format("Loop took %d milliseconds to run\n", end);

        return hold;
    }
    
    
    static int getInputNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");

        // This method reads the number provided using keyboard
        int num = scan.nextInt();

        // Closing Scanner after the use
        scan.close();
        return num;
    }
    
    
    
    // for Extra Credit
    static int gaussianSumOfNumbers(int n) {
        long start = System.currentTimeMillis();
        n = n*(n+1)/2;
        long end =  System.currentTimeMillis() - start;
        System.out.format("Gaussian sum took %d milliseconds to run\n", end);
        return n;
    }
   
    // for Extra extra credit - compare the methods and show which one is faster
    // google "how to time some java code"
    // use "System.currentTimeMillis()" to ask the system what time it is.

    //Enter any number: 100000000
    //Loop start time1687994590733
    //Loop end time1687994590802
    //Gauss start time1687994590802
    //Gauss end time1687994590802
}
