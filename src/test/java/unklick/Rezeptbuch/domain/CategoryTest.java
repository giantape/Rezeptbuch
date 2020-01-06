package unklick.Rezeptbuch.domain;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CategoryTest {
    private static Category category;

    @BeforeAll
    static void initAll(){
        category = new Category();
    }

    @Test
    public void getId(){
        Long idValue = 4L;
        category.setId(idValue);
        assertEquals(idValue, category.getId());
    }

    @Test
    public void getDescription() {
    }

    @Test
    public void getRecipes() {
    }
}