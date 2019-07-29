//Wli Akbar
//Project 1
//CCNY


import java.util.Scanner;

public class TestHeartRates {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String first;
		String second;
		int birth_year;
		System.out.print("Person's first name: ");
		first=input.nextLine();
		System.out.print("Person's last name: ");
		second=input.nextLine();
		System.out.print("Person's Year of birth: ");
		birth_year=input.nextInt();
		
		
		HeartRates person=new HeartRates(first,second,birth_year);
		
		System.out.printf("%nFirst name: %s%nLast name: %s%nAge: %s%n",
				person.get_fname(),person.get_lname(),person.age());
		System.out.printf("Maximum Heart Rate: %d%nTarget Heart Rate Range: %s%n", 
				person.max_rate(),person.target_rate());
		
		input.close();
		
		
		
		
	}

}
