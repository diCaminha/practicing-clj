(ns loja.db)

(def pedido1 {
              :usuario 10
              :itens   {
                        :mochila {:id :mochila :qnt 1 :preco-unitario 80}
                        :camisa  {:id :camisa :qnt 2 :preco-unitario 50}
                        :tenis   {:id :tenis :qnt 1 :preco-unitario 100}
                        }
              })
(def pedido2 {
              :usuario 1
              :itens   {
                        :mochila {:id :mochila :qnt 2 :preco-unitario 80}
                        :camisa  {:id :camisa :qnt 1 :preco-unitario 50}
                        :tenis   {:id :tenis :qnt 4 :preco-unitario 100}
                        }
              })
(def pedido3 {
              :usuario 10
              :itens   {
                        :mochila {:id :mochila :qnt 3 :preco-unitario 80}
                        :camisa  {:id :camisa :qnt 5 :preco-unitario 50}
                        :tenis   {:id :tenis :qnt 2 :preco-unitario 100}
                        }
              })
(def pedido4 {
              :usuario 1
              :itens   {
                        :mochila {:id :mochila :qnt 2 :preco-unitario 80}
                        :camisa  {:id :camisa :qnt 3 :preco-unitario 50}
                        :tenis   {:id :tenis :qnt 4 :preco-unitario 100}
                        }
              })

(defn get-all []
  [pedido1 pedido2 pedido3 pedido4])