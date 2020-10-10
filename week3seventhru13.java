package week3;

public class week3seventhru13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] greater = {10, 65, 60, 25, 30, 5, 0};	
		double [] lesser = {10, 20, 30, 40, 50, 60};
		double [] one = {10, 20, 30 , 40 , 55, 60};
		double [] two = {10, 20, 30, 40, 50, 60};
		
		System.out.println(trueIfOver(greater));
		
		System.out.println(createFullName("Cayden" , "Owens"));
		
		
		//8.	Write a method that takes two Strings, firstName and lastName, 
		//and returns a full name (the full name should be the first and the 
		//last name as a String separated by a space).
		

		String firstName = "Jim";
		String lastName = "Robsinon";
		String fullName = createFullName (firstName,lastName);
		System.out.println(fullName);
		
		System.out.println(createAverage(lesser));
		
		System.out.println(createAdvantage(one, two));
		
		System.out.println(willBuyDrink(true, 13));
		
		willYouRetire(true, 500000);
	}

		public static String createFullName(String x, String y) {
			return x+ " " + y;
	}
     //9.Write a method that takes an array of int and returns true 
     //if the sum of all the ints in the array is greater than 100.

		public static boolean trueIfOver (int [] numbers) {
			int total = 0;
			for (int number : numbers) { 
			total = total + number;
				}
				if (total > 100) {
					return true;
				}
					return false;
		}

		
		//10.	Write a method that takes an array of double and returns the average of all the elements in the array.
		
		
		public static double createAverage (double [] lesser) {
			double total = 0;
			double average = 0;
			for (double number : lesser) {
				total = (double) (total + number);
				average = total / lesser.length;
				
			}
			return average; 
			}
		
		
		// 11.	Write a method that takes two arrays of double and returns true if the average of the elements 
		 // in the first array is greater than the average of the elements in the second array.
		
		public static boolean createAdvantage (double [] one, double [] two) {
			double total = 0;
			double average = 0;
			double totals = 0;
			double averages = 0;
			for (double number : one) {
				total = (double) (total + number);
				average = total/one.length; }
			for (double numbers : two) {
				totals = (double) (totals + numbers); 
				averages = totals/two.length; }
			if (average > averages)	 {
				return true;
			}
				return false;
		}
			
		
		//12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
		//      and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	
		

		public static boolean willBuyDrink (boolean x, double y) {
			boolean isHotOutside;
			double moneyInPocket = 0;
			if (isHotOutside = true && moneyInPocket > 10.50) {
				return true;
			}
			else {
				return false;
			}
		}
		
		// 13.	Create a method of your own that solves a problem. 
		//	In comments, write what the method does and why you created it.
		//I created this method to have users enter in their current savings along with their desire to retire to see if they
		// can retire based on their current income
		
		public static boolean willYouRetire (boolean doYouWantToRetireNow, double howMuchDoYouHaveSaved) {
			boolean doYouWantToRetire;
			double moneyInRetirement = 0;
			if (doYouWantToRetire = true && howMuchDoYouHaveSaved > 400000) {
				System.out.println("You can retire now");
				return true;
			}
			else {
				System.out.println("You cannot retire right now");
				return false;
			}
		}
		
}




		
		
