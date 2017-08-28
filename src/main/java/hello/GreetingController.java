package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String templatename = "The name is: %s!";
    private static final String templatesname = "The surname is: %s!";

    @RequestMapping(value = "/add")
    public String AddPerson(@RequestParam(value = "name", defaultValue = "") String name,
                            @RequestParam(value = "sname", defaultValue = "") String sname,
                            @RequestParam(value = "date", defaultValue = "") String date,
                            @RequestParam(value = "email", defaultValue = "") String email,
                            @RequestParam(value = "pass", defaultValue = "") String pass) {
        CRest crest = new CRest("", "");
        crest.SetAll(name, sname, date, pass, email);
        return "User add!";
    }

    @RequestMapping(value = "/find")
    public CRest Find(@RequestParam(value = "email") String email) {
        CRest crest = new CRest("", "");
        String n = crest.FindName(email);
        String m = crest.FindSname(email);
        return new CRest(String.format(templatename, n), String.format(templatesname, m));
    }

    @RequestMapping("/rm")
    public String RmPerson(@RequestParam(value = "email") String email) {
        CRest crest = new CRest("", "");
        crest.RmUser(email);
        return "User removed!";
    }
}