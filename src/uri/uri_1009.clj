(ns uri.uri_1009)


(defn parse-int [s]
  (Integer. (re-find  #"\d+" s )))

(def  nome (read-string (read-line)))
(def  salario-fixo-vendedor(read-string (read-line)))
(def  total-de-vendas-efetuadas(read-string (read-line)))


(defn calc-salario-bonus [nome salario-fixo-vendedor valor-recebido-por-hora]
  (calculo-comissao-vendedor  )
  )


(defn calculo-comissao-vendedor [total-de-vendido-pelo-vendedor]
  (->>
    total-de-vendido-pelo-vendedor
    (* 0.15 )
    (+ total-de-vendido-pelo-vendedor)))




