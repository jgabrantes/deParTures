/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.javaguides.springboot;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author jgabrantes
 */
@Controller
public class WebApplicationController {
        
        private static String uri = "https://opensky-network.org/api/states/all?lamin=45.8389&lomin=5.9962&lamax=47.8229&lomax=10.5226";
    
	@GetMapping("/")
	public String statesController(Model model) {
            RestTemplate restTemplate = new RestTemplate();
            System.out.print("ola");
            AllVectors vectors = restTemplate.getForObject(uri, AllVectors.class);
            List<Vector> tmp = vectors.getVectors();
            model.addAttribute("country", "Portugal");
            model.addAttribute("vectors", tmp);
            return "index";
	}
}