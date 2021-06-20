package methodPackageOne;

import methodPackage.testUtility;

public class runMain {

	public static void main(String[] args) {
		
		
		
		utilityOne uo = new utilityOne();
		
		uo.printSomething("abc", "xyz");
		
		int mul = uo.multiPly(12, 4, 3);
		
		System.out.println(mul);
		
		
		testUtility tu = new testUtility();
		
		tu.dosomething();
		
		
		

	}

}
