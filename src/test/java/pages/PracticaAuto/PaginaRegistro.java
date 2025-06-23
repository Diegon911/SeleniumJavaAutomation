package pages.PracticaAuto;

import pages.BasePage;

public class PaginaRegistro extends BasePage {

    private String nameTextBox="//input[@id='first_name']";
    private String lastnameTextBox="//input[@id='last_name']";
    private String dateTextBox="//input[@id='dob']";
    private String addressTextBox="//input[@id='street']";
    private String zipcodeTextBox="//input[@id='postal_code']";
    private String cityTextBox="//input[@id='city']";
    private String stateTextBox="//input[@id='state']";
    private String countryDropdown="//select[@id='country']";
    private String phoneTextBox="//input[@id='phone']";
    private String emailTextBox="//input[@id='email']";
    private String passTextBox="//input[@id='password']";
    private String registerButton="//button[@type='submit']";
    private String repeatUserLabel="//div[@class='help-block']";
    private String noNameUserLabel="//div[contains(text(),'First name is required')]";
    private String noLastnameUserLabel="//div[contains(text(),'Last name is required')]";
    private String noDateUserLabel="//div[contains(text(),'Date of Birth is required')]";
    private String noAddressUserLabel="//div[contains(text(),'Street is required')]";
    private String noZipcodeUserLabel="//div[contains(text(),'Postcode is required')]";
    private String noCityUserLabel="//div[contains(text(),'City is required')]";
    private String noStateUserLabel="//div[contains(text(),'State is required')]";
    private String noCountryUserLabel="//div[contains(text(),'Country is required')]";
    private String noPhoneUserLabel="//div[contains(text(),'Phone is required.')]";
    private String noEmailUserLabel="//div[contains(text(),'Email is required')]";
    private String invalidEmailUserLabel="//div[@data-test='email-error']";
    private String noPassUserLabel="//div[normalize-space()='Password is required']";
    private String noPassShortUserLabel="//div[normalize-space()='Password must be minimal 6 characters long.']";
    private String nonAcceptedPassShortUserLabel="//div[normalize-space()='Password can not include invalid characters.']";

    public PaginaRegistro() {
        super(driver);
    }

    public void enterName(String criteria){
        write(nameTextBox, criteria);
    } 
    
    public void enterLastname(String criteria){
        write(lastnameTextBox, criteria);
    } 
    
    public void enterDate(String criteria){
        write(dateTextBox, criteria);
    } 

    public void enterAddress(String criteria){
        write(addressTextBox, criteria);
    } 

    public void enterZipcode(String criteria){
        write(zipcodeTextBox, criteria);
    } 

    public void enterCity(String criteria){
        write(cityTextBox, criteria);
    } 

    public void enterState(String criteria){
        write(stateTextBox, criteria);
    } 

    public void enterCountry(){
        selectFromDropdownByVisible(countryDropdown,"Mexico");
    } 
    
    public void enterPhone(String criteria){
        write(phoneTextBox, criteria);
    } 

    public void enterEmail(String criteria){
        write(emailTextBox, criteria);
    } 

    public void enterPass(String criteria){
        write(passTextBox, criteria);
    } 

    public void clickRegisterButton(){
        /*try {
            Thread.sleep(5000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }*/
        clickElement(registerButton);
    } 

    public String repeatUserTextLabel(){
        return textFromElement(repeatUserLabel);
        
    }

    public String unnamedUserTextLabel(){
        return textFromElement(noNameUserLabel);
        
    }

    public String unLastnamedUserTextLabel(){
        return textFromElement(noLastnameUserLabel);
        
    }

    public String unDateUserTextLabel(){
        return textFromElement(noDateUserLabel);
    }

    public String unAdressUserTextLabel(){
        return textFromElement(noAddressUserLabel);
    }

    public String unZipcodeUserTextLabel(){
        return textFromElement(noZipcodeUserLabel);
    }

    public String unCityUserTextLabel(){
        return textFromElement(noCityUserLabel);
    }

    public String unStateUserTextLabel(){
        return textFromElement(noStateUserLabel);
    }

    public String unCountryUserTextLabel(){
        return textFromElement(noCountryUserLabel);
    }

    public String unPhoneUserTextLabel(){
        return textFromElement(noPhoneUserLabel);
    }

    public String unEmailUserTextLabel(){
        return textFromElement(noEmailUserLabel);
    }

    public String invalidEmailUserTextLabel(){
        return textFromElement(invalidEmailUserLabel);
    }

    public String unPassUserTextLabel(){
        return textFromElement(noPassUserLabel);
    }

    public String unPassShortUserTextLabel(){
        return textFromElement(noPassShortUserLabel);
    }

    public String nonAcceptedPassUserTextLabel(){
        return textFromElement(nonAcceptedPassShortUserLabel);
    }


}
