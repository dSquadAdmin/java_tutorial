package prime;
class PrimeNum{
	private static int counter = 0;
	private boolean isPrime(int number){
		if(number ==1)
			return true;

		if(number ==0)
			return false;

		for(int i=2; i<number; i++){
			if((number%i) == 0)
				return false;
		}

		return true;
	}
	
	public void findPrimeInRange(int num1, int num2){
		for(int number=num1; number<=num2; number++){
			if(isPrime(number)){
				System.out.print(number+",");
				counter++;
			}
		}
		System.out.println("\nTotal Prime Numers Found: "+counter);
	}
	
}
