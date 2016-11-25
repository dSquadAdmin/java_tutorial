package maxmin;

class MaxMin{
	private double minValue(double num1, double num2){
		return (num1<num2)?num1:num2;
	}
	
	public double getMinimum(double num1, double num2, double num3){
		double temp = minValue(num1, num2);
		return minValue(temp, num3);
	}
	
	private double maxValue(double num1, double num2){
		return (num1>num2)?num1:num2;
	}
	
	public double getMaximum(double num1, double num2, double num3){
		double temp = maxValue(num1, num2);
		return maxValue(temp, num3);
	}
}

