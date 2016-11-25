package prime;
class Main{
	public static void main(String[] args){
		if(args.length<2){
			System.out.println("Syntax: java -jar primenum.jar num1 num2\n Such that num1<num2");
			return;
		}
		
		PrimeNum primeNum = new PrimeNum();
		try{
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			primeNum.findPrimeInRange(num1, num2);
		}
		catch(Exception e){
			System.out.println("Syntax: java Main num1 num2\n Such that num1<num2");
		}
	}
}
