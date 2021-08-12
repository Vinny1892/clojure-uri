(ns uri.uri_1006)

(defn parse-double [s]
  (Double. (re-find  #"\d+" s )))

(def nota1 (read-string (read-line)))
(def nota2 (read-string (read-line)))
(def nota3 (read-string (read-line)))



(defn calcula-nota-a-partir-do-peso [nota]
  (* (:peso nota) (:nota nota) ))

(defn multiplica-media-aluno [nota1 nota2]
  (+ nota1 nota2))

(defn divide-nota [valor1]
  (/ valor1 10))

(defn calcula-media [nota1 nota2 nota3]
  (let [ notas  [
                 { :peso 2, :nota  nota1 }
                 { :peso 3, :nota nota2  }
                 { :peso 5, :nota nota3  }
                 ] ]
    (->>  notas
          (map calcula-nota-a-partir-do-peso)
          (reduce multiplica-media-aluno)
          (divide-nota))))

(println (format "MEDIA = %.1f"
                 (calcula-media nota1 nota2 nota3)))
;;; (println "MEDIA =")
;5.0  7.1
;3.5  7.5
