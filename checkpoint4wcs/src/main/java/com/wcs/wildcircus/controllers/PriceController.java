package com.wcs.wildcircus.controllers;

import java.util.List;

import com.wcs.wildcircus.entities.Session;
import com.wcs.wildcircus.repositories.SessionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PriceController {


	@GetMapping("/price")
	public String ToLoginpage() {
		return "price.html";
	}
}
  //@Autowired
  //private SessionRepository sessionRepository;
  //

  //@GetMapping("/price")
  //public String Price(Model model) {
   // List<Session> sessions = sessionRepository.findAll();
   // model.addAttribute("sessions", sessions);
   // return "price";
 // }
//}//