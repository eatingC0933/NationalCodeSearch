package se.yitingchang.nationalcodesearch;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/search")
public class NationalCodeController {
    private final NationalCodeService nationalCodeService;

    public NationalCodeController(NationalCodeService nationalCodeService) {
        this.nationalCodeService = nationalCodeService;
    }

    @GetMapping
    public String search(Model model) {
        return "search";
    }



    @GetMapping("/query")
    public String getByRequestParam(@RequestParam String country, Model model) {
        model.addAttribute("code", nationalCodeService.getCountryCode(country));
        return "result";
    }
}
