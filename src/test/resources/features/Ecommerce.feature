Feature:Ecommerce Automation

  Scenario: Login fails with invalid credentials
    Given I am on the landing page

    When User navigates to login page
    Then User enters invalid email and password
    Then User clicks on login button
    Then User sees error message

   Scenario: Open landing page
     Given I am on the landing page

     When User navigates to login page
     Then User enters email and password
     Then User clicks on login button
     Then User validates login is success

     Then User performs validation on the home page
     When User clicks on products
     Then User performs the validation on product listing page

     Then User clicks on view product
     Then User performs validation on product description page

     Then User clicks on add to cart
     Then User validates the pop up

     When User clicks on view cart
     Then User performs validation on the cart page

     When User clicks on proceed to checkout
     Then User performs validation on checkout page

     When User clicks on place order button
     Then User enters the payment details
     Then User clicks on pay and confirm button

     Then User performs validation on the congratulations page









