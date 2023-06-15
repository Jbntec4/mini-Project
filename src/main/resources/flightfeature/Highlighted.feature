Feature: Flight Register Page Functionality

  Scenario Outline: Verify User able to Register
    Given User navigates to Register Page "https://blazedemo.com/purchase.php "
    When User enters Full Name "<Name>"
    And User enters Address "<address>"
    And User enters city "<city>"
    And User etners state "<state>"
    And User enters Zipcode "<zipCode>"
    And User selects cardType "<cardType>"
    And User enters cardnumber "<cardNumber>"
    And User enters month "<month>"
    And enters Year "<year>"
    And User enters NameonCard "<nameoncard>"
    And User clicks the remebmerbox
    And User clicks the purcahse flight Button
    Then User verifies success message "<message>"

    Examples: 
      | Name    | address | city        | state | zipCode | cardType         | cardNumber   | month | year | nameoncard | message             |
      | yoel    |    1234 | springField | VA    |   22345 | Visa             |    123456780 |     5 | 2023 | yoel       | Successfully Booked |
      | jenifer |   45578 | Asmara      | CA    |   29345 | American Express |   8967843365 |     8 | 2023 | Jen        | Successfully Booked |
      | meron   |   56793 | Orange      | NJ    |  785850 | Diner's Club     |   9067843365 |     9 | 2023 | meron      | Successfully Booked |
      | nesima  |    8765 | Alexandria  | VA    |  763282 | American Express | 67843365 876 |     8 | 2023 | Nes        | Successfully Booked |
      | Julia   |    6578 | Asmara      | Va    |   52345 | Visa             |  16777843365 |    10 | 2023 | Julia      | Successfully Booked |
