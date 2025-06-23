package pages.PracticaAuto;

import java.util.List;

import pages.BasePage;

public class PaginaPrueba extends BasePage {

    private String signInLink = "//a[normalize-space()='Sign in']";
    private String dropdownSort = "//select[@aria-label='sort']";

    

    public PaginaPrueba() {
        super(driver);
    }
 
    // Método para navegar a una pagina web
    public void navigateToWebpage() {
        navigateTo("https://practicesoftwaretesting.com/");
    }

    public void clickOnSignIn(){
        clickElement(signInLink);
    }

    public void clickOnDropdown(){
        clickElement(dropdownSort);
    }

    public List<String> dropdownOptions(){
        return getDropdownValues(dropdownSort);
    } 

    public int dropdownNumberOptions(){
        return dropdownSize(dropdownSort);
    }






}
