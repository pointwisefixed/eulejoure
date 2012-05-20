(ns problem1)

(def problem1 (reduce (fn[ac x] (+ ac (if (or (= (mod x 3) 0) (= (mod  x 5) 0)) x 0))) 0 (range 1 1000))) 


