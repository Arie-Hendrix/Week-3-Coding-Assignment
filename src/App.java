
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Week 3 coding assignment
		
		//Section dedicated to declaring strings for the first, middle, and last name of an person
		String firstName = "Betsy";
		String middleInitial = " Q. ";
		String lastName = "Ross";
		
		//Concatenation of the strings to form a complete name
		String fullName = firstName + middleInitial + lastName;
		
		//Using the system to print out the complete name along with a greeting and introduction!
		System.out.println("Hi, my full name is " + fullName + '!');
		
		
		//Declaring the age of the person, the number of friends, and then finding how many they
		//gained per year
		int age = 34;
		double friends = 51;
		double friendsPerYear = (friends/age);
		
		//Printing the above values with a user-friendly message
		System.out.println("I am " + age + " years old, and have made " + friendsPerYear + " friends each year I've lived.");
		
	}

}
