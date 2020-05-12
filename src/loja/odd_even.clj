(ns loja.odd_even
  (:require [loja.db :as db]))

;count number of odd numbers
(defn odd-counter
  ([coll] (odd-counter 0 coll))
  ([cur-val coll]
   (if (nil? coll)
     cur-val
     (if (odd? (first coll))
       (odd-counter (inc cur-val) (next coll))
       (odd-counter cur-val (next coll))))))

(println (odd-counter (db/get-vector)))