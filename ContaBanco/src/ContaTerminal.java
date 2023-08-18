import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

        final String agencyBank = "067-8";

				
		System.out.println("Por favor, digite o número da agência: ");
		int account = sc.nextInt();	
		sc.nextLine();		
		System.out.println("Por favor insira o seu nome: ");
		String name = sc.nextLine();
        System.out.println("Por favor insira o seu saldo inicial: ");
        double balance = sc.nextDouble();
		
        

		System.out.println("Olá " + name + ", " + "obrigado por criar uma conta em nosso banco, sua agência é " + agencyBank + ", conta " + 
        account + " e seu saldo " + balance + " já está disponivel para saque"
        );
		
		sc.close();		
		
		
	}

}
