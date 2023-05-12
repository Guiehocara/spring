package br.com.eteczl.workshopspring;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import java.util.Map;

@Controller
public class HomeController {
    @GetMapping("/")
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home");

        Aluno aluno = new Aluno("Guilherme", "gui@email.com");
        modelAndView.addObject("primeiroAluno", aluno);



        return modelAndView;
    }
}
