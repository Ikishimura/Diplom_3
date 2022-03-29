import PO.EntrancePO;
import PO.Ingredients;
import PO.RegistrationPO;
import com.UserOperations;
import com.model.UserRegisterResponse;
import io.qameta.allure.junit4.DisplayName;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class TestsTransitionByConstructor {
    public UserOperations userOperations;
    private RegistrationPO registrationPO;
    private EntrancePO entrancePO;
    public UserRegisterResponse userRegisterResponse;
    private Ingredients ingredients;

    @Before
    public void setUp(){
        userOperations = new UserOperations();
        userRegisterResponse= new UserRegisterResponse();

        ingredients = open ("https://stellarburgers.nomoreparties.site",
                Ingredients.class);
        entrancePO = open ("https://stellarburgers.nomoreparties.site",
                EntrancePO.class);
        registrationPO = open ("https://stellarburgers.nomoreparties.site",
                RegistrationPO.class);
        userOperations.register();
    }
    @After
    public void tearDown(){
        userOperations.delete();
    }
    @DisplayName("Test by clicking button constructor")
        @Test
    public void testByClickingButtonConstructor(){
        UserOperations userOperations = new UserOperations();
        String fields = userOperations.register().values().toString();

        StringBuilder email = new StringBuilder(fields);
        email.delete(45,46);
        String fieldsEmail = email.delete(0,25).toString();

        StringBuilder password = new StringBuilder(fields);
        password.delete(0,1);
        String fieldPassword = password.delete(10,46).toString();

        registrationPO.getClickButtonPersonalArea();
        entrancePO.setClickAndInputValueFieldEmailAndPassword(fieldsEmail,fieldPassword);
        entrancePO.getClickButtonEntrance();
        registrationPO.getClickButtonPersonalArea();
        entrancePO.getClickButtonConstructor();
        ingredients.getClickOnFilling();
    }
}
