(ns javaland.02-java-interop)

;;  __________________
;; < Java Interop >
;;  ------------------
;;       \                    / \  //\
;;        \    |\___/|      /   \//  \\
;;             /0  0  \__  /    //  | \ \    
;;            /     /  \/_/    //   |  \  \  
;;            @_^_@'/   \/_   //    |   \   \ 
;;            //_^_/     \/_ //     |    \    \
;;         ( //) |        \///      |     \     \
;;       ( / /) _|_ /   )  //       |      \     _\
;;     ( // /) '/,_ _ _/  ( ; -.    |    _ _\.-~        .-~~~^-.
;;   (( / / )) ,-{        _      `-.|.-~-.           .~         `.
;;  (( // / ))  '/\      /                 ~-. _ .-~      .-~^-.  \
;;  (( /// ))      `.   {            }                   /      \  \
;;   (( / ))     .----~-.\        \-'                 .~         \  `. \^-.
;;              ///.----..>        \             _ -~             `.  ^-`  ^-_
;;                ///-._ _ _ _ _ _ _}^ - - - - ~                     ~-- ,.-~
;;                                                                   /.-~


;; Clojure ist eine JVM-Sprache. Das bedeutet, dass wir Java-Klassen und -Methoden
;; direkt verwenden können. Wir können sogar Java-Klassen und -Methoden definieren.

;; Wie wir schon gesehen haben, verwendet Clojure sogar einige Typen aus Java, bspw. `String`.

(def string "Hello, World!")

;; Mit dem Punkt-Operator können wir auf Methoden von Java-Klassen zugreifen.

(.toUpperCase string)

;; Wir können auch auf statische Methoden von Java-Klassen zugreifen, bspw. `Integer.parseInt`.

(Integer/parseInt "42")

;; Experimentiere mit anderen Methoden von `Integer` und `String`.








;; -----------------------------------------------------------------------------
;; Import von Java-Klassen

;; Wir können Java-Klassen auch importieren. Dafür gibt es die Funktion `import`.

(import 'java.util.Date)

;; Mit `new` oder der syntaktisch schöneren Variante `Date.` können wir eine Instanz von `Date` erzeugen.

(= (new Date)
   (Date.))

;; Greife nun mit dem Punkt-Operator auf eine Methode aus der `Date`-Klasse zu.
;; Gib bspw. das Jahr des aktuellen Datums zurück.








;; Importiere nun aus java.util die Klasse Random, erzeuge eine Instanz davon 
;; und gib den nächsten Integer zurück.








;; -----------------------------------------------------------------------------
;; Maven Central

;; Wir können auch Java-Bibliotheken aus Maven Central verwenden. Dafür müssen wir
;; die Bibliothek in die Datei `deps.edn` hinzufügen.

;; Suche auf https://search.maven.org/ nach der Bibliothek com.github.ricksbrown:cowsay
;; und füge die aktuellste Version analog zu den anderen Bibliotheken in die Datei `deps.edn` ein.
;; Das Projekt gibt es unter: https://github.com/ricksbrown/cowsay

;; !!!
;; WICHTIG: Wir müssen die REPL neustarten, wenn wir neu hinzugefügte Bibliotheken
;; verwenden möchten. Klicke in VSCode dafür unten auf "REPL" und wähle "Restart the Project REPL".
;; !!!

;; Importiere nun die Klasse `Cowsay` aus der Bibliothek `cowsay` und gib den
;; Text "Hallo, JavaLand" mit einem Drachen aus.

;; TIPP: Du benötigst vermutlich die Funktion `into-array`, um aus einem Vektor
;; von Strings ein Array von Strings zu machen.
;; Mit `println` kannst du den String ausgeben.
