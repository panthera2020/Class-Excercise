import java.util.Scanner;

public class PersonTest {
	public static void main(String... args){
		Scanner input = new Scanner(System.in);

		Person myIdentity = new Person("Jane Doe", 25);

		System.out.println("Intial Name: " + myIdentity.getName() + "\n" + "Intial Age: " + myIdentity.getAge());
		System.out.println();
		
		System.out.println("Enter your name: ");
		String userName = input.nextLine();

		myIdentity.setName(userName);

		System.out.println();
		System.out.println("Enter your age: ");
		int userAge = input.nextInt();

		myIdentity.setAge(userAge);

		System.out.println();
		System.out.println("Name: " + myIdentity.getName() + "\n" + "Age: " + myIdentity.getAge());
	}
}