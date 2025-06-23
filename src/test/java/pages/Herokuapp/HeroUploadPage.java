package pages.Herokuapp;

import java.io.File;

import pages.BasePage;

public class HeroUploadPage extends BasePage {

    private String titleLabel = "//h3[normalize-space()='File Uploader']";
    private String selectFileButton = "//input[@id='file-upload']";
    private String uploadButton = "//input[@id='file-submit']";
    private String uploadLabel = "//h3[normalize-space()='File Uploaded!']";

    public HeroUploadPage(){
    super(driver);
}

    public void navigateToWebpage(){
    navigateTo("https://the-internet.herokuapp.com/upload");
}

    public String titleValidation(){
    return textFromElement(titleLabel);
}

    File FileU = new File("C:\\Users\\diego\\OneDrive\\Escritorio\\test.csv");
    String path = FileU.getAbsolutePath();
    public void uploadFile(){
    upload(selectFileButton, path);
}

    public void uploadAction(){
    clickElement(uploadButton);
}

    public String uploadValidation(){
    return textFromElement(uploadLabel);
}
    
}
