(ns exercise3)

(defn fibonacci
  "Fibonacci"
  [numero]
  (if (< numero 2)
  	numero
  	(+ (fibonacci (- numero 1)) (fibonacci (- numero 2)))))
