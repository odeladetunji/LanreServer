package LanreControllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/other")
@RestController
public class Admin {
    @RequestMapping("/Admin")
    public String others(){
        return "Admin Page";
    }
}


