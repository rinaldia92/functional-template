(ns exercise2)

(defn only-greater-than-five
  "Filter a list by numbers greater than five."
  [numbers]
  (filter (fn [number] (> number 5)) numbers))
