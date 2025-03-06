(ns fizz-buzz.core-spec
  (:require [speclj.core :refer :all]
            [fizz-buzz.core :refer :all]))

(describe "Fizz-Buzz"
  (it "returns 1 for 1"
    (should= 1 (fizz-buzz 1)))
  (it "returns Fizz for 0 mod 3"
    (should= "Fizz" (fizz-buzz 3))
    (should= "Fizz" (fizz-buzz 6)))
  (it "returns Buzz for 0 mod 5"
    (should= "Buzz" (fizz-buzz 5))
    (should= "Buzz" (fizz-buzz 10)))
  (it "returns FizzBuzz for 0 mod 15"
    (should= "FizzBuzz" (fizz-buzz 15))
    (should= "FizzBuzz" (fizz-buzz 30)))


  (it "prints fizzbuzz"
    (should="(1 2 Fizz)" (with-out-str (print-fizz-buzz 3))))
    )

