public class slotMachine {
	
		public static void main(String[] args) {
			
			int s1 = (int) (Math.random() *9 +1);
			int s2 = (int) (Math.random() *9 +1);
			int s3 = (int) (Math.random() *9 +1);
			
			System.out.println("Your number is: " + s1 + s2 + s3);
			
			if (s1 == s2 && s2 == s3)
				System.out.println("You got all " + s1 + "'s!");
			else if (s1 == s2)
				System.out.println("You got two " + s1 + "'s!");
			else if (s2 == s3)
				System.out.println("You got two " + s2 + "'s!");
			else if (s1 == s3)
				System.out.println("You got two " + s3 + "'s!");
			else
				System.out.println("No Matches!");
		}

}