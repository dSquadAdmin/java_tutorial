package numbers;

/**
 * Created by ksv on 11/14/16.
 */
public class DecimalToBinary {
    private int decimalNum;
    private int [] binaryValue;
    private int numOfBits;

    public DecimalToBinary(int n){
        this.decimalNum = n;
        binaryValue = new int[8];
        compute();
    }

    private void increseIndex(int index){
        int[] temp = new int[index-1];
        for (int i=0; i<index-1; i++){
            temp[i] = binaryValue[i];
        }
        binaryValue = new int[index];

        for (int i=0; i<index-1; i++){
            binaryValue[i] = temp[i];
        }
    }
    private void compute(){
        int count = 0;
        int tempDecimal = this.decimalNum;
        while(tempDecimal != 0){
            binaryValue[count] = tempDecimal%2;
            tempDecimal = (tempDecimal-binaryValue[count])/2;
            count++;

            if(count>=8){
                increseIndex(count);
            }
        }

        this.numOfBits = count;
    }

    public void dsplay(){
        System.out.println("Decimal "+decimalNum +" has equivalent binary value");
        for(int i = numOfBits-1; i >=0; i--){
            System.out.print(binaryValue[i]);
        }
        System.out.println();
    }
}
