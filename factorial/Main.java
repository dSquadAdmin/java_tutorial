package factorial;

import java.util.Scanner;

class Main{
	public static void main(String[] args){
        Factorial factorial = new Factorial();
		if(args.length<1){
			Scanner input = new Scanner(System.in);
            System.out.print("You didn't supplied any Number, please enter a number:");
			int n = input.nextInt();
            int factorialValue = factorial.compute(n);
            System.out.println("Factorial of "+ args[0] +" is "+factorialValue);
		}else{
			try{
				int factorialValue = factorial.compute(Integer.parseInt(args[0]));
				System.out.println("Factorial of "+ args[0] +" is "+factorialValue);
			}
			catch(Exception e){
				System.out.println("Arguement must be an integer\nSynatax: java -jar factorial.jar num");
			}
		}
	}
}
