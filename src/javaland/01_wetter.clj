(ns javaland.01-wetter
  (:require [clj-http.client :as client]
            [clojure.data.json :as json]))

;;;; Web Requests

;; In Clojure können wir Ressourcen mit der Funktion `slurp` laden. Das können
;; lokale Dateien sein, aber auch Webseiten.

;; Wetterdaten für das Phantasialand gibt es bspw. hier: https://wttr.in/phantasialand
;; Die Funktion `slurp` gibt uns den Inhalt der Webseite als String zurück.

(def url "https://wttr.in/phantasialand")

;; Gib den Inhalt der Webseite als String zurück, indem du die Funktion `slurp`
;; mit der URL von oben aufrufst.











;; Das Format ist nur leider schwer verwendbar. Wir können aber den Query-Parameter `format`
;; mit an den Request geben, bspw. `format=3` für eine kompakte Darstellung.

;; Gib eine kompakte Darstellung der Wetterdaten für das Phantasialand zurück. 











;; Wir können auch die Funktion `client/get` verwenden, um einen HTTP-Request zu machen.
;; Die Funktion `client/get` gibt uns ein Map zurück, das unter anderem den Inhalt der
;; Webseite unter dem Schlüssel `:body` enthält.

;; Nutze die Funktion `client/get` und gib den Inhalt der Webseite zurück.
;; Extrahiere dann den Inhalt aus der Map unter dem Schlüssel `:body` und speichere
;; ihn in der Variablen `body`.









;; -----------------------------------------------------------------------------
;; JSON

;; JSON ist ein weit verbreitetes Format, um Daten auszutauschen. Wir können JSON
;; in Clojure mit der Funktion `json/read-str` in Maps oder Vektoren umwandeln:

(json/read-str "{\"hello\":\"JavaLand\"}" :key-fn keyword)

;; Die `key-fn` gibt dabei die Funktion an, die auf die Schlüssel der Map angewendet
;; werden sollen, um sie in Keywords umzuwandeln.

(keyword "JavaLand")



;; Fragen wir nun die GitHub API ab, die uns die beliebtesten Clojure Repositories zurückgibt.
;; Ein Beispielaufruf könnte so aussehen: https://api.github.com/search/repositories?q=stars:%3E10000%20language:Clojure&sort=stars

(def popular-clojure-repos "https://api.github.com/search/repositories?q=stars:>10000 language:Clojure&sort=stars")



;; Nutze nun die Funktion `client/get` und konvertiere das Ergebnis mithilfe von
;; `json/read-str` in eine Map. Gib die Map zurück.







;; Unter dem Schlüssel `:items` findest du alle Repositories, die die Suchanfrage erfüllen.











;; Gib nun alle Namen der Repositories zurück, die die Suchanfrage erfüllen.









;; Konstruiere nun einen Vektor von Maps mit den Namen der Repositories, der URL zum Repo,
;; und der Anzahl der Sterne, die sie haben.

;; Beispiel:

[{:name "javaland2023"
  :url "https://github.com/clojuredus/javaland2023"
  :stars 0}]
