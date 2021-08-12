(ns uri.uri_1008)


(defn parse-int [s]
  (Integer. (re-find  #"\d+" s )))

(def  numero (read-string (read-line)))
(def  numero-de-horas-trabalhadas(read-string (read-line)))
(def  valor-recebido-por-hora(read-string (read-line)))


(defn  calc-salario
  [ numero-de-horas-trabalhadas valor-recebido-por-hora ]
  (* numero-de-horas-trabalhadas valor-recebido-por-hora))

(println "NUMBER =" numero)
(println (format "SALARY = U$ %.2f"   (calc-salario numero-de-horas-trabalhadas valor-recebido-por-hora)))


