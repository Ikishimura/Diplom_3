package PO;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Ingredients {
    @FindBy(how = How.XPATH, using = ".//div[3][@class='tab_tab__1SPyG  pt-4 pr-10 pb-4 pl-10 noselect']")
    public SelenideElement getFilling;
    @FindBy(how = How.XPATH,using = ".//div[2][@class='tab_tab__1SPyG  pt-4 pr-10 pb-4 pl-10 noselect']")
    public SelenideElement getSauce;
    @FindBy(how = How.XPATH,using = ".//div[@class='tab_tab__1SPyG  pt-4 pr-10 pb-4 pl-10 noselect']")
    public SelenideElement getBun;
    @FindBy(how = How.XPATH,using = ".//div[@class='tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect']")
    public SelenideElement visibleHeader;
    @Step
    public void getClickBun(){
        getBun.click();
    }
    @Step
    public boolean visibleBunSection(){
        return visibleHeader.getText().contentEquals("Булки");
    }
    @Step
    public void getClickSauce(){
        getSauce.click();
    }
    @Step
    public boolean visibleSauceSection(){
        return visibleHeader.getText().contentEquals("Соусы");
    }
    @Step
    public void getClickOnFilling(){
        getFilling.click();
    }
    @Step
    public boolean visibleFillingSection(){
        return visibleHeader.getText().contentEquals("Начинки");
    }
}
