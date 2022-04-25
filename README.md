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


Testų scenarijų ir jų žingsnių aprašymai:

---------Before test-----------
1. Atidaromas puslapis
2. Langas maximizuojamas

--------After test ------------
1.Puslapis uždaromas

--Testuojamas pagrindinis langas --

1. Anglų kalbos perjungimas (defoult lietuvių kalba)
   1.1 Nuspaudžiamas mygtukas EN
   1.2 Nuskaitome tekstą
   1.3 Lyginame su tekstu "Classified ads"

2. Latvių kalbos perjungimas
   2.1 Nuspaudžiamas mygtukas LV
   2.2 Nuskaitome tekstą
   2.3 Lyginame su tekstu "************"

3. Navigacija į Nauji auto
   3.1 Spaudžiam Nauji auto
   3.2 Nuskaitome tekstą
   3.3 Lyginame su tekstu "***********"
4.Navigacija į Nauji auto
   4.1 Spaudžiam Nauji auto
   4.2 Nuskaitome tekstą
   4.3 Lyginame su tekstu "***********"

5.Navigacija į Auto paskola
   5.1 Spaudžiam Nauji auto
   5.2 Nuskaitome tekstą
   5.3 Lyginame su tekstu "***********"

----Testuojamas registracija - prisijungimas  EN----

1. Testuojame registraciją
   1.1 Spaudžiame EN
   1.2 Spaudžiame Log in
   1.3 Laukiam kol atsidaro prisijungimo langas
   1.4 Spaudžiame Register
   1.5 Parašome email
   1.6 Spaudžiam Sign up
   1.7 Nuskaitome tekstą
   1.8 Lyginame su tekstu "************"

2. Testuojame prisijungimą su validžiu email
    2.1 Spaudžiame EN
    2.2 Spaudžiame Log in
    2.3 Laukiam kol atsidaro prisijungimo langas
    2.4 Parašome email
    2.5 Spaudžiam Continue
    2.6 Nuskaitome tekstą
    2.7 Lyginame su tekstu "************"

3. Testuojame prisijungimą su Facebook
   3.1 Spaudžiame EN
   3.2 Spaudžiame Log in
   3.3 Laukiam kol atsidaro prisijungimo langas
   3.4 Spaudžiam Log in with Facebook
   3.5 Nuskaitome tekstą
   3.6 Lyginame su tekstu "************

4. Testuojame prisijungimą su Google
   4.1 Spaudžiame EN
   4.2 Spaudžiame Log in
   4.3 Laukiam kol atsidaro prisijungimo langas
   4.4 Spaudžiam Log in with Google
   4.5 Nuskaitome tekstą
   4.6 Lyginame su tekstu "************

5.Testuojame prisijungimą su Apple
   5.1 Spaudžiame EN
   5.2 Spaudžiame Log in
   5.3 Laukiam kol atsidaro prisijungimo langas
   5.4 Spaudžiam Log in with Apple
   5.5 Nuskaitome tekstą
   5.6 Lyginame su tekstu "************ 