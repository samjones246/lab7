public class TestCalculator{
	Calculator myCalc = new Calculator();
	public boolean testParser() {
		boolean additionTest = myCalc.x("12 + 5")==17;
		if (additionTest) {
			System.out.println("[ OK ] Parser adds correctly");
		}else {
			System.out.println("[FAIL] Parser fails to add.");
		}
		boolean multiplicationTest = myCalc.x("12 x 5") == 60;
		if (multiplicationTest) {
			System.out.println("[ OK ] Parser multiplies correctly.");
		}else {
			System.out.println("[FAIL] Parser fails to multiply.");
		}
		boolean operatorTest = myCalc.x("12 [ 3") == null;
		if(operatorTest) {
			System.out.println("[ OK ] Parser returns null for operators which are not supported.");
		}else {
			System.out.println("[FAIL] Parser does not return null for operators which are not supported.");
		}
		return additionTest && multiplicationTest && operatorTest;
	}
	public boolean testAdd() {
		myCalc.x = new Double(30);
		boolean positiveTest = myCalc.x(new Double(3)) == 33;
		if(positiveTest) {
			System.out.println("[ OK ] Calculator adds positive numbers correctly");
		}else {
			System.out.println("[FAIL] Calculator adds positive numbers incorrectly");
		}
		myCalc.x = new Double(-30);
		boolean negativeTest = myCalc.x(new Double(-3)) == -33;
		if(negativeTest) {
			System.out.println("[ OK ] Calculator adds negative numbers correctly");
		}else {
			System.out.println("[FAIL] Calculator adds negative numbers incorrectly");
		}
		return positiveTest && negativeTest;
	}
	public boolean testMultiplication() {
		myCalc.x = new Double(11);
		boolean positiveTest = myCalc.x((double)3) == 33;
		
		if(positiveTest) {
			System.out.println("[ OK ] Calculator mulitplies positive numbers correctly");
		}else {
			System.out.println("[FAIL] Calculator multiplies positive numbers incorrectly");
		}
		myCalc.x = new Double(-11);
		boolean negativeTest = myCalc.x((double)-3) == 33;
		if(negativeTest) {
			System.out.println("[ OK ] Calculator multiplies negative numbers correctly");
		}else {
			System.out.println("[FAIL] Calculator multiplies negative numbers incorrectly");
		}
		return positiveTest && negativeTest;
	}
}
