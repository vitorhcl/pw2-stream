import java.util.*;
import java.util.stream.Collector;

public class ManipulacaoProdutos {

	public static void main(String[] args) {
		Produto p1 = new Produto();
		p1.setId(1);
		p1.setCategoria(CategoriaEnum.BEBIDA);;
		p1.setNome("Coca-cola");
		p1.setPreco(8);
		
		Produto p2 = new Produto();
		p2.setId(2);
		p2.setCategoria(CategoriaEnum.FRIOS);;
		p2.setNome("Bife");
		p2.setPreco(52);
		
		Produto p3 = new Produto();
		p3.setId(3);
		p3.setCategoria(CategoriaEnum.PADARIA);;
		p3.setNome("Pão");
		p3.setPreco(1);

		Produto p4 = new Produto();
		p4.setId(4);
		p4.setCategoria(CategoriaEnum.PADARIA);;
		p4.setNome("Croissant");
		p4.setPreco(8);
		
		Produto p5 = new Produto();
		p5.setId(5);
		p5.setCategoria(CategoriaEnum.HIGIENE);;
		p5.setNome("Shampoo");
		p5.setPreco(20);
		
		List<Produto> produtos = List.of(p1, p2, p3, p4, p5);
		
		Optional<Produto> existe = produtos.stream().filter(e -> e.getPreco() > 50).findFirst();
		
		if(existe.isPresent())
			System.out.println(existe.get().getNome() + " custa mais que R$ 50,00");
		
		List<Produto> bebidas = produtos.stream().filter(e -> e.getCategoria() == CategoriaEnum.BEBIDA).toList();
		
		System.out.println("Bebidas:");
		bebidas.forEach(e -> System.out.println(e.getNome()));
		
		long quantidadePadaria = produtos.stream().filter(e -> e.getCategoria() == CategoriaEnum.PADARIA).count();
		
		System.out.println("Existem " + quantidadePadaria + " produtos da categoria PADARIA");
	}

}
