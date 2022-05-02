# Testuojame http://Autoplius.lt
##This site was built using 
[GitHub Pages](https://github.com/AlgirdasGud/Autoplius.git).
Baigiamojo darbo reikalavimai:
1. Bent 5 prasmingi testai (kiekviename teste bent 3 žingsniai)
2. Bent 3 skirtingi puslapiai (pages) pasirinktoje svetainėje
3. Page Object Model naudojimas
4. Screenshot on test failure`
5. Paveldėjimas
6. Before / After naudojimas
7. Darbas įkeltas į GIT
8. Explicit Wait panaudojimas

Papildomai naudoju TextNG.Xml įrankį tetstų rezultatams vizualizuoti.

Testų scenarijų ir jų žingsnių aprašymai:

---------Before test-----------
1. Atidaromas puslapis
2. Langas maximizuojamas

--------After test ------------
1.Puslapis uždaromas

--Testuojamas pagrindinis langas --
1. Switching to English (defolt in Lithuanian)
   1.1 The EN button is pressed
   1.2 Scanning the text
   1.3 Compare with the text "Classified ads"

2. Switching the Latvian language
   2.1 The POI button is pressed
   2.2 We read the text
   2.3 Compare with the text "on the screen"

3. Navigation to New Cars
   3.1 Click on New Cars
   3.2 Scanning the text
   3.3 Compare with the text "on the screen"

4. Is the BMW 116 search running?
   4.1 Click New Auto
   4.2 Scanning the text
   4.3 Compare with the text "on the screen"

5. Do a motorcycle search
   5.1 Click New Auto
   5.2 We read the text
   5.3 Compare with the text "on the screen"

----Testuojamas registracija - prisijungimas  EN----

1. Test registration and login
   1.1 Press EN
   1.2 Click Log in
   1.3 Waiting for the login window to open
   1.4 Click Register
   1.5 Send an email
   1.6 Click Sign up
   1.7 Get the text
   1.8 Compare with "on screen" text   

2. Test login with a valid email
   2.1 Click on EN
   2.2 Click Log in
   2.3 Waiting for the login window to open
   2.4 Send an email
   2.5 Click Continue
   2.6 Get the text
   2.7 Compare with "on the screen "text

3. Test login with Facebook
   3.1 Click on EN
   3.2 Click Log in
   3.3 Waiting for the login window to open
   3.4 Click Log in with Facebook
   3.5 Get the text
   3.6 Compare with  "on screen" text

4. Test login with Google
   4.1 Click on EN
   4.2 Click Log in
   4.3 Waiting for the login window to open
   4.4 Click Log in with Google
   4.5 Get the text
   4.6 Compare with "on screen" text

5. .We are testing the connection with Apple
   5.1 Press EN
   5.2 Click Log in
   5.3 Waiting for the login window to open
   5.4 Click Log in with Apple
   5.5 Get the text
   5.6 Compare with on "screen" text .
 
----Test Acount settings  ----




