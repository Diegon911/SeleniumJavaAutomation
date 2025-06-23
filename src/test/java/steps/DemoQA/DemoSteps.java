package steps.DemoQA;

import org.testng.Assert;
import io.cucumber.java.en.*;
import pages.DemoQA.PaginaDemoQA;

public class DemoSteps {

    PaginaDemoQA demoQA = new PaginaDemoQA();

    @Given("^El usuario ingresa a la pagina DemoQA Buttons$")
    public void iNavigateToWebB() {
        demoQA.navigateToWebpageB();
    }

    @Given("^El usuario ingresa a la pagina DemoQA Alerts$")
    public void iNavigateToWebT() {
        demoQA.navigateToWebpageA();
    }

    @Given("^El usuario ingresa a la pagina DemoQA Sortables$")
    public void iNavigateToWebS() {
        demoQA.navigateToWebpageS();
    }

    @Given("^El usuario ingresa a la pagina DemoQA frames$")
    public void iNavigateToWebF() {
        demoQA.navigateToWebpageF();
    }

    @Given("^El usuario ingresa a la pagina DemoQA frames anidados$")
    public void iNavigateToWebFN() {
        demoQA.navigateToWebpageFnested();
    }    

    @Given("^El usuario ingresa a la pagina DemoQA ventanas$")
    public void iNavigateToWebW() {
        demoQA.navigateToWebpageW();
    }   

    @Given("^El usuario ingresa a la pagina DemoQA upload$")
    public void iNavigateToWebU() {
        demoQA.navigateToWebpageU();
    }  

    @Given("^El usuario ingresa a la pagina DemoQA slider$")
    public void iNavigateToWebBar() {
        demoQA.navigateToWebpageBar();
    }  

    @Given("^El usuario ingresa a la pagina DemoQA droppable$")
    public void iNavigateToWebD() {
        demoQA.navigateToWebpageD();
    }  

    @When("^El usuario hace un doble clic, clic derecho y clic dinamico$")
    public void actiosClic() {
        demoQA.scrollDownPage();
        demoQA.doubleClic();
        demoQA.rightClic();
        demoQA.dynamicClic();
    }

    @When("^El usuario da clic en los botones de alertas$")
    public void actiosAlerts() {
        demoQA.scrollDownPage();
        demoQA.clicOnAlert1();
        demoQA.cancelAlert();
        demoQA.clicOnAlert2();
        demoQA.cancelAlert();
        demoQA.clicOnAlert3();
        demoQA.cancelAlert();
        demoQA.clicOnAlert3();
        demoQA.okAlert();
        demoQA.clicOnAlert4();
        demoQA.sendWord();
        demoQA.okAlert();

    }

    @When("^El usuario reordena los elementos de la lista$")
    public void newOrderList() {
        demoQA.scrollDownPage2();
        demoQA.moveElements();
    }

    @When("^El usuario reordena los elementos del grid$")
    public void newOrderGrid() {
        demoQA.scrollDownPage2();
        demoQA.clicOnGrid();
        demoQA.moveElements2();
    }

    @When("^El usuario ingresa al frame 1 y valida el texto$")
    public void changeFrame1() {
        demoQA.switchToFrame1();
        Assert.assertEquals("This is a sample page", demoQA.msgFrame1());
        demoQA.backToMainPage();
    }

    @When("^El usuario ingresa al frame 2 y valida el texto$")
    public void changeFrame2() {
        demoQA.switchToFrame2();
        Assert.assertEquals("This is a sample page", demoQA.msgFrame2());
    }

    @When("^El usuario ingresa al parent frame y valida el texto$")
    public void changeParentFrame() {
        demoQA.switchToFrame1();
        Assert.assertEquals("Parent frame", demoQA.msgParentFrame());
    }

    @When("^El usuario ingresa al child frame y valida el texto$")
    public void changeChildFrame() {
        demoQA.switchToChildFrame();
        Assert.assertEquals("Child Iframe", demoQA.msgChildFrame());
    }

    @When("^El usuario carga el archivo deseado$")
    public void uploadFileAction() {
        demoQA.uploadFile();
    }

    @When("^El usuario mueve la barra deslizante$")
    public void actionSliderBar() {
        demoQA.scrollDownPage();
        demoQA.moveSliderBar();
    }

    @When("^El usuario mueve el elemento Drag me dentro del area indicada$")
    public void dragElementSample() {
        demoQA.scrollDownPage();
        demoQA.dragElementSample();
    }

    @Then("^El usuario debe ver los mensajes de confirmacion$")
    public void msgValidations() {
        Assert.assertEquals("You have done a double click", demoQA.correctMsgDoubleClic());
        Assert.assertTrue(demoQA.visibleMsgDoubleClic(),"El elemento no esta presente");
        Assert.assertEquals("You have done a right click", demoQA.correctMsgrightClic());
        Assert.assertTrue(demoQA.visibleMsgRightClic(),"El elemento no esta presente");
        Assert.assertEquals("You have done a dynamic click", demoQA.correctDynamicMsgrightClic());
        Assert.assertTrue(demoQA.visibleDynamicMsgrightClic(),"El elemento no esta presente");
    }

    @Then("^El usuario debe ver el mensaje de confirmacion de alerta$")
    public void msgValidationsAlert() {
        Assert.assertEquals("You entered Test", demoQA.confirmMsg());
    }

    @Then("^El usuario debe validar el nuevo orden de la lista$")
    public void nuevoOrdenLista() {
        Assert.assertEquals("One", demoQA.newListOrderValidation());
    }

    @Then("^El usuario debe validar el nuevo orden del grid$")
    public void nuevoOrdenGrid() {
        Assert.assertEquals("One", demoQA.newgridOrderValidation());
    }

    @Then("^El usuario valida el mensaje de confirmacion de la carga$")
    public void uploadValidation() {
        Assert.assertEquals("C:\\fakepath\\Test.txt", demoQA.msgUpload());
    }

    @Then("^El usuario valida el movimiento de la barra deseado$")
    public void sliderValueValidation() {
        Assert.assertEquals("100", demoQA.sliderValue());
    }

    @Then("^El usuario valida el mensaje correcto$")
    public void droppedLabelValidation() {
        Assert.assertEquals("Dropped!", demoQA.droppedSample());
    }

}
