package FST.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import FST.demo.entities.Product;

//import static pour accéder directement aux elements de liste
import static FST.demo.FstProjectApplication.products;

@Controller
@RequestMapping("customer")
public class CustomerController {
	
	@RequestMapping("afficher")
	public String afficher(Model model) {
		
		String name = "Aymen";
		String prname = "is the Owner";
		
		model.addAttribute("nom",name);		
		model.addAttribute("surname",prname);
		
		//afficher les elements de la liste
		model.addAttribute("produits", products);
		
		return "afficher.html";
		
	}
	
	
	//get new element
	@GetMapping("add")
	public String ajouter() {
		return "ajouter.html";
	}
	
	//import elements from html page (ajouter.html)
	@PostMapping("add")
	public String addPrd(@RequestParam("sérial_number") String SN, @RequestParam("id_machine") String id_machine, @RequestParam("date") String date,
			@RequestParam("type de testeur") String type_test, @RequestParam("mouvement") String mvt) 
	{
		
		int lastid = products.size();
		int id = ++lastid;
		//auto-incrementation of id
		Product p= new Product(id,SN,id_machine,date,type_test,mvt);
		products.add(p);
		//redirction for afficher.html page directly after submit
		return "redirect:afficher";
	}
	
	
	@GetMapping("delete/{id}")
	public String supprimer(@PathVariable("id")int id) {
		for(Product p : products) {
			if(id==p.getId()) {
				products.remove(p);
				break;
			}
		}
		return "redirect:../afficher";
	}
	
	
	
	//take object and transfer them to modifier.html
	@GetMapping("update/{id}")
	public String modifier(@PathVariable("id") int id, Model model) {
		
		for(Product p : products) {
			if(id==p.getId()) {
				model.addAttribute("produit", p);
			}
		}
		return "modifier";
		
	}
	
	//set object elements to the list
	@PostMapping("update")
	public String mAjour(Product produit) {
		for(Product p : products) {
			if(p.getId()==produit.getId()) {
				p.setId(produit.getId());
				p.setSN(produit.getSN());
				p.setId_machine(produit.getId_machine());
				p.setDate(produit.getDate());
				p.setType_test(produit.getType_test());
				p.setMvt(produit.getMvt());
				
				/*products.set(products.indexOf(p), produit);*/
			}
		}
		return "redirect:afficher";
	}
	
	

}
