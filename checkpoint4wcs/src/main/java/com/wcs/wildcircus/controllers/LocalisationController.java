package com.wcs.wildcircus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LocalisationController {
  
  @GetMapping("/localisation")
  public String Localisation() {
    return "localisation";
  }
}