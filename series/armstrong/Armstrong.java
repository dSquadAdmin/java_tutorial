package series.armstrong;

import java.util.Map;

/**
 * Created by ksv on 11/13/16.
 */
public class Armstrong {
    private int pow(int base, int radix){
        int power = 1;
        for(int i=1; i<=radix; i++){
            power = power*base;
        }
        return power;
    }
    private int getDigitNumber(int num){
        int temp;
        int count = 0;
        while(num>0){
            temp = num%10;
            num = (num-temp)/10;
            count++;
        }
        return count;
    }

    public boolean isArmstrong(int number){
        int num1 = number;
        int count = getDigitNumber(number);
        int sum = 0;
        for(int i =1; i<=count; i++){
            int temp = number%10;
            sum = sum+pow(temp, count);
            number = (number-temp)/10;
        }
        if(sum == num1) {
            return true;
        }
        else{
            return false;
        }
    }

    public void showArmstrong(int number){
        for(int i =0; i<=number; i++) {
            if(isArmstrong(i)){
                System.out.print(i+"\t");
            }
        }
    }
}
