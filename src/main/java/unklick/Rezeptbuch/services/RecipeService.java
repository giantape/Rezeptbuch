package unklick.Rezeptbuch.services;

import unklick.Rezeptbuch.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
