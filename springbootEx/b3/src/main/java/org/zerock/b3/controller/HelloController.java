package org.zerock.b3.controller;

import java.util.List;

import javax.sound.midi.MidiDevice.Info;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
@RequestMapping("/sample")
public class HelloController {
    
    @GetMapping("/hello")
    public void hello(Model model){
        log.info(">>> hello");

        model.addAttribute("result", "SUCCESS");
    }

    @GetMapping("/list")
    public void exList(Model model){
        List<String> strList = 
            List.of("AAA", "BBB", "CCC", "DDD");
        model.addAttribute("strList", strList);
    }

    @GetMapping("/ex2")
    public void ex2(Model model){
        model.addAttribute("keyword", "멜로가 체질");
    }

    @GetMapping("/add")
    public String add(RedirectAttributes rttr){
        log.info(">>> add");
        rttr.addFlashAttribute("result", "SUCCESS");
        return "redirect:/sample/resultAdd";
    }

    @GetMapping("/resultAdd")
        public void resultAdd(){
            
        }
    
}