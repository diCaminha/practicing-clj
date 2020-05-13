(ns loja.aula3
  (:require [loja.db :as db]))

(def itens-agrupados (group-by :usuario (db/get-all)))

(defn total-pedido [[item-id item]]
  (* (get :qnt item 0) (get :preco-unitario item 0)))

(defn get-total-preco-pedido [itens-do-pedido]
  (reduce + 0 (map total-pedido itens-do-pedido)))

(defn get-total-preco-pedidos [pedidos]
  (->> pedidos
       (map :itens)
       (map get-total-preco-pedido)))

(defn conta-total-por-usuario
  [[usuario-id pedidos]]
  {
   :usuario-id usuario-id
   :total-pedidos (count pedidos)
   :preco-total (get-total-preco-pedidos pedidos)
   })

(->> (db/get-all)
     (group-by :usuario)
     (map conta-total-por-usuario)
     println)