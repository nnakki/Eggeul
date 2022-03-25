package Team1.Eggeul;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
@Slf4j
@AllArgsConstructor

public class MainController {
/*
    @GetMapping("/mainBody")
    public void body(){
    }*/

    @GetMapping
    public String index() {
        return "index";
    }
}
