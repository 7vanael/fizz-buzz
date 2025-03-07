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

  (it "returns the first factor it is divisible by for n"
    (should= 15 (get-factor 15))
    (should= 3 (get-factor 9))
    (should= 5 (get-factor 5))
    (should= nil (get-factor 7))
    (should= nil (get-factor 11))
    )

  (it "gets FizzBuzz to n"
   (should= '(1 2 "Fizz" 4 "Buzz" "Fizz" 7 8 "Fizz" "Buzz" 11 "Fizz" 13 14 "FizzBuzz") (fizz-buzz-to-n 15)))

  (it "prints fizzbuzz"
    (should= "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n" (with-out-str (-main))))
    )

