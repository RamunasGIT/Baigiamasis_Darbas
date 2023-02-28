<!--
## Baigiamasis darbas

**Baigiamojo darbo reikalavimai:**<br>
1. *Bent 5 prasmingi testai (kiekviename teste bent 3 žingsniai)*
2. *Bent 3 skirtingi puslapiai (pages) pasirinktoje svetainėje*
3. *Page Object Model naudojimas*
4. *Screenshot on test failure*
5. *Paveldėjimas*
6. *Before / After naudojimas*
7. *Darbas įkeltas į GIT*
8. *Explicit Wait panaudojimas*
9. *Pasidalinti Git repository nuoroda*
-->

<center> -- README.md -- </center>

## **README.md content:**<br>

* Link to the test page
* Descriptions of test scenarios and their steps

### Link to the test page:

* Tests were made in page: [ https://ltglink.lt/](https://ltglink.lt/)

### Descriptions of test scenarios and their steps:

1. Test: "FakePromoCodeTest"<br>
>Test will try to use fake promotion code and check what message
   will be given

- Open Chrome web browser with url: https://ltglink.lt/
- Click on promotion button "Naudoti akcijos kodą"
- In promotion code field put fake promotion code "Nuolaida"
- Click on promotion code button to activate promotion
- Activate delay for the webpage will be able to check code and show result text
- Read promo code message at the header of webpage and put it to "actualResult"
- Check if "actualResult" contains "expectedResult" (Screenshot on test failure)
- Close Chrome web browser

Expected result: After use of fake promo code the webpage will show message that
the code is wrong: "Įvestas akcijos kodas neteisingas"

2. Test: "ChangeLanguageTesting"<br>
>Test will switch between Lithuanian and English languages and check if it will happen

- Open Chrome web browser with url: https://ltglink.lt/
- Click on language bar to open language menu
- Click on English language radio button
- wait for the webpage to load English language
- Get language name and put it to actualResult variable
- Compare if actualResult contains expectedResultEN
- Click on language bar to open language menu
- Click on Lithuania language radio button
- wait for the webpage to load Lithuanian language
- Get language name and put it to actualResult variable
- Compare if actualResult contains expectedResultLT
- If any failure - make screenshot.
- Close Chrome web browser.

Expected result: Webpage language will be successfully switched between Lithuanian and English languages and will load
back to Lithuanian language

3. Test: SearchForTicketsTest<br>
>This test will fill travel data to search fields and activate search button

- Open tickets webpage: http://bilietas.ltglink.lt
- Fill travel "From" field
- Fill travel "To" field
- Clink on Date field
- Click on month change button
- Then choose travel date 2023-03-08
- Click on search button
- Delay to show search result
- Put current url to actualResult
- Check if current url contains expected search date.
- If any failure - make screenshot.
- Close browser

Expected result: Expected that search results will show Vilnius-Kaunas train ticket list on 2023-03-08 date

4. Test: "FakeLoginTesting"<br>
> This test will fill invalid login data, puch login button and check message from webpage

- Open login webpage: https://bilietas.ltglink.lt/account/login
- Put Username "Ramūnas" to username field.
- Put password to password field.
- Click on login button.
- Wait for message to show on screen
- Get webpage login message text and put it to actualResult.
- Compare if actualResult contains expectedResult
- If any failure - make screenshot.
- Close browser

Expected result: when put invalid login data Loginwebpage should show message - "Invalid login credentials".

5. Test: "PrivacyTest"<br>
>Test will change cookie setting and check if change is set

- Open Privacy webpage: https://ltglink.lt/privatumo-pranesimas
- Click on edit CookieSettings button
- Click on radiobutton to check Analytical cookies
- Check if the cookie radio button is on and put it to "actualResul"
- Click cookies bar agree button to close the bar
- Go to home page
- Compare if actualResult contains expectedResult
- If any failure - make screenshot.
- Close browser

Expected result: Analytical cookies radio button will be checked succsessfully

<br><br>
<center>
-- End of README.md --
</center>