import java.util.Scanner;
public class Main {
    
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		int num = 0;
		int cont = 0;
		System.out.println("Por favor, informe um número: ");
		num = console.nextInt();
		for(cont = 1; cont <= num; cont++) {
			if (cont % 3 ==0 & cont % 5 ==0) {
				System.out.println(cont);
			}
		}
		
		
		
		
		
	
	}

}
