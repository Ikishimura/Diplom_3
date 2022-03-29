package PO;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EntrancePO {
    @FindBy(how = How.XPATH,using = ".//input[@class = 'text input__textfield text_type_main-default']")
    public SelenideElement getFieldEmail;

    @FindBy(how = How.XPATH, using = ".//input[@type = 'password']")
    public SelenideElement getFieldPassword;

    @FindBy(how = How.XPATH, using = ".//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_medium__3zxIa']")
    public SelenideElement getButtonEntrance;

    @FindBy(how = How.CLASS_NAME, using = "Auth_link__1fOlj")
    public SelenideElement getButtonEntranceRegistrationPage;

    @FindBy(how = How.LINK_TEXT, using = "Восстановить пароль")
    public SelenideElement getButtonRestorePassword;

    @FindBy(how = How.LINK_TEXT, using = "Конструктор")
    public SelenideElement getButtonConstructor;

    @FindBy(how = How.CLASS_NAME, using = "AppHeader_header__logo__2D0X2")
    public SelenideElement getButtonStellarBurgers;
    @FindBy(how = How.XPATH, using = ".//li/button[@class='Account_button__14Yp3 text text_type_main-medium text_color_inactive']")
    public SelenideElement getExit;
    @FindBy(how = How.XPATH, using = ".//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_large__G21Vg']")
    public SelenideElement getButtonEntrance1;
    @FindBy(how = How.XPATH, using = ".//p[@class='undefined text text_type_main-medium mb-15']")
    public SelenideElement getIdOrder;
    @FindBy(how = How.TAG_NAME, using = "h2")
    public SelenideElement checkExit;

    @Step
    public void checkExit(){
        checkExit.shouldBe(Condition.visible);
    }
    @Step
    public void checkIdOrder(){
        getIdOrder.shouldBe(Condition.visible);
    }
    @Step
    public void getClickButtonEntranceInAccount(){
        getButtonEntrance1.click();
    }
    @Step
    public void getClickExit(){
        getExit.click();
    }
    @Step
    public void getFieldEmailClick(){
        getFieldEmail.click();
    }
    @Step
    public void getFieldPasswordClick(){
        getFieldPassword.click();
    }
    @Step
    public void getClickButtonEntrance(){
        getButtonEntrance.click();
    }
    @Step
    public void getClickButtonEntranceRegistrationPage(){
        getButtonEntranceRegistrationPage.click();
    }
    @Step
    public void getClickButtonRestorePassword(){
        getButtonRestorePassword.click();
    }
    @Step
    public void getClickButtonConstructor(){
        getButtonConstructor.click();
    }
    @Step
    public void getClickButtonStellarBurgers(){
        getButtonStellarBurgers.click();
    }
    @Step
    public void setValueEmail(String email){
        getFieldEmail.setValue(email);
    }
    @Step
    public void setValueFieldPassword(String password){
        getFieldPassword.setValue(password);
    }
    @Step
    public void setClickAndInputValueFieldEmail(String email){
        getFieldEmailClick();
        setValueEmail(email);
    }
    @Step
    public void setClickAndInputValueFieldPassword(String password){
        getFieldPasswordClick();
        setValueFieldPassword(password);
    }
    @Step
    public void setClickAndInputValueFieldEmailAndPassword(String email, String password){
        setClickAndInputValueFieldEmail(email);
        setClickAndInputValueFieldPassword(password);
    }
}
