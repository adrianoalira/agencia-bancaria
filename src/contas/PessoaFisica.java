package contas;

public class PessoaFisica {
	public static void main(String[] args) {
		
		Conta cc1 = new Conta();
		cc1.setCliente("Adriano Lira");
		cc1.setSaldo(2530);
		System.out.println("Cliente: "+cc1.getCliente());
		cc1.exibirSaldo();
		cc1.sacar(235);
		cc1.exibirSaldo();
		
		System.out.println("------------------------------");
		Conta cc2 = new Conta();
		cc2.setCliente("Daiany Teles");
		cc2.setSaldo(8500);
		System.out.println("Cliente: "+cc2.getCliente());
		cc2.exibirSaldo();
		cc2.depositar(5000);
		cc2.exibirSaldo();
		
		System.out.println("------------------------------");
		System.out.println("TRANSFERÊNCIA:");
		System.out.println("Cliente   : "+cc1.getCliente());
		System.out.println("Favorecido: "+cc2.getCliente());
		cc1.transferir(cc2, 950);
		
		System.out.println("------------------------------");
		System.out.println("SALDO ATUALIZADO:");
		System.out.println("Cliente: "+cc1.getCliente());
		cc1.exibirSaldo();
		System.out.println("Cliente: "+cc2.getCliente());
		cc2.exibirSaldo();
		
		System.out.println("------------------------------");
		System.out.println("RELATÓRIO GERENCIAL:");
		Conta gerente = new Conta(); 
			double relatorio = gerente.soma(cc1.getSaldo(), cc2.getSaldo());
			System.out.println("Saldo total nas contas: "+relatorio);
		
		
	}

}
