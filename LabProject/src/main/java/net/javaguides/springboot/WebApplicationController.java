/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.javaguides.springboot;

import static java.rmi.Naming.list;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author jgabrantes
 */
@Controller
@EnableScheduling
public class WebApplicationController {
        @Autowired
        private AirplaneRepository airplaneRepo;
                
        private static final Logger log = LoggerFactory.getLogger(WebApplicationController.class);
        private static String uri = "https://opensky-network.org/api/states/all?lamin=45.8389&lomin=5.9962&lamax=47.8229&lomax=10.5226";
        
        public static List<Airplane> tmp = new ArrayList<Airplane>();  
      
        @Scheduled(fixedRate=10000)
        public void getFromAPI(){
           RestTemplate restTemplate = new RestTemplate();          
           Flights vectors = restTemplate.getForObject(uri, Flights.class);           
           tmp = vectors.getFlights();
           for(Airplane plane : tmp){
               airplaneRepo.save(plane);
           }           
        }
        @GetMapping("/")
	public String AppController(Model model) {  
            List<Airplane> planes = new ArrayList<Airplane>();
            planes = (List<Airplane>) airplaneRepo.findAll();
            model.addAttribute("flights", planes);
            return "index";
	}      
        
}