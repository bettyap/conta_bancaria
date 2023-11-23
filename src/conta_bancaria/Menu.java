package conta_bancaria;

import java.util.Scanner;

import conta_bancaria.controller.ContaController;
import conta_bancaria.model.Conta;
import conta_bancaria.model.ContaCorrente;
import conta_bancaria.model.ContaPoupanca;
import conta_bancaria.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		ContaController contas = new ContaController();

		int opcao, numero, agencia, tipo = 0, aniversario;
		String titular;
		float saldo, limite;

		while (true) {
			
			System.out.println(Cores.TEXT_CYAN_BRIGHT + Cores.ANSI_BLACK_BACKGROUND + "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                BANCO DO BRAZIL COM Z                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			
			System.out.print("Entre com a opção desejada: ");
			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println("\n                                                     ");
				System.out.println(Cores.TEXT_WHITE_BRIGHT + Cores.ANSI_BLACK_BACKGROUND + "  Banco do Brazil com Z - O seu Futuro começa aqui!  ");
				System.out.println("                                                     ");
				sair();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1: 
					System.out.println(Cores.TEXT_WHITE + "Criar Conta");
					
					System.out.print("Digite o número da Âgencia: ");
					agencia = leia.nextInt();
					
					System.out.print("Digite o nome do Titular: ");
					leia.skip("\\R");
					titular = leia.nextLine();
					
					System.out.print("Digite o tipo da Conta (1 - CC ou 2 - CP): ");
					tipo = leia.nextInt();
					
					System.out.print("Digite o tipo da Conta (1 - CC ou 2 - CP): ");
					tipo = leia.nextInt();
					
					
					System.out.print("Digite o Saldo da conta: ");
					saldo = leia.nextFloat();
					
					switch(tipo) {
						case 1 -> {
							System.out.print("Digite o limite da conta: ");
							limite = leia.nextFloat();
							contas.cadastrar(new ContaCorrente(contas.gerarNumero(), agencia, tipo, titular, saldo, limite));
						}
						case 2 -> {
							System.out.println("Digite o dia de Aniversário da conta: ");
							aniversario = leia.nextInt();
							contas.cadastrar(new ContaCorrente(contas.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
						}
					}
					
					break;
				case 2: 
					System.out.println("Listar todas as Contas");
					contas.listarTodos();
					break;
				case 3: 
					System.out.println("Consultar dados da Conta - por número");
					
					break;
				case 4: 
					System.out.println("Atualizar dados da Conta");
					break;
				case 5: 
					System.out.println("Apagar a Conta");
					break;
				case 6: 
					System.out.println("Saque");
					break;
				case 7: 
					System.out.println("Depósito");
					break;
				case 8: 
					System.out.println("Transferência entre Contas");
					break;
				default:
					System.out.println("\nOpção Inválida! Tente novamente\n");
					break;
			}

		}
	}

	public static void sair() {
		System.out.println(Cores.TEXT_PURPLE_BRIGHT + Cores.ANSI_BLACK_BACKGROUND + "*****************************************************");
		System.out.println(Cores.TEXT_WHITE_BRIGHT + Cores.ANSI_BLACK_BACKGROUND + "                                                     ");
		System.out.println("             Projeto Desenvolvido por:               ");
		System.out.println("             Elisabeth Aparecida                     ");
		System.out.println("             https://github.com/bettyap              ");
		System.out.println("                                                     ");
		System.out.println(Cores.TEXT_PURPLE_BRIGHT + Cores.ANSI_BLACK_BACKGROUND + "*****************************************************");
		System.out.println("                                                     ");
	}

}
