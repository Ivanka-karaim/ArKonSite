package develop.site.arkon.controller;
import develop.site.arkon.data.CategoryRepository;
import develop.site.arkon.dto.WorkDTO;
import develop.site.arkon.model.Category;
import develop.site.arkon.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private WorkService workService;

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("/")
    public String home(Model model){
        List<WorkDTO> workDTOS = workService.getWorksForGeneralPage();
        List<Category> categories = (List<Category>) categoryRepository.findAll();
        model.addAttribute("works", workDTOS);
        model.addAttribute(categories);
        return "home";
    }

}
