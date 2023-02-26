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

## **README.md content:**<br>

* Link to the test page
* Descriptions of test scenarios and their steps
* README.md syntax in link

### Link to the test page:

* Link to the test page: [ https://ltglink.lt/](https://ltglink.lt/)

### Descriptions of test scenarios and their steps:

1. Test: "FakePromoCodeTest"<br>
``Test will try to use fake promotion code and check what message 
will be given``

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
``Test will switch between Lithuanian and English languages and check if it will happen``

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

Expected result: Webpage language will be successfully switched between Lithuanian and English languages and will load back to Lithuanian language


3. Test: 

Expected result:

4. Test:

Expected result:

5. Test:

Expected result:

### README.md syntax in link
