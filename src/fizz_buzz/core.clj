(ns fizz-buzz.core)

(defn fizz-buzz [n]
  (cond (= 0 (rem n 15)) "FizzBuzz"
        (= 0 (rem n 3)) "Fizz"
        (= 0 (rem n 5)) "Buzz"
        :else n))

(defn print-fizz-buzz [n]
  (->> n
       inc
       (range 1)
       (map #(fizz-buzz %))
       print))