package unklick.Rezeptbuch.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import unklick.Rezeptbuch.services.RecipeService;

@Controller
public class ShowController {
    private final RecipeService recipeService;
    public ShowController(RecipeService recipeService){
        this.recipeService = recipeService;
    }

    @RequestMapping("/show/{id}")
    public String getById(@PathVariable String id, Model model) {
        model.addAttribute("recipe", recipeService.findById(new Long(id)));
        return "recipes/show";
    }


}
