package Example;

public class Test8_p {
	
	public static void main(String[] args) {
		
		User[] users = {
				new User("user01", "pass01", "김철수", 32, 'M', "010-1234-5678"), 
				new User("user02", "pass02", "이영희", 25, 'F', "010-5555-7777"), 
				new User("user03", "pass03", "황진이", 20, 'F', "010-9874-5632"), 
		};
		
		System.out.println("users list-------------------------------");
		
		for (User u : users) {
			System.out.println(u.toString());
		}
		
		
	}

}
