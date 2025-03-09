(ns fizz-buzz.core)

(def special-rules
  {15 "FizzBuzz", 3 "Fizz", 5 "Buzz"})

(defn divisible-by? [n factor]
  (= 0 (rem n factor)))

(defn get-factor [n]
  (first (filter #(divisible-by? n %) (sort > (keys special-rules)))))

(defn fizz-buzz [n]
  (if-let [special-number (get-factor n)]
    (get special-rules special-number)
    n))

(defn fizz-buzz-to-n [n]
  (->> (range 1 (inc n))
       (map #(fizz-buzz %))))

(defn -main [n]
   (run! println(fizz-buzz-to-n (Integer/parseInt n))))