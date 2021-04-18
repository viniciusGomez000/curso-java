import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

class Programa {
	
	private static int opcao = 0;
	private static Map<String, Carro> carros = new HashMap<>();
	static Scanner scanner = new Scanner(System.in);
	static String valor = "";

	public static void programa(){
	System.out.println("Bem vindo ao sistema de estacionamento !");
		do {
			exibir();
			if(valor.equals("1") || valor.equals("2") || valor.equals("0")){
				opcao = Integer.parseInt(valor);
			} else {
				programa();
				break;
			}
			if(opcao==1){
				System.out.println("Você entrou no estacionamento");
				System.out.println("Digite a placa do veiculo que vai entrar!");
				Carro carro = new Carro();
				carro.setPlaca(scanner.next());
				carros.put(carro.getPlaca(), carro);
			} else if(opcao==2){
				System.out.println("Digite a placa do veiculo que vai sair !");
				String placaSaida = scanner.next();

				if (carros.containsKey(placaSaida)){
					carros.remove(placaSaida);
					System.out.println("Removido o carro " + placaSaida);
				}
				// for(Carro c : carros) {
				// 	if(c.getPlaca().equals(placaSaida)){
				// 		carros.remove(c);

				// 	}
				// 	System.out.println("chegou aqui 1");
				// }
				// System.out.println("chegou aqui 2");
			} else if(opcao==6){
				// for(Carro c : carros) {
				// 	System.out.println(c.getPlaca());
				// }
			} else if(opcao==0){
				System.out.println("Você está fora do sistema");
			} else {
				System.out.println("Opcao invalida");
			}

		}while(opcao!=0);
	}
	
	public static void main(String[] args){
		programa();
	}

	private static void exibir(){
		System.out.println("Escolha uma opcao: [1] Entrada | [2] Saida [3] " +
		"Permanencia [4] Qtd de carros [5] Remover [6] Listar [0] Sair");
		valor = scanner.next();
	}

}