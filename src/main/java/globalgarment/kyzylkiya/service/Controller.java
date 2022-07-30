package globalgarment.kyzylkiya.service;


import globalgarment.kyzylkiya.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    ArticleRepository articleRepository;

    @GetMapping("/")
    public String getHome(Model model){
        model.addAttribute("articles",articleRepository.findAll());
        model.addAttribute("furniture",articleRepository.findAll());
        return "home";
    }
}
