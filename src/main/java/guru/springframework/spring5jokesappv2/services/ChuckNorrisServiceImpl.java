package guru.springframework.spring5jokesappv2.services;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisServiceImpl implements ChuckNorris {

    public ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisServiceImpl() { 
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getRandomQuote() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
