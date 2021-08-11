(ns uri.uri_1005)
(defn parse-int [s]
  (Integer. (re-find  #"\d+" s )))

(def n1 (read-string (read-line)))
(def n2 (read-string (read-line)))


(defn calcula-nota-a-partir-do-peso [nota]
  (if (.equals (:tipo  nota)  "A")  (* (:nota nota) 3.5)  (* (:nota nota)  7.5) ))

(defn multiplica-media-aluno [nota1 nota2]
  (+ nota1 nota2))

(defn divide-nota [valor1]
  (/ valor1 11))

(defn calcula-media [nota1 nota2]
  (let [ notas  [ {  :tipo "A", :nota  nota1  }  { :tipo "B", :nota nota2  } ] ]
    (->>  notas
      (map calcula-nota-a-partir-do-peso)
      (reduce multiplica-media-aluno)
      (divide-nota))))

(println "MEDIA ="
  (calcula-media n1 n2))
;;; (println "MEDIA =")
;5.0  7.1
;3.5  7.5

