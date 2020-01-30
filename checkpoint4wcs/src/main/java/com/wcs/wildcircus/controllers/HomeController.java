package com.wcs.wildcircus.controllers;

import java.util.List;

import com.wcs.wildcircus.entities.Actor;
import com.wcs.wildcircus.repositories.ActorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  @Autowired
  private ActorRepository actorRepository;
  
  @GetMapping("/")
  public String Home(Model model) {
    List<Actor> actors = actorRepository.findAll();
    model.addAttribute("actors", actors);
    return "home";
  }
}