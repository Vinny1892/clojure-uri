(ns uri.uri_1007 )

(defn parse-int [s]
  (Integer. (re-find  #"\d+" s )))

(def n1 (read-string (read-line)))
(def n2 (read-string (read-line)))
(def n3 (read-string (read-line)))
(def n4 (read-string (read-line)))

(defn calc-diferenca [n1 n2 n3 n4]
  (- (* n1 n2) (* n3 n4)))


(println "DIFERENCA =" (calc-diferenca n1 n2 n3 n4))
