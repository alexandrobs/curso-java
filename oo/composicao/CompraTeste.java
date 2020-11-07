package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		
		Compra c1 = new Compra();
		c1.cliente = "João";
		
//		c1.itens.add(new Item("caneta", 90, 2.99));
//		c1.itens.add(new Item("borracha", 80, 5.99));
//		c1.itens.add(new Item("livros", 89, 9.80));
		//ou
		c1.adicionarItem(new Item("cadernos", 190, 0.99));
		c1.adicionarItem(new Item("apontador", 90, 0.39));
		//ou
//		c1.adicionarItem("mochila", 100, 11.99);
//		c1.adicionarItem("lancheira", 50, 4.99);
		System.out.println(c1.itens.size());
		System.out.println(c1.obterValorTotal());
		
		//só pra mostrar a relação bidirecional
		double total = c1.itens.get(0).compra.itens.get(1).compra.obterValorTotal();
		System.out.println("O total é: " + total);
		
//		System.out.println(c1.itens.get(0));
//		System.out.println(c1.itens.get(1).nome +"\n" +c1.itens.get(1).preco +"\n" +c1.itens.get(1).quantidade);
//		System.out.println(c1.itens.get(0).preco);
//		System.out.println(c1.itens.get(0).nome);
//		System.out.println(c1.itens.get(0).quantidade);
//		System.out.println(c1.itens.get(2).nome);
//		System.out.println(c1.itens.get(3).nome);
//		System.out.println(c1.itens.get(4).nome);
//		System.out.println(c1.itens.get(5).nome);
//		System.out.println(c1.itens.get(6).nome);
//		System.out.println(c1.itens.get(0).compra);
		
		
	}
}
