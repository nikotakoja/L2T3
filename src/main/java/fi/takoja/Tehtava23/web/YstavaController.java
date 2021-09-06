package fi.takoja.Tehtava23.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import fi.takoja.Tehtava23.domain.Ystava;

@Controller
public class YstavaController {
	
	private ArrayList<Ystava> ystavat = new ArrayList<>();
	
	@GetMapping("/index")
	public String lisaaYstava(Ystava ystava, Model model) {
		model.addAttribute("ystava", ystava);
		model.addAttribute("ystavat", ystavat);
		return "hello";
	
	}
	
	@PostMapping("/index")
	public String ystavaLisatty(Ystava ystava, Model model) {
		if (ystava != null) {
			ystavat.add(ystava);
		}
		model.addAttribute("ystava", ystava);
		model.addAttribute("ystavat", ystavat);

		return "lisatty";
	}
}
