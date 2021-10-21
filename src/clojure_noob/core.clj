(ns clojure-noob.core
  (:gen-class))

(def jonny {:first "Jonny" :last "Pringle" :age 40})
(def tony {:first "Tony" :last "Pringle" :age 10})
(defn -main []
  (if (> (get jonny :age)  (get tony :age))
    (println "Rekt")
    (println "lol")))

