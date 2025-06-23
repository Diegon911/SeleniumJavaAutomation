package pages.Herokuapp;

import pages.BasePage;

public class HeroLoginFakePage extends BasePage {

    private String titleLabel = "//h2[normalize-space()='Login Page']";
    private String usertextBox = "//input[@id='username']";
    private String passTextBox = "//input[@id='password']";
    private String loginButton = "//i[@class='fa fa-2x fa-sign-in']";
    private String errorLabel = "//div[@id='flash']";
    private String successLabel = "//div[@id='flash']";
    private String secureLabel = "//h2[normalize-space()='Secure Area']";
    private String logoutButton = "//i[@class='icon-2x icon-signout']";
    private String logoutLabel = "//div[@id='flash']";


    public HeroLoginFakePage(){
    super(driver);
}

    public void navigateToWebpage(){
    navigateTo("https://the-internet.herokuapp.com/login");    
}

    public void loginClic(){
    clickElement(loginButton);
}

    public void logoutClic(){
    clickElement(logoutButton);
}

    public String titleValidation(){
    return textFromElement(titleLabel);
}

    public String errorValidation(){
    return textFromElement(errorLabel);
}

    public String successValidation(){
    return textFromElement(successLabel);
}

    public String secureValidation(){
    return textFromElement(secureLabel);
}

    public String logoutValidation(){
    return textFromElement(logoutLabel);
}

    public void sendUser(){
    write(usertextBox, "tomsmith");
}

    public void sendPass(){
    write(passTextBox, "SuperSecretPassword!");
}

    
}
