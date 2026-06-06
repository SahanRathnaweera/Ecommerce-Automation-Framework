package stepDefinition;

import config.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.EcommercePages;


import static utils.Constants.AUTOMATION_EXERCISE;

public class Ecommerce {
    WebDriver driver = DriverFactory.getDriver();
    EcommercePages ecommercePages = new EcommercePages(driver);



    @Given("I am on the landing page")
    public void i_am_on_the_landing_page() {
        Assert.assertTrue(driver.getTitle().contains(AUTOMATION_EXERCISE));

    }

    @When("User navigates to login page")
    public void user_navigates_to_login_page() {
        ecommercePages.navigateToLogin();

    }

    @Then("User enters invalid email and password")
    public void user_enters_invalid_email_and_password() {
        ecommercePages.enterEmail("tharuka@12gmail.com");
        ecommercePages.enterPassword("12345");

    }



    @Then("User sees error message")
    public void user_see_error_message() {
        Assert.assertTrue(ecommercePages.isLoginErrorDisplayed());


    }



    @Then("User enters email and password")
    public void user_enters_email_and_password() {
        ecommercePages.enterEmail("sahantharuka0909@gmail.com");
        ecommercePages.enterPassword("sahan2003");

    }

    @When("User clicks on login button")
    public void user_clicks_on_login_button() {
        ecommercePages.clickLogin();

    }

    @Then("User validates login is success")
    public void user_validates_login_is_success() {
        Assert.assertTrue(ecommercePages.checkLoginSuccess());

    }

    @Then("User performs validation on the home page")
    public void user_performs_validation_on_the_home_page() {
        ecommercePages.validationOnHomePage();

    }

    @When("User clicks on products")
    public void user_clicks_on_products() {
        ecommercePages.clickOnProductBtn();

    }

    @Then("User performs the validation on product listing page")
    public void user_performs_the_validation_on_product_listing_page() {
        ecommercePages.validatingOnProductListingPage();
    }

    @Then("User clicks on view product")
    public void user_clicks_on_view_product() {
        ecommercePages.clickOnViewProductBtn();

    }

    @Then("User performs validation on product description page")
    public void user_performs_validation_on_product_description_page() {
        ecommercePages.performValidationOnPDP();

    }

    @Then("User clicks on add to cart")
    public void user_clicks_on_add_to_cart() {
        ecommercePages.addToCartBtn();

    }

    @Then("User validates the pop up")
    public void user_validates_the_pop_up() {
        ecommercePages.performValidationOnPopUp();


    }

    @When("User clicks on view cart")
    public void user_clicks_on_view_cart() {
        ecommercePages.clickOnViewCartBtn();

    }

    @Then("User performs validation on the cart page")
    public void user_performs_validation_on_the_cart_page() {
        ecommercePages.performValidationOnCartPage();

    }

    @When("User clicks on proceed to checkout")
    public void user_clicks_on_proceed_to_checkout() {
        ecommercePages.clickOnProceedToCheckOutBtn();

    }

    @Then("User performs validation on checkout page")
    public void user_performs_validation_on_checkout_page() {
        ecommercePages.performsValidationOnCheckoutPage();

    }

    @When("User clicks on place order button")
    public void user_clicks_on_place_order_button() {
        ecommercePages.clickOnPlaceOrderBtn();

    }

    @Then("User enters the payment details")
    public void user_enters_the_payment_details() {
        ecommercePages.paymentDetailsPage();

    }

    @Then("User clicks on pay and confirm button")
    public void user_clicks_on_pay_and_confirm_button() {
        ecommercePages.payAndConfirmOrder();

    }

    @Then("User performs validation on the congratulations page")
    public void user_performs_validation_on_the_congratulations_page() {
        ecommercePages.validateCongratulationPage();

    }

}
