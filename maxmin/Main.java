package maxmin;
class Main{
	private static Usage usage = new Usage();
	public static void main(String[] args){
		if(args.length<4){
			usage.printInfo();
			return;
		}
		double num1, num2, num3;
		try{
			num1 = Double.parseDouble(args[1]);
			num2 = Double.parseDouble(args[2]);
			num3 = Double.parseDouble(args[3]);			
		}
		catch(Exception e){
			usage.printInfo();
			return;
		}
		
		MaxMin maxMin = new MaxMin();
		if(args[0].equals("-max")){
			double maxNum = maxMin.getMaximum(num1, num2, num3);
			System.out.println("Max. Number is: "+ maxNum);
		} 
		else if(args[0].equals("-min")){
			double minNum = maxMin.getMinimum(num1, num2, num3);
			System.out.println("Min. Number is: "+ minNum);
		}
			
	}
}
