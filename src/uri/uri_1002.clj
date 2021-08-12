(ns uri.uri_1002)



(defn parse-int [s]
  (Integer. (re-find  #"\d+" s )))

(def n1 (read-string (read-line)))

(defn calcula-raio-circulo [raio]
  (let [phi 3.14159]
    (* phi (* raio raio))))

(println (format "A=%.4f" (calcula-raio-circulo n1)))
