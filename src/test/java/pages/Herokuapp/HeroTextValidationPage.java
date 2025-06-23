package pages.Herokuapp;

import pages.BasePage;

public class HeroTextValidationPage extends BasePage {

        private String abMsg = "//p[contains(text(),'Also known as split testing. This is a way in whic')]";

        public HeroTextValidationPage(){
        super(driver);
    }

        public void navigateToWebpage() {
        navigateTo("https://the-internet.herokuapp.com/abtest");
    }

        public String msgValidation(){
        return textFromElement(abMsg); 
    }




    






    
}
