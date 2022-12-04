package test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Product {

	private static Collectors collectors;

	public static void main(String[] args) {
		List<ProductList> li= new ArrayList<ProductList>();
		li.add(new ProductList(1,"sumsung",65000));
		li.add(new ProductList(2,"sumsung",6000));
		li.add(new ProductList(3,"sumsung",89000));
		li.add(new ProductList(4,"sumsung",70000));
		li.add(new ProductList(5,"sumsung",60000));
		li.add(new ProductList(6,"sumsung",50000));
		List<Integer> lobj=li.stream()
				.filter(p->p.price>50000)
				.map(p->p.price)
				.collect(collectors.toList());
		System.out.println("the product List above 50k"+lobj);
	}

}
