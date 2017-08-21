(ns exercise3)

(defn fibonacci
  "Fibonacci"
  [number]
  (if (< number 2)
  	number
  	(+ (fibonacci (- number 1)) (fibonacci (- number 2)))))
