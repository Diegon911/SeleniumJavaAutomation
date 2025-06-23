package steps.PracticaAuto;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.testng.Assert;
import io.cucumber.java.en.*;
import pages.PracticaAuto.PaginaLogin;
import pages.PracticaAuto.PaginaPrueba;
import pages.PracticaAuto.PaginaRegistro;

public class PruebaSteps {

        private String generateRandomEmail() {
        Random random = new Random();
        int randomNumber = random.nextInt(10000); // Generar un número aleatorio entre 0 y 9999
        return "example" + randomNumber + "@example.com";
    }

    PaginaPrueba landingPage = new PaginaPrueba();
    PaginaLogin loginPage = new PaginaLogin();
    PaginaRegistro registerPage = new PaginaRegistro();
 
    @Given("^Yo navego a practicesoftwaretesting.com$")
    public void iNavigateToWeb() {
        landingPage.navigateToWebpage();
    }

    @When("^Yo doy click en Sign in$")
    public void clickSignIn(){
        landingPage.clickOnSignIn();
    }

    @When("^Yo doy click en Register your account$")
    public void clickRegister(){
        loginPage.clickOnRegister();
    }

    @When("^Yo ingreso nombre de forma correcta (.+)$")
    public void nameReg(String criteria){
        registerPage.enterName(criteria);
    }

    @When("^Yo ingreso apellido de forma correcta (.+)$")
    public void lastnameReg(String criteria){
        registerPage.enterLastname(criteria);
    }

    @When("^Yo ingreso fecha de nacimiento de forma correcta (.+)$")
    public void dateReg(String criteria){
        registerPage.enterDate(criteria);
    }
    
    @When("^Yo ingreso direccion de forma correcta (.+)$")
    public void addressReg(String criteria){
        registerPage.enterAddress(criteria);
    }

    @When("^Yo ingreso codigo postal de forma correcta (.+)$")
    public void zipcodeReg(String criteria){
        registerPage.enterZipcode(criteria);
    }

    @When("^Yo ingreso ciudad de forma correcta (.+)$")
    public void cityReg(String criteria){
        registerPage.enterCity(criteria);
    }

    @When("^Yo ingreso estado de forma correcta (.+)$")
    public void stateReg(String criteria){
        registerPage.enterState(criteria);
    }

    @When("^Yo ingreso pais de forma correcta$")
    public void countryReg(){
        registerPage.enterCountry();
    }

    @When("^Yo ingreso telefono de forma correcta (.+)$")
    public void phoneReg(String criteria){
        registerPage.enterPhone(criteria);
    }

    @When("^Yo ingreso email de forma correcta (.+)$")
    public void emailReg(String criteria){
        registerPage.enterEmail(generateRandomEmail());
    }

    @When("^Yo ingreso email repetido (.+)$")
    public void emailRegRep(String criteria){
        registerPage.enterEmail(criteria);
    }

    @When("^Yo ingreso email invalido (.+)$")
    public void emailRegInv(String criteria){
        registerPage.enterEmail(criteria);
    }

    @When("^Yo ingreso password de forma correcta (.+)$")
    public void passReg(String criteria){
        registerPage.enterPass(criteria);
    }

    @When("^Yo doy click en registrar$")
    public void clickRegisterB(){
        registerPage.clickRegisterButton();
    }

    @When("^Yo doy click en el dropdown SORT$")
    public void clickDropdown(){
        landingPage.clickOnDropdown();
    }

    @Then("^El usuario es guardado exitosamente y regreso a la pagina de Login$")
    public void loginLabelText(){
        Assert.assertEquals("Login", loginPage.loginTextLabel());
    }

    @Then("^El usuario no se pudo registrar porque ya existe$")
    public void repeatUserLabelText(){
        Assert.assertEquals("A customer with this email address already exists.", registerPage.repeatUserTextLabel());
    }

    @Then("^El usuario no se pudo registrar porque no tiene nombre$")
    public void noNameUserLabelText(){
        Assert.assertEquals("First name is required", registerPage.unnamedUserTextLabel());
    }

    @Then("^El usuario no se pudo registrar porque no tiene apellido$")
    public void nolastameUserLabelText(){
        Assert.assertEquals("Last name is required", registerPage.unLastnamedUserTextLabel());
    }

    @Then("^El usuario no se pudo registrar porque no tiene fecha de nacimiento$")
    public void noDateLabelText(){
        Assert.assertEquals("Date of Birth is required", registerPage.unDateUserTextLabel());
    }

    @Then("^El usuario no se pudo registrar porque no tiene direccion$")
    public void noAddressLabelText(){
        Assert.assertEquals("Street is required", registerPage.unAdressUserTextLabel());
    }

    @Then("^El usuario no se pudo registrar porque no tiene codigo postal$")
    public void noZipCodeLabelText(){
        Assert.assertEquals("Postcode is required", registerPage.unZipcodeUserTextLabel());
    }

    @Then("^El usuario no se pudo registrar porque no tiene ciudad$")
    public void noCityLabelText(){
        Assert.assertEquals("City is required", registerPage.unCityUserTextLabel());
    }

    @Then("^El usuario no se pudo registrar porque no tiene estado$")
    public void noStateLabelText(){
        Assert.assertEquals("State is required", registerPage.unStateUserTextLabel());
    }

    @Then("^El usuario no se pudo registrar porque no tiene pais$")
    public void noCountryLabelText(){
        Assert.assertEquals("Country is required", registerPage.unCountryUserTextLabel());
    }
    
    @Then("^El usuario no se pudo registrar porque no tiene telefono$")
    public void noPhoneLabelText(){
        Assert.assertEquals("Phone is required.", registerPage.unPhoneUserTextLabel());
    }

    @Then("^El usuario no se pudo registrar porque no tiene correo$")
    public void noEmailLabelText(){
        Assert.assertEquals("Email is required", registerPage.unEmailUserTextLabel());
    }
    
    @Then("^El usuario no se pudo registrar porque el correo es invalido$")
    public void invalidEmailLabelText(){
        Assert.assertEquals("", registerPage.invalidEmailUserTextLabel());
    }

    @Then("^El usuario no se pudo registrar porque no tiene password$")
    public void noPassLabelText(){
        Assert.assertEquals("Password is required", registerPage.unPassUserTextLabel());
    }

    @Then("^El usuario no se pudo registrar porque tiene password corto$")
    public void invalidShortPassLabelText(){
        Assert.assertEquals("Password must be minimal 6 characters long.", registerPage.unPassShortUserTextLabel());
    }

    @Then("^El usuario no se pudo registrar porque tiene password no aceptado$")
    public void nonAcceptedPassLabelText(){
        Assert.assertEquals("Password can not include invalid characters.", registerPage.nonAcceptedPassUserTextLabel());
    }

    @Then("^El usuario obtiene el numero y opciones correctos$")
    public void opcionesDropdownFilter() {
        List<String> lista = landingPage.dropdownOptions();
        List<String> listaEsperada = Arrays.asList("",
                                                        "Name (A - Z)",
                                                        "Name (Z - A)",
                                                        "Price (High - Low)",
                                                        "Price (Low - High)");
        Assert.assertEquals(5,landingPage.dropdownNumberOptions());
        Assert.assertEquals(listaEsperada, lista);
    }


}
