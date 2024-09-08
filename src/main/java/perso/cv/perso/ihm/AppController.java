package perso.cv.perso.ihm;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {


@GetMapping("accueil")
public String accueil() {
    return "accueil.html";
}
    @GetMapping("cv")
    public String cv() {
        return "cv.html";
    }
    @GetMapping("lettre-motivation")
    public String lettreMotivation() {
        return "lettreMotivation.html";
    }
}