package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NetBanking {
	
	@GetMapping("bank/checkBal/{acNo}/{pin}")
	String	checkBalance(@PathVariable int acNo,@PathVariable int pin)
		{
			 if(pin<1000)
			 {				 
				 return "pin is invalid";
			 }
			
			return "u r bal is 10000";			
		}
		
		

}
