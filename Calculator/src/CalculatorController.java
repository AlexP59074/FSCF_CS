
public class CalculatorController {

	public static void main(String []args){
		float nOne, nTwo;
		
		Calculator alexsCalculator = new Calculator();
		
		nOne = Float.parseFloat(args[0]);
		nTwo = Float.parseFloat(args[1]);
		
		alexsCalculator.setNumOne(nOne);
		alexsCalculator.setNumTwo(nTwo);
		
		System.out.println("Added = " + alexsCalculator.add());
		System.out.println("Subtracted = " + alexsCalculator.subtract());
		System.out.println("Divided = " + alexsCalculator.divide());
		System.out.println("Multiplied = " + alexsCalculator.multiply());
	}
}
