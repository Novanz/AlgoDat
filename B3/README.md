# Algorithmen und Datenstrukturen
# Übung 3 (AIN2)
Schreiben Sie eine Klasse Textanalyse mit einem Hauptprogramm, das die in
der Kommandozeile übergebenen Argumente auswertet.

1. Zunächst soll das Programm ausgeben, wieviele Strings in der Komman-
dozeile als Argumente übergeben wurden und danach soll ausgegeben
werden, wie lang die einzelnen Argumente sind.
Beispielsweise sollte beim Aufruf `java Textanalyse Dies ist ein Test`
ausgegeben werden, dass 4 Argumente übergeben wurden, die die Längen
4, 3, 3 und 4 haben.
Hinweis: Wenn Sie das Java-Programm unter Eclipse im Debugger lau-
fen lassen, können Sie unter Run→Debug→Arguments die zu verwen-
denden Kommandozeilenparameter eingeben, bevor Sie das Programm
mit Run→Debug As→Java Application starten.
2. Erweitern Sie Ihr Programm so, dass außerdem gezählt wird, wie oft
jeder Buchstabe im Text vorkommt. Dabei soll die Groß-Kleinschreibung
ignoriert werden. Für das obige Beispiel sollte etwa folgende Ausgabe
erzeugt werden:
D: 1
E: 3
I: 3
N: 1
S: 3
T: 3
Hinweise:
• Um auf ein einzelnes Zeichen eines Strings zuzugreifen, gibt es in der
Klasse String die Methode char `charAt(int)`. Beispielsweise erhält
man mit `s.charAt(0)` das erste Zeichen des Strings s.
• Um die Groß/Kleinschreibung zu ignorieren, programmiert man am be-
sten eine statische Methode char gross(char c), die das übergebene
Zeichen c in Großschreibung zurückliefert. Umlaute und Sonderzeichen
können Sie dabei zur Vereinfachung ignorieren.
• Um für jeden Buchstaben einen separaten Zähler zu implementieren,
sollten Sie ein Array (Feld) verwenden.
