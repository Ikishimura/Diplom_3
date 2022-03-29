import PO.Ingredients;
import io.qameta.allure.junit4.DisplayName;
import static org.junit.Assert.*;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class TestClickOnIngredients {
    @DisplayName("Test click on filling")
    @Test
    public void testClickOnFilling(){
        Ingredients ingredients = open ("https://stellarburgers.nomoreparties.site",
                Ingredients.class);
        ingredients.getClickOnFilling();
        assertTrue("Не верный раздел",ingredients.visibleFillingSection());

    }
    @DisplayName("Test click on sauce")
    @Test
    public void testClickOnSauce(){
        Ingredients ingredients = open ("https://stellarburgers.nomoreparties.site",
                Ingredients.class);
        ingredients.getClickOnFilling();
        ingredients.getClickSauce();
        assertTrue("Не верный раздел",ingredients.visibleSauceSection());
    }
    @DisplayName("Test click on bun")
    @Test
    public void testClickOnBun(){
        Ingredients ingredients = open ("https://stellarburgers.nomoreparties.site",
                Ingredients.class);
        ingredients.getClickOnFilling();

        ingredients.getClickBun();
        assertTrue("Не верный раздел",ingredients.visibleBunSection());
    }
}
