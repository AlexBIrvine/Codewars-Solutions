(ns game.function.move)

(defn move [position roll]
  (+ position (* roll 2)))