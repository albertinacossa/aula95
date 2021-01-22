package aula95;

import java.util.Scanner;

public class ExecutaBanco {

	public static void main(String[] args) {
		
			Scanner entradaPorteclado = new Scanner(System.in);
			int contaDoCliente;
			String nomeDoCliente;
			double saldoInicial;
			double saldo;
			double deposito;
			double levantamento;
			
			cabecalho();
			
			System.out.println(" Informe o numero da conta");
			contaDoCliente = entradaPorteclado.nextInt();
			
			if (contaDoCliente == 654878) {
				System.out.println("Informe o titular da conta");
				nomeDoCliente = entradaPorteclado.nextLine();
				
				entradaPorteclado.nextLine();
				
				System.out.println("Pretende fazer um deposito inicial agora?");
				
				System.out.println();
				String respostaDigitada;
				String respostaDefinida = "s";
				respostaDigitada = entradaPorteclado.nextLine();
				
				if (respostaDigitada.equals(respostaDefinida)) {
					System.out.println(" Informe o valor que deseja deposita Inicial");
					
					saldoInicial = entradaPorteclado.nextDouble();
					System.out.println(" O teu Saldo Inicial eh: " + saldoInicial);
					
					System.out.println();
					
					saldo = + 400 + saldoInicial;
					System.out.println(" A Conta numero" +contaDoCliente+ ", pertecente ao "+nomeDoCliente+ "Saldo disponivel " +saldo );
					
					System.out.println();
					
					System.out.println("Indique o valor a depositar");
					deposito = entradaPorteclado.nextDouble();
					
					saldo = deposito + saldo;
					System.out.println(" Conta numero" + contaDoCliente + ", pertecente ao "+nomeDoCliente+ "Saldo disponivel " +saldo );
					
					System.out.println("Indique o valor a levantar");
					levantamento = entradaPorteclado.nextDouble();
					
					System.out.println();
					saldo = saldo -levantamento -7;
					System.out.println(" Conta numero " + contaDoCliente + ", pertecente ao " + nomeDoCliente + "Saldo disponivel eh " + saldo );
				
				}else System.out.println(" Resposta errada");
			}else System.out.println(" O numero numero errado. ");
			
			System.out.println();
			
			rodape();	
		}
				
	static void cabecalho() {
		System.out.println( "-----------BANCO COMERCIAL CERTO------------");
		System.out.println("----------- ADMINISTRACAO GERAL--------------");
		System.out.println("----------Direccao de Investimentos ----------");
	}
	static void rodape() {
		System.out.println(" Avenida 25 de Setembro. n. 223 - 1andar");
		System.out.println(" Contactos: Telefone - 84555888888/9  - email: bancocerto@gmail.com ");
	}
	}




		

			


