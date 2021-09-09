package com.plantplaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handle the /start endpoint
 * @return
 *
 */
@Controller
public class PlantPlacesController {
	
	
	
	@RequestMapping("/start")
	public String start() {
		
	 return "start";
	}
	
	/**
	 * Handle the /start endpoint
	 * @return
	 *
	 */
	
	@RequestMapping("/start")
	public String index() {
		
	 return "start";
	}
}
