package numswap;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by ksv on 12/4/16.
 */
public class NumSwap {
    private int num1;
    private int num2;

    // Swapping of values among two variables without using third temp variable

    /**
     * swapByXOR()
     * Function use the property of XOR :
     * A xor A = 0
     * if C = A xor B then
     * C xor B == A
     * C xor A == B
     * Swapping by XORing is the safest method for swapping with out third variable.
     *
     */
    public void swapByXOR(){
        System.out.println("Numbers before swap");
        System.out.println("NUM1: "+num1+"\tNUM2: "+num2);
        num1 = num1^num2;
        num2 = num1^num2;
        num1 = num1^num2;
        System.out.println("Numbers after swap");
        System.out.println("NUM1: "+num1+"\tNUM2: "+num2);
    }

    /**
     * swapBySum() :
     * Swaps the variables with the property
     * A-A =0
     * if C = A+B
     * then C-B == A
     * and C-A == B
     * But if the values A and B are very large, then the results may be unexpected since C > A and B and bit overflow
     * occurs.
     */
    public void swapBySum(){
        System.out.println("Numbers before swap");
        System.out.println("NUM1: "+num1+"\tNUM2: "+num2);
        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;
        System.out.println("Numbers after swap");
        System.out.println("NUM1: "+num1+"\tNUM2: "+num2);
    }

    /**
     * swapByMultiplicationDivision() :
     * Swaps the variables with the property
     * if C = AxB
     * then C/B == A
     * and C/A == B
     * But if the values A and B are very large, then the results may be unexpected since C > A and B and bit overflow
     * occurs. Another limitation is if one of the input is zero this technique fails.
     */
    public void swapByMultiplicationDivision(){
        System.out.println("Numbers before swap");
        System.out.println("NUM1: "+num1+"\tNUM2: "+num2);
        num1 = num1*num2;
        num2 = num1/num2;
        num1 = num1/num2;
        System.out.println("Numbers after swap");
        System.out.println("NUM1: "+num1+"\tNUM2: "+num2);
    }

    public void setNumbers(){
        try{
            Scanner in = new Scanner(System.in);
            System.out.print("Enter NUM1: ");num1=in.nextInt();
            System.out.print("Enter NUM2: ");num2=in.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Please enter valid integers");
            setNumbers();
        }
    }

    public static void main(String[] args) {
        NumSwap num = new NumSwap();
        num.setNumbers();
        num.swapByXOR();
        num.swapBySum();
        num.swapByMultiplicationDivision();
    }
}
