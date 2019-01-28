package multithreading.completeablefuture;

import java.util.concurrent.CompletableFuture;

public class CompleteableFutureExample {

	public static void main(String[] args) {
		CompletableFuture.supplyAsync(() -> printName("Rokin"))
				.thenApply(firstName -> addLastName(firstName, "Maharjan"));
		
		System.out.println("Tasks called in separate thread using CompleteableFuture");
	}

	private static String printName(String firstName) {
		System.out.println(firstName);
		return firstName;
	}
	
	private static String addLastName(String firstName, String lastName) {
		String name = firstName.concat(" ").concat(lastName);
		System.out.println(name);
		
		return name;
	}


}
