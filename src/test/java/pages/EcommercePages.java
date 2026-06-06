package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.ElementUtil;

public class EcommercePages {

        private WebDriver driver;
        private ElementUtil elementUtil;

        public EcommercePages(WebDriver driver) {
            this.driver = driver;
            elementUtil = new ElementUtil(driver);
        }

        private By navLogin = By.xpath("//a[@href='/login']");
        private By emailField = By.xpath("(//input[@name='email'])[1]");
        private By passwordField = By.xpath("(//input[@name='password'])[1]");
        private By loginBtn = By.xpath("//button[@class='btn btn-default']");
        private By loginError = By.xpath("//button[@class='btn btn-default']");
        private By logOutBtn = By.xpath("//a[@href='/logout']");
        private By deleteBtn = By.xpath("//a[@href='/delete_account']");
        //HomePage
        private By automationText = By.xpath("//span[text()='Automation']");
        private By categoryText = By.xpath("//h2[text()='Category']");
        private By featureItemsText = By.xpath("//h2[@class='title text-center']");
        private By brandsText = By.xpath("//h2[text()='Brands']");
        private By addToCartBtnText = By.xpath("//a[contains(text(), 'Add to cart')]");
        //product page
        private By productBtn = By.xpath("//a[@href='/products']");
        private By searchTextField = By.xpath("//input[@name='search']");
        private By searchButton = By.xpath("//button[@class='btn btn-default btn-lg']");
        private By searchedProductsHeader = By.xpath("//h2[@class='title text-center']");
        private By viewProductBtn = By.xpath("(//a[text()='View Product'])[1]");
        //product Description Page
        private By rupeesOnPDP =  By.xpath("//span[contains(text(), 'Rs.')]");
        private By quantity =  By.xpath("//input[@name='quantity']");
        private By addToCartBtn= By.xpath("//button[@class='btn btn-default cart']");
        private By viewCartBtn = By.xpath("//u[text()='View Cart']");
        private By popUpText = By.xpath("//p[text()='Your product has been added to cart.']");
        //cartPage
        private By closeButton = By.xpath("//a[@class='cart_quantity_delete']");
        private By itemImage = By.xpath("//img[@class='product_image']");
        private By description = By.xpath("//td[@class='cart_description']");
        private By quantityIcon = By.xpath("//td[@class='cart_quantity']");
        private By priceField = By.xpath("//p[@class='cart_total_price']");
        private By proceedToCheckOutBtn = By.xpath("//a[text()='Proceed To Checkout']");
        //checkoutPage
        private By addressDetailText =  By.xpath("//h2[text()='Address Details']");
        private By deliveryAddress = By.xpath("//h3[text()='Your delivery address']");
        private By billingAddress = By.xpath("//h3[text()='Your billing address']");
        private By reviewOrderText = By.xpath("//h2[text()='Review Your Order']");
        private By placeOrderBtn = By.xpath("//a[@class='btn btn-default check_out']");
        //paymentPage
        private By paymentText = By.xpath("//h2[text()='Payment']");
        private By nameOnCardField = By.xpath("//input[@name='name_on_card']");
        private By cardNumber = By.xpath("//input[@name='card_number']");
        private By cvcNumber = By.xpath("//input[@name='cvc']");
        private By expirationMonth = By.xpath("//input[@name='expiry_month']");
        private By  expirationYear = By.xpath("//input[@name='expiry_year']");
        private By payAndConfirmBtn = By.xpath("//button[@class='form-control btn btn-primary submit-button']");
        //congratulationsPage
        private By orderPlacedText = By.xpath("//b[text()='Order Placed!']");
        private By orderConfirmText = By.xpath("//p[text()='Congratulations! Your order has been confirmed!']");
        private By downloadInvoiceBtn = By.xpath("//a[@class='btn btn-default check_out']");
        private By continueButton = By.xpath("//a[@class='btn btn-primary']");







        public void navigateToLogin() {
            elementUtil.click(navLogin);

        }

        public void enterEmail(String email) {
            elementUtil.type(emailField, email);

        }

        public void enterPassword(String password) {
            elementUtil.type(passwordField, password);

        }
        public void clickLogin() {
            elementUtil.click(loginBtn);
        }

        public boolean isLoginErrorDisplayed() {
         return elementUtil.isDisplayed(loginError);
        }

        public boolean checkLoginSuccess() {
           return elementUtil.isDisplayed(logOutBtn) && elementUtil.isDisplayed(deleteBtn);

        }

        public void validationOnHomePage() {
            Assert.assertTrue(elementUtil.isDisplayed(automationText));
            Assert.assertTrue(elementUtil.isDisplayed(categoryText));
            Assert.assertTrue(elementUtil.isDisplayed(featureItemsText));
            Assert.assertTrue(elementUtil.isDisplayed(brandsText));
            Assert.assertTrue(elementUtil.isDisplayed(addToCartBtnText));

        }
        public void clickOnProductBtn() {
            elementUtil.click(productBtn);
        }

       public void validatingOnProductListingPage() {
           elementUtil.type(searchTextField,"women");
           elementUtil.click(searchButton);
          Assert.assertTrue(elementUtil.isDisplayed(searchedProductsHeader));
       }
       public void clickOnViewProductBtn() {
            elementUtil.click(viewProductBtn);
       }
       public void performValidationOnPDP() {
           Assert.assertTrue(elementUtil.isDisplayed(rupeesOnPDP));
           elementUtil.type(quantity,"3");
        }

       public void addToCartBtn() {
           elementUtil.click(addToCartBtn);

       }

    public void performValidationOnPopUp() {
        Assert.assertTrue(elementUtil.isDisplayed(popUpText));

    }

       public void clickOnViewCartBtn() {
            elementUtil.click(viewCartBtn);
       }

       public void performValidationOnCartPage() {
            Assert.assertTrue(elementUtil.isDisplayed(closeButton));
            Assert.assertTrue(elementUtil.isDisplayed(itemImage));
            Assert.assertTrue(elementUtil.isDisplayed(description));
            Assert.assertTrue(elementUtil.isDisplayed(quantityIcon));
            Assert.assertTrue(elementUtil.isDisplayed(priceField));

       }

       public void clickOnProceedToCheckOutBtn() {
            elementUtil.click(proceedToCheckOutBtn);
       }
       public void performsValidationOnCheckoutPage() {
            Assert.assertTrue(elementUtil.isDisplayed(addressDetailText));
            Assert.assertTrue(elementUtil.isDisplayed(deliveryAddress));
            Assert.assertTrue(elementUtil.isDisplayed(billingAddress));
            Assert.assertTrue(elementUtil.isDisplayed(reviewOrderText));
       }
       public void clickOnPlaceOrderBtn() {
            elementUtil.click(placeOrderBtn);
       }
       public void paymentDetailsPage() {
           Assert.assertTrue(elementUtil.isDisplayed(paymentText));
           elementUtil.type(nameOnCardField,"mastercard");
           elementUtil.type(cardNumber,"123456789");
           elementUtil.type(cvcNumber,"433");
           elementUtil.type(expirationMonth,"12");
           elementUtil.type(expirationYear,"2027");
        }

        public void payAndConfirmOrder() {
            elementUtil.click(payAndConfirmBtn);
        }
        public void validateCongratulationPage() {
            Assert.assertTrue(elementUtil.isDisplayed(orderPlacedText));
            Assert.assertTrue(elementUtil.isDisplayed(orderConfirmText));
            elementUtil.click(downloadInvoiceBtn);
            elementUtil.click(continueButton);

        }








    }




