Deze applicatie maakt gebruikt van het FFF systeem. Het vertaald lengtes naar
furlong, tijd naar fortnight en massa naar firkin. Praktische toepassingen van
dit systeem zijn snelheidsmeters en verbruiksmeters.

Dit project wordt gebouwd en getest met Gradle. Bovendien wordt het op Github
gemaakt en daar gebouwd en getest met Travis-ci.

Om met gradle te kunnen werken is gradlew toegevoegd en omdat er is ontwikkeld
met java 11, moet er ook een gradle versie gelijk aan of hoger dan 5.2 worden
gebruikt. Deze wrapper zit ook meegeleverd in de sourcecode en hoeft dus niet
opnieuw te worden aangeroepen.

Om de software te testen wordt het volgende commando uitgevoerd in de projectfolder:
''' ./gradlew clean build test '''

Te beoordelen technieken:
* declareren van variabelen: elke classe in src beschikt over variabelen
* programmeertaal: Java met Gradle
* IDE: VIM
* Primitieve types die worden gebruikt: 
** int: @TODO
** float: src/main/java/converter/App.java:117
** boolean: src/main/java/converter/App.java:13

* Strings: worden door alle classes heen gebruikt, in App.java staat onderaan een String representatie methode die snelheid toont
** src/main/java/converter/App.java:124

* Return value: sommige methodes in de classes hebben een void return methode en geven dus niets terug, bij andere methoden is de return waarde gedefineerd.
** Geen return: src/main/java/converter/Fortnight.java:51
** Met return: src/main/java/converter/Fortnight.java:43

* Methodes met verschillende parameters: elke classe in de src map kent meerdere methodes die verschillen in parameter lengte.
** src/main/java/converter/App.js:66 vs 77

* Method overloading: dit wordt onder andere toegepast in App.java waar de methode furlongage twee parameters kan ontvangen in verschillende volgorde
** src/main/java/converter/App.java:77 vs 87

* If/else: in App.js is een methode running opgenomen die een property controleert en doorgeeft of de app op dit moment runt (eigenlijk dus zegt of de property gezet is doordat de classe is aangemaakt en een object oplevert).
** src/main/java/converter/App.java:27

* Switch: in de methode Firkin staat een switch methode. Deze heeft twee cases, een exception en een default case. De switch werkt op basis van constanten (voor zoverre deze in java bestaan).
** src/main/java/converter/Firkin.java:50

* Array en arraylist: @TODO
* Loop over verzameling: @TODO
* Fouten herkennen: door syntax highlighting zijn fouten te zien, maar doordat er tests bij de opdracht zijn toegevoegd kan ook gecontroleerd worden met gradle.


