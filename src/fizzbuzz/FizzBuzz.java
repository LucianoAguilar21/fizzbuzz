package fizzbuzz;

public class FizzBuzz {

	String fizzBuzz ;

	public void FizzB(int numero) {
		for (int i = 1; i <=numero;i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				fizzBuzz = "FizzBuzz";	
				System.out.println(fizzBuzz);
				}
		}
	}
}