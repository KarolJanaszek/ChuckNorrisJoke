package jokes;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokeController {

    @GetMapping("/")
    public String generateJoke(ModelMap map) { // musimy dać mapę aby wysłać do HTML'a
        ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();
        map.put("quote", chuckNorrisQuotes.getRandomQuote()); // do wysyłanej mapy wrzucamy quoty, które są wywołaniami funkcji
        return "joke"; //wyślij mape do pliku: recourses/templates/joke.html
    }
}
