package unklick.Rezeptbuch.controllers;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import unklick.Rezeptbuch.domain.Recipe;
import unklick.Rezeptbuch.services.RecipeService;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ShowControllerTest {

    @Mock
    RecipeService recipeService;
    ShowController showController;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        showController = new ShowController(recipeService);
    }

    @Test
    public void testGetRecipes() throws Exception {
        Recipe recipe = new Recipe();
        recipe.setId(1L);

        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(showController).build();
        when(recipeService.findById(anyLong())).thenReturn(recipe);
        mockMvc.perform(get("/show/1")).andExpect(status().isOk())
                .andExpect(view().name("recipes/show"));
    }
}