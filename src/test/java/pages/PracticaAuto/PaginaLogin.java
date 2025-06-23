package pages.PracticaAuto;

import pages.BasePage;

public class PaginaLogin extends BasePage {

    private String registerLink="//a[@aria-label='Register your account']";
    private String loginLabel="//h3[normalize-space()='Login']";
    private String enterUserTextBox="//input[@id='email']";
    private String enterPassTextBox="//input[@id='password']";
    private String loginButton="//input[@value='Login']";

    public PaginaLogin() {
        super(driver);
    }

    public void clickOnRegister(){
        clickElement(registerLink);
    }

    public String loginTextLabel(){
        return textFromElement(loginLabel);
        
    }

    public void clickOnLogin(){
        clickElement(loginButton);
    }

    public void sendUser(String criteria){
        write(enterUserTextBox, criteria);
    }

    public void sendPass(String criteria){
        write(enterPassTextBox, criteria);
    }


    
}
