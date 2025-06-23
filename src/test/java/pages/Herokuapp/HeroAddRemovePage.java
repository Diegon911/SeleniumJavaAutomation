package pages.Herokuapp;

import pages.BasePage;

public class HeroAddRemovePage extends BasePage {

        private String titleAddRemove = "//h3[normalize-space()='Add/Remove Elements']";
        private String addButton = "//button[@onclick='addElement()']";
        private String deleteButton = "//button[@class='added-manually']";

        public HeroAddRemovePage(){
        super(driver);
    }

        public void navigateToWebpage() {
        navigateTo("https://the-internet.herokuapp.com/add_remove_elements/");
    }

        public String titleValidationAddRemove(){
        return textFromElement(titleAddRemove); 
    }

        public void addAction(){
            clickElement(addButton);
    }

        public void deleteAction(){
            clickElement(deleteButton);
    }

        public boolean deleteButtonPresent(){
            return elementIsDisplayed(deleteButton);
    }

        public boolean addButtonPresent(){
            return elementIsDisplayed(addButton);
    }


    

}