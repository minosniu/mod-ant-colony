;;; Initialize parameters
;dimensions of square world
(def dim 80)
;number of ants = nants-sqrt^2
(def nants-sqrt 7)
;number of places with food
(def food-places 35)
;range of amount of food at a place
(def food-range 100)
;scale factor for pheromone drawing
(def pher-scale 20.0)
;scale factor for food drawing
(def food-scale 30.0)
;evaporation rate
(def evap-rate 0.99)

(def animation-sleep-ms 50)
(def ant-sleep-ms 20)
(def evap-sleep-ms 1000)

(def running true)

;;; Load the libraries
(load-file "src/ants-atat.clj")

;;; Launch the world
(use 'overtone.at-at)
(def thread-pool-ant (mk-pool))
(def ants (setup))
(every animation-sleep-ms (partial send-off animator animation) thread-pool-ant)
(dorun (map #(send-off % behave) ants))
(every evap-sleep-ms (partial send-off evaporator evaporation) thread-pool-ant)
