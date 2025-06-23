package pages.Herokuapp;

import java.util.List;

import pages.BasePage;

public class HeroDropDownPage extends BasePage {

        private String titlePage = "//h3[normalize-space()='Dropdown List']";
        private String dropDown = "//select[@id='dropdown']";


        public HeroDropDownPage(){
        super(driver);
    } 
    
        public void navigateToWebpage() {
        navigateTo("https://the-internet.herokuapp.com/dropdown");

    }

        public String titleValidationDropDown(){
        return textFromElement(titlePage); 
    }

        public int opcAmount(){
        return dropdownSize(dropDown);
    }

        public List<String> dropdownOptions(){
        return getDropdownValues(dropDown);
    } 

        public void selectOption(){
        selectFromDropdownByVisible(dropDown, "Option 2");
    } 

        public String optionDropDownValidation(){
        return getSelectedOptionDropDown(dropDown);
    }





}
