package pages.PracticaTricentis;

import pages.BasePage;

public class PaginaRegistroTricentis extends BasePage {

    private String registerLabel = "//h1[normalize-space()='Register']";
    private String ypdLabel = "//strong[normalize-space()='Your Personal Details']";
    private String genderLabel = "//label[normalize-space()='Gender:']";
    private String maleLabel = "//label[@for='gender-male']";
    private String femaleLabel = "//label[@for='gender-female']";
    private String firstNameLabel = "//label[@for='FirstName']";
    private String lastNameLabel = "//label[@for='LastName']";
    private String emailLabel = "//label[@for='Email']";
    private String ypLabel = "//strong[normalize-space()='Your Password']";
    private String passwordLabel = "//label[@for='Password']";
    private String confirmPasswordLabel = "//label[@for='ConfirmPassword']";
    private String registerButton = "//input[@id='register-button']";
    private String requiredNameLabel = "//span[@for='FirstName']";
    private String requiredLastNameLabel = "//span[@for='LastName']";
    private String requiredEmailLabel = "//span[@for='Email']";
    private String requiredPasswordLabel = "//span[@for='Password']";
    private String requiredConfirmPassLabel = "//span[@for='ConfirmPassword']";
    private String textBoxEmail = "//input[@id='Email']";
    private String errorEmail = "//span[@for='Email']";
    private String textBoxPassword = "//input[@id='Password']";
    private String errorPass = "//span[@for='Password']";
    private String textBoxConfPassword = "//input[@id='ConfirmPassword']";
    private String errorConfPass = "//span[@for='ConfirmPassword']";
    private String textBoxName = "//input[@id='FirstName']";
    private String textBoxLastName = "//input[@id='LastName']";
    private String newUserLabel = "//div[@class='result']";
    private String radioButtonMale = "//input[@id='gender-male']";
    private String radioButtonFemale = "//input[@id='gender-female']";
    private String errorUserExist = "//li[normalize-space()='The specified email already exists']";
    private String logoutLabel = "//a[@class='ico-logout']";

    public PaginaRegistroTricentis() {
        super (driver);
    }

    public String etiquetaRegistro(){
        return textFromElement(registerLabel);
    }

    public String etiquetaNuevoUser(){
        return textFromElement(newUserLabel);
    }

    public String etiquetaYpd(){
        return textFromElement(ypdLabel);
    }

    public String etiquetaGender(){
        return textFromElement(genderLabel);
    }

    public String etiquetaMale(){
        return textFromElement(maleLabel);
    }

    public String etiquetaFemale(){
        return textFromElement(femaleLabel);
    }

    public String etiquetaFirstName(){
        return textFromElement(firstNameLabel);
    }

    public String etiquetaLastName(){
        return textFromElement(lastNameLabel);
    }

    public String etiquetaEmail(){
        return textFromElement(emailLabel);
    }

    public String etiquetaYp(){
        return textFromElement(ypLabel);
    }

    public String etiquetaPassword(){
        return textFromElement(passwordLabel);
    }

    public String etiquetaConfirmPassword(){
        return textFromElement(confirmPasswordLabel);
    }

    public String botonRegister(){
        return textFromElement(registerButton);
    }

    public String etiquetaNombreMandatorio(){
        return textFromElement(requiredNameLabel);
    }

    public String etiquetaApellidoMandatorio(){
        return textFromElement(requiredLastNameLabel);
    }

    public String etiquetaEmailMandatorio(){
        return textFromElement(requiredEmailLabel);
    }

    public String etiquetaPassMandatorio(){
        return textFromElement(requiredPasswordLabel);
    }

    public String etiquetaConfPassMandatorio(){
        return textFromElement(requiredConfirmPassLabel);
    }

    public String etiquetaEmailInvalido(){
        return textFromElement(errorEmail);
    }

    public String etiquetaPassInvalido(){
        return textFromElement(errorPass);
    }

    public String etiquetaConfPassInvalido(){
        return textFromElement(errorConfPass);
    }

    public String etiquetaUserrepetido(){
        return textFromElement(errorUserExist);
    }

    public void clickOnRegisterButton(){
        clickElement(registerButton);
    }

    public void clickOnLogoutOption(){
        clickElement(logoutLabel);
    }

    public void clickOnRadioMaleButton(){
        clickElement(radioButtonMale);
    }

    public void clickOnRadioFemaleButton(){
        clickElement(radioButtonFemale);
    }

    public void sendEmail(String criteria){
        write(textBoxEmail, criteria);
    }

    public void sendPass(String criteria){
        write(textBoxPassword, criteria);
    }

    public void sendName(String criteria){
        write(textBoxName, criteria);
    }
    public void sendLastName(String criteria){
        write(textBoxLastName, criteria);
    }

    public void sendConfPass(String criteria){
        write(textBoxConfPassword, criteria);
    }

    public boolean trueTextboxName(){
        return elementIsDisplayed(textBoxName);
    }

    public boolean trueTextboxLastName(){
        return elementIsDisplayed(textBoxLastName);
    }

    public boolean trueTextboxEmail(){
        return elementIsDisplayed(textBoxEmail);
    }

    public boolean trueTextboxPass(){
        return elementIsDisplayed(textBoxPassword);
    }

    public boolean trueTextboxConPass(){
        return elementIsDisplayed(textBoxConfPassword);
    }


    
}
