Deze applicatie maakt gebruikt van het FFF systeem. Het vertaald lengtes naar
furlong, tijd naar fortnight en massa naar firkin. Praktische toepassingen van
dit systeem zijn er eigenlijk niet meer.

Dit project wordt gebouwd en getest met Gradle. Bovendien wordt het op Github
gemaakt en daar gebouwd en getest met Travis-ci en wordt de code kwaliteit gecontroleerd door SonarQube. Zodat het project lokaal op een ontwikkelmachine kan draaien, maar ook een werkende omgeving in een echte buildstraat oplevert. Er zijn een aantal test cases toegevoegd om te leren hoe dat precies werkt in een Java omgeving.

Om met gradle te kunnen werken is gradlew toegevoegd en omdat er is ontwikkeld
met java 11, moet er ook een gradle versie gelijk aan of hoger dan 5.2 worden
gebruikt. Deze wrapper zit ook meegeleverd in de sourcecode en hoeft dus niet
opnieuw te worden aangeroepen (voor het builden op travis is dit opgenomen in .travis.yml)

Om de software te testen wordt het volgende commando uitgevoerd in de projectfolder:
''' ./gradlew clean build test '''

Te beoordelen technieken:
* declareren van variabelen: elke classe in src beschikt over variabelen
* programmeertaal: Java met Gradle
* IDE: VIM
* Primitieve types die worden gebruikt: 
** float: src/main/java/converter/App.java:94
** boolean: src/main/java/converter/App.java:16

* Strings: Format en presenteer een string
** src/main/java/converter/App.java:48

* Return value: sommige methodes in de classes hebben een void return methode en geven dus niets terug, bij andere methoden is de return waarde gedefineerd.
** Geen return: src/main/java/converter/Fortnight.java:51
** Met return: src/main/java/converter/Fortnight.java:43

* Methodes met verschillende parameters: in App.java zijn methoden met float, void en objecten terug te vinden
** src/main/java/converter/App.js:81, 94, 170

* Method overloading: dit wordt onder andere toegepast in App.java waar de methode furlongage twee parameters kan ontvangen in verschillende volgorde
** src/main/java/converter/App.java: 132 vs 142

* If/else: in App.js is een methode running opgenomen die een property controleert en doorgeeft of de app op dit moment runt (eigenlijk dus zegt of de property gezet is doordat de classe is aangemaakt en een object oplevert).
** src/main/java/converter/App.java:82

* Switch: in de methode Firkin staat een switch methode. Deze heeft twee cases, een exception en een default case. De switch werkt op basis van constanten (voor zoverre deze in java bestaan).
** src/main/java/converter/Firkin.java:50

* Array en arraylist: op regel 22 van App.java wordt een lijst opgehaald van options die op de commandline kunnen worden meegegeven.
* Loop over verzameling: 189
* Fouten herkennen: door syntax highlighting zijn fouten te zien, maar doordat er tests bij de opdracht zijn toegevoegd kan ook gecontroleerd worden met gradle. Daarnaast is er nog een analyse met SonarQube.
