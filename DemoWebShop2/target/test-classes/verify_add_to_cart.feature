Feature: conform AddToCartbutton

Scenario: confirm all the books having “AddToCart”button
Given  a user is on the landing page of demowrbshop
When he clicks on books in the navigation bar
And he clicks on the firstbook
And he verify the 'add to cart'  button  in the first book
And Again clicks on books in the navigation bar
And he clicks on the secondbook
And he verify the 'add to cart' button in second book
And Again clicks on books in the navigation bar
And he clicks on the thirdbook
And he verify the 'add to cart' button in third book
And Again clicks on books in the navigation bar
And he clicks on the fourthbook
And he verify the 'add to cart' button in fourth book
And Again clicks on books in the navigation bar
And he clicks on the fifthbook
And he verify the 'add to cart' button in fifth book
And Again clicks on books in the navigation bar
And he clicks on the sixthbook
And he verify the 'add to cart' button in sixth book
Then confirm all the books having "AddToCart"button