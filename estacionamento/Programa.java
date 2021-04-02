import java.util.Scanner;

class Programa {
	
	
	private static int opcao = 0;
	
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bem vindo ao sistema de estacionamento !");

		

		do {
			
			System.out.println("Escolha uma opcao: [1] Entrada | [2] Saida [3] Permanencia [4] Qtd de carros [5] Remover [6] Listar [0] Sair");
			opcao = scanner.nextInt();
			
			if(opcao==1){
				System.out.println("Você entrou no estacionamento");
			} else if(opcao==2){
				System.out.println("Você saiu do estacionamento");
			} else if(opcao==0){
				System.out.println("Você está fora do sistema");
			} else {
				System.out.println("Opcao invalida");
			}
		
		}while(opcao!=0);
		
	}
}
