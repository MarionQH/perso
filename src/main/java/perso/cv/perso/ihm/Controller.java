package perso.cv.perso.ihm;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
}

@GetMapping("accueil")
public String accueil() {
    return "accueil.html";
}