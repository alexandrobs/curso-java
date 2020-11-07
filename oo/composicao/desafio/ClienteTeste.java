package oo.composicao.desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("caneta", 9.99, 200);
		compra1.adicionarItem(new Produto("notebook", 200.00), 10);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("caderno", 19.99, 100);
		compra2.adicionarItem(new Produto("ssd", 300.00), 110);
		
		Compra compra3 = new Compra();
		compra3.adicionarItem("lápis", 0.99, 100);
		compra3.adicionarItem(new Produto("fone de ouvido", 33.00), 10);
	
		Cliente c1 = new Cliente("João");
		Cliente c2 = new Cliente("Maria");
		Cliente c3 = new Cliente("Sofia");
		
		c1.compras.add(compra1);
		c2.compras.add(compra2);
		c3.adicionarCompra(compra3);
		
		System.out.println("Valor total da compra do cliente:  " + c1.nome + " R$" + 
		c1.obterValorTotal());
		System.out.println("Valor total da compra do cliente:  " + c2.nome + " R$" +
		c2.obterValorTotal());
		System.out.println("Valor total da compra do cliente:  " + c3.nome + " R$" +
				c3.obterValorTotal());
		

	}

}
