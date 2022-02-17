package guru.springframework.spring5jokesappv2.Controller;

import guru.springframework.spring5jokesappv2.services.ChuckNorrisServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class JokesController {

    private final ChuckNorrisServiceImpl chuckNorrisService;

    public JokesController(ChuckNorrisServiceImpl chuckNorrisService) {
        this.chuckNorrisService = chuckNorrisService;
    }
    public String Quote(){
        return chuckNorrisService.getRandomQuote();
    }
}
