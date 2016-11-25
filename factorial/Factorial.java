package factorial;

class Factorial{
	public int compute(int n){
		if(n == 1){
			return(1);
		}else{
			return (n*compute(n-1));		
		}
	}
}
