package pages.DemoQA;


import java.io.File;
import pages.BasePage;

public class PaginaDemoQA extends BasePage {

    private String doubleClicButton = "//button[@id='doubleClickBtn']";
    private String rightClicButton = "//button[@id='rightClickBtn']";
    private String dynamicClic = "(//button[contains(text(), 'Click Me')])[last()]";
    private String msgDynamicClick = "//p[@id='dynamicClickMessage']";
    private String msgDoubleClic = "//p[@id='doubleClickMessage']";
    private String msgRightClic = "//p[@id='rightClickMessage']";
    private String alert1Button = "//button[@id='alertButton']";
    private String alert2Button = "//button[@id='timerAlertButton']";
    private String alert3Button = "//button[@id='confirmButton']";
    private String alert4Button = "//button[@id='promtButton']";
    private String resultLabel = "//span[@id='promptResult']";
    private String oneRow = "//div[@class='vertical-list-container mt-4']//div[@class='list-group-item list-group-item-action'][normalize-space()='One']";
    private String twoRow = "//div[@class='vertical-list-container mt-4']//div[@class='list-group-item list-group-item-action'][normalize-space()='Two']";
    private String threeRow = "//div[@class='vertical-list-container mt-4']//div[@class='list-group-item list-group-item-action'][normalize-space()='Three']";
    private String fourRow = "//div[@class='vertical-list-container mt-4']//div[@class='list-group-item list-group-item-action'][normalize-space()='Four']";
    private String fiveRow = "//div[@class='vertical-list-container mt-4']//div[@class='list-group-item list-group-item-action'][normalize-space()='Five']";
    private String sixRow = "//div[@class='vertical-list-container mt-4']//div[@class='list-group-item list-group-item-action'][normalize-space()='Six']";
    private String gridOption = "//a[@id='demo-tab-grid']";
    private String gridOne = "//div[@class='create-grid']//div[@class='list-group-item list-group-item-action'][normalize-space()='One']";
    private String gridTwo = "//div[@class='create-grid']//div[@class='list-group-item list-group-item-action'][normalize-space()='Two']";
    private String gridThree = "//div[@class='create-grid']//div[@class='list-group-item list-group-item-action'][normalize-space()='Three']";
    private String gridFour = "//div[@class='create-grid']//div[@class='list-group-item list-group-item-action'][normalize-space()='Four']";
    private String gridFive = "//div[@class='create-grid']//div[@class='list-group-item list-group-item-action'][normalize-space()='Five']";
    private String gridSix = "//div[@class='create-grid']//div[@class='list-group-item list-group-item-action'][normalize-space()='Six']";
    private String gridSeven = "//div[normalize-space()='Seven']";
    private String gridEight = "//div[normalize-space()='Eight']";
    private String gridNine = "//div[normalize-space()='Nine']";
    private String msgLabelFrame1 = "//h1[@id='sampleHeading']";
    private String msgLabelFrame2 = "//h1[@id='sampleHeading']";
    private String msgParentFrame = "//body";
    private String childFrame = "//iframe[@srcdoc='<p>Child Iframe</p>']";
    private String msgChildFrame = "//p[normalize-space()='Child Iframe']";
    private String uploadButton = "//input[@id='uploadFile']";
    private String uploadLabel = "//p[@id='uploadedFilePath']";
    private String sliderBar = "//input[@type='range']";
    private String sliderValue = "//div[@class='col-9']";
    private String dragMeSample = "//div[@id='draggable']";
    private String dragMeZoneSample = "//div[@id='simpleDropContainer']//div[@id='droppable']";


    public PaginaDemoQA(){
        super(driver);
    }

    public void navigateToWebpageB() {
        navigateTo("https://demoqa.com/buttons");
    }

    public void navigateToWebpageA() {
        navigateTo("https://demoqa.com/alerts");
    }

    public void navigateToWebpageS() {
        navigateTo("https://demoqa.com/sortable");
    }    

    public void navigateToWebpageF() {
        navigateTo("https://demoqa.com/frames");
    }   

    public void navigateToWebpageFnested() {
        navigateTo("https://demoqa.com/nestedframes");
    }   

    public void navigateToWebpageW() {
        navigateTo("https://demoqa.com/browser-windows");
    }   

    public void navigateToWebpageU() {
        navigateTo("https://demoqa.com/upload-download");
    }  

    public void navigateToWebpageBar() {
        navigateTo("https://demoqa.com/slider");
    }  

    public void navigateToWebpageD() {
        navigateTo("https://demoqa.com/droppable");
    }  

    public void doubleClic(){
        doubleClick(doubleClicButton);
    }

    public void rightClic(){
        rightClick(rightClicButton);
    }

    public void dynamicClic(){
        clickElement(dynamicClic);
    }

    public String correctMsgDoubleClic(){
       return textFromElement(msgDoubleClic); 
    }

    public String correctMsgrightClic(){
        return textFromElement(msgRightClic); 
    }

    public String correctDynamicMsgrightClic(){
        return textFromElement(msgDynamicClick); 
    }

    public boolean visibleMsgDoubleClic(){
        return elementIsDisplayed(msgDoubleClic);
    }

    public boolean visibleMsgRightClic(){
        return elementIsDisplayed(msgRightClic);
    }

    public boolean visibleDynamicMsgrightClic(){
        return elementIsDisplayed(msgDynamicClick); 
    }

    public void scrollDownPage(){
        scrollDown(0, 330);
    }

    public void scrollDownPage2(){
        scrollDown(0, 450);
    }

    public void clicOnAlert1(){
        clickElement(alert1Button);
    }

    public void clicOnAlert2(){
        clickElement(alert2Button);
        try {
            Thread.sleep(7000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clicOnAlert3(){
        clickElement(alert3Button);
        try {
            Thread.sleep(2000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clicOnAlert4(){
        clickElement(alert4Button);
    }

    public String confirmMsg(){
        return textFromElement(resultLabel);
    }

    public void cancelAlert(){
        dismissAlert();
    }

    public void okAlert(){
        acceptAlert();
    }

    public void sendWord(){
        writeAlert("Test");
        try {
            Thread.sleep(2000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void moveElements(){
        dragAndDropElement(oneRow, sixRow);
        dragAndDropElement(twoRow, sixRow);
        dragAndDropElement(threeRow, sixRow);
        dragAndDropElement(fourRow, sixRow);
        dragAndDropElement(fiveRow, sixRow);
        try {
            Thread.sleep(2000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clicOnGrid(){
        clickElement(gridOption);
        try {
            Thread.sleep(6000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }



    public void moveElements2(){
        dragAndDropElement(gridOne, gridNine);
        dragAndDropElement(gridTwo, gridNine);
        dragAndDropElement(gridThree, gridNine);
        dragAndDropElement(gridFour, gridNine);
        dragAndDropElement(gridFive, gridNine);
        dragAndDropElement(gridSix, gridNine);
        dragAndDropElement(gridSeven, gridNine);
        dragAndDropElement(gridEight, gridNine);
        try {
            Thread.sleep(2000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String newListOrderValidation(){
        return textFromElement(oneRow);
    }

    public String newgridOrderValidation(){
        return textFromElement(gridOne);
    }

    public void switchToFrame1(){
        switchToFrameIDorName("frame1");
    }

    public String msgFrame1(){
        return textFromElement(msgLabelFrame1);
    }

    public String msgParentFrame(){
        return textFromElement(msgParentFrame);
    }

    public void backToMainPage(){
        switchToDefualtFrame();
    }

    public void switchToFrame2(){
        switchToFrameIDorName("frame2");
    }

    public String msgFrame2(){
        return textFromElement(msgLabelFrame2);
    }

    public void switchToChildFrame(){
        switchToFrameLoc(childFrame);
    }

    public String msgChildFrame(){
        return textFromElement(msgChildFrame);
    }

    File FileU = new File("E:\\Users\\10053902\\Desktop\\Test.txt");
    String path = FileU.getAbsolutePath();
    public void uploadFile(){
        upload(uploadButton, path);
    }

    public String msgUpload(){
        return textFromElement(uploadLabel);
    }

    public void moveSliderBar(){
        dragAndDropBar(sliderBar, 210, 0);
    }

    public String sliderValue(){
        return textFromElement(sliderValue);
    }

    public void dragElementSample(){
        dragAndDropElement(dragMeSample, dragMeZoneSample);
    }

    public String droppedSample(){
        return textFromElement(dragMeZoneSample);
    }
   
}
