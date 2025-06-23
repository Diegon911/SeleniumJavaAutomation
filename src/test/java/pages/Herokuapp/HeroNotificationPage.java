package pages.Herokuapp;

import pages.BasePage;

public class HeroNotificationPage extends BasePage {

    private String titleLabel = "//h3[normalize-space()='Notification Message']";
    private String activeNotification = "//a[normalize-space()='Click here']";
    private String msgNotification = "//div[@id='flash']";

    public HeroNotificationPage(){
    super(driver);
}

    public void navigateToWebpage() {
    navigateTo("https://the-internet.herokuapp.com/notification_message_rendered");
}

    public String titleValidation(){
    return textFromElement(titleLabel);
}

    public String notificationValidation(){
    return textFromElement(msgNotification);
}

    public void clicNotification(){
    clickElement(activeNotification);
}


}
