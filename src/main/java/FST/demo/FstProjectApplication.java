package FST.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import FST.demo.entities.Product;

@SpringBootApplication
public class FstProjectApplication {
	
	
	//create list des produits
	public static List<Product> products = new ArrayList<>();

	public static void main(String[] args) {
		
		//create objects "elements"
		Product p1 = new Product(1,"BSH_SM12345678","ICT01", "2023-03-05","ICT","OK");
		Product p2 = new Product(2,"BSH_SM12346555","ICT01", "2023-02-07","ICT","NOK");
		Product p3 = new Product(3,"BSH_SM16965678","ICT01", "2024-02-03","ICT","OK");
		//remplir la liste
		products.add(p1);
		products.add(p2);
		products.add(p3);
		 
		SpringApplication.run(FstProjectApplication.class, args);
		
		System.out.println("all is good ");
	}

}
