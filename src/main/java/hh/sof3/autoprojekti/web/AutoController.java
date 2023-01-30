package hh.sof3.autoprojekti.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import hh.sof3.autoprojekti.domain.Auto;

@Controller
// ei @ResponseBody
public class AutoController {

	// metodi lähettää selaimeen autolistan sisältävän html-dokumentin
	// http://localhost:8080/autolista
	@GetMapping("/autolista")
	public String getCarList(Model model) {
		// tietokantaa ei vielä käytössä, luon autolistan
		List<Auto> autot = new ArrayList<Auto>(); // luodaan tyhjä lista
		autot.add(new Auto("Tesla", 2022));
		autot.add(new Auto("Saab", 1986));
		model.addAttribute("autot", autot);
		
		System.out.println(autot);
		return "auto-lista"; // auto-lista.html
	}
}
