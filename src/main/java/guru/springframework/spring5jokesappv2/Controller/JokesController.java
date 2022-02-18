package guru.springframework.spring5jokesappv2.Controller;

import guru.springframework.spring5jokesappv2.services.ChuckNorrisServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private final ChuckNorrisServiceImpl chuckNorrisService;


    public JokesController(ChuckNorrisServiceImpl chuckNorrisService) {
        this.chuckNorrisService = chuckNorrisService;
    }
    @RequestMapping({"/"," "})
    public String Quote(Model model){
        model.addAttribute("joke",chuckNorrisService.getRandomQuote());
        return "index";
    }
}
