package series.fabonecci;

/**
 * Created by ksv on 11/13/16.
 */
public class Fibonacci {
    int num1;
    int num2;
    int temp;
    public Fibonacci(){
        this.num1 = 0;
        this.num2 = 1;
        this.temp = num2;
    }

    public void showFibonacci(int number){
        for (int i=0; i<number; i++){
            System.out.print(num2+"\t");
            temp = num2;
            num2 = num1 + num2;
            num1 = temp;
        }
    }
}
