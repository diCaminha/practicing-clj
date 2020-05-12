; learning collections

(ns loja.aula3
  (:require [loja.db :as l.db]))

;a collection used in examples
(def mycoll [1 2 3 4 5 6 7 8])

;using map from clojure
(println (map #(* 2 %) mycoll))

;creating our own map functions
(defn my-map [func coll & maped-coll]
  (if (nil? coll)
    (reverse maped-coll)
    (recur func (next coll) (conj maped-coll (func (first coll))))))

(println (my-map #(* 2 %) mycoll))

