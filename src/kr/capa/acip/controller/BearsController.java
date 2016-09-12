package kr.capa.acip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.capa.acip.service.AttractionService;
import kr.capa.acip.service.LoginService;



@Controller
public class BearsController {

   /*@Autowired
   private AttractionService attractionservice;
   private LoginService loginservice;*/
   
   // 메인 화면 --------------------------------------------
      @RequestMapping("main")
      public String main() {
         System.out.println("memcontroller의 main메소드 실행");
         return "1bears/1bearsmain";
      }

}