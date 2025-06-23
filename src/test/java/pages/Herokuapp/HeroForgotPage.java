package pages.Herokuapp;

import pages.BasePage;

public class HeroForgotPage extends BasePage {

    private String titleLable = "//h2[normalize-space()='Forgot Password']";
    private String emailTextbox = "//input[@id='email']";
    private String retrieveButton = "//i[@class='icon-2x icon-signin']";
    private String msgLabel = "//h1[normalize-space()='Internal Server Error']";

    public HeroForgotPage(){
    super(driver);
}

    public void navigateToWebpage(){
    navigateTo("https://the-internet.herokuapp.com/forgot_password");
}

    public String titleValidation(){
    return textFromElement(titleLable);
}

    public void sendEmail(){
    write(emailTextbox, "Test01@Testing.com");
}

    public void sendAction(){
    clickElement(retrieveButton);
}

    public String msgValidation(){
    return textFromElement(msgLabel);
}

    
}
