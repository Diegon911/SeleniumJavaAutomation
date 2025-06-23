package pages.Herokuapp;

import pages.BasePage;

public class HeroAlertsPage extends BasePage {

    private String titleLabel = "//h3[normalize-space()='JavaScript Alerts']";
    private String alert1 = "//button[@onclick='jsAlert()']";
    private String alert2 = "//button[@onclick='jsConfirm()']";
    private String alert3 = "//button[@onclick='jsPrompt()']";
    private String msgValidation = "//p[@id='result']";

    public HeroAlertsPage(){
    super(driver);
}

    public void navigateToWebpage(){
    navigateTo("https://the-internet.herokuapp.com/javascript_alerts");
}

    public String titleValidation(){
    return textFromElement(titleLabel);
}

    public String msgResult(){
    return textFromElement(msgValidation);
}

    public void alertType1(){
    clickElement(alert1);
}

    public void alertType2(){
    clickElement(alert2);
}

    public void alertType3(){
    clickElement(alert3);
}

    public void alertOk(){
    acceptAlert();
}

    public void alertCancel(){
    dismissAlert();
}

    public void alertMsg(){
    writeAlert("Test");
}


    
}
