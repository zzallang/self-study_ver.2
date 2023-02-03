package com.example.demo.box.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.box.dto.Box;
import com.example.demo.box.service.BoxService;

@Controller
public class BoxController {

  @Autowired
  BoxService boxService;

  @GetMapping("/box")
  public String test(Box box) {
    System.out.println(box.toString());
    boxService.add(box);
    return "box/box";
  }
  
  @GetMapping("/select-box")
  public String selectBoxNo(int no) {
    System.out.println(no);
    System.out.println("컨트롤러 던진다");
//    boxService.get(no);
    return "redirect:/box";
  }
}
