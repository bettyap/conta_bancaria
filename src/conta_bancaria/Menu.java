package conta_bancaria;

import java.util.Scanner;

import conta_bancaria.model.Conta;
import conta_bancaria.model.ContaCorrente;
import conta_bancaria.model.ContaPoupanca;
import conta_bancaria.util.Cores;

public class Menu {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcao;
		
		Conta c1 = new Conta( 1, 123, 1, "Victória Moraes", 100000.00f);
		c1.visualizar();
		System.out.println("Exibir o Saldo: " + c1.getSaldo());
		c1.setSaldo(200000.00f);
		c1.visualizar();
		c1.sacar(1000.00f);
		c1.visualizar();
		c1.depositar(5000.00f);
		c1.visualizar();
		
		ContaCorrente cc1 = new ContaCorrente(3, 456, 1, "Felipe", 100000.00f, 2000.00f);
		cc1.visualizar();
		cc1.sacar(101000.00f);
		cc1.visualizar();
		
		ContaPoupanca cp = new ContaPoupanca(3, 123, 2, "Betty", 200000.00f, 21);
		cp.visualizar();
		

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
				case 1 -> System.out.println(Cores.TEXT_WHITE + "Criar Conta");
				case 2 -> System.out.println("Listar todas as Contas");
				case 3 -> System.out.println("Consultar dados da Conta - por número");
				case 4 -> System.out.println("Atualizar dados da Conta");
				case 5 -> System.out.println("Apagar a Conta");
				case 6 -> System.out.println("Saque");
				case 7 -> System.out.println("Depósito");
				case 8 -> System.out.println("Transferência entre Contas");
				default -> System.out.println("\nOpção Inválida! Tente novamente\n");
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
