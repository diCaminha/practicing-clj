; learning collections

(ns loja.ownfunc
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

;using reduce from clojure
(println (reduce + 0 mycoll))

;using reduce and my custom map together
(println (reduce + 0 (map #(* 2 %) mycoll)))

;creating our own reduce functions
(defn my-reduce
  ([func coll] (my-reduce func 0 coll))
  ([func cur-val coll]
   (if (nil? coll)
     cur-val
     (recur func (func cur-val (first coll)) (next coll)))))

;using my own reduce function
(println (my-reduce + mycoll))
