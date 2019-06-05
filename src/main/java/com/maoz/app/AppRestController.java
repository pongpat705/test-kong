package com.maoz.app;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AppRestController {

	
	@RequestMapping(value = "/carlist", method = RequestMethod.GET)
	public Map<String, Object> getCarList(){
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		resultMap.put("Mazda", "RX-7");
		
		return resultMap;
	}
	
	@RequestMapping(value = "/car", method = RequestMethod.GET)
	public Map<String, Object> car(){
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		resultMap.put("Mazda", "RX-7");
		
		return resultMap;
	}
	
}
