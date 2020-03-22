(ns football-api.components.loading-spinner
  (:require
   [cljs-styled-components.reagent :refer [defstyled defkeyframes]]))


(defkeyframes
  spin
  "from { transform: rotate(0deg);}
   to { transform: rotate(360deg); }")

(defstyled loading-spinner :div {:margin "50px 0"
                                 :font-size "10px"
                                 :position "absolute"
                                 :top "calc(50% - 5rem)"
                                 :left "calc(50% - 5rem)"
                                 :text-indent "-9999"
                                 :border-top "2.5em solid rgba(0, 0, 0, 0.1)"
                                 :border-bottom "2.5em solid rgba(0, 0, 0, 0.1)"
                                 :border-left "2.5em solid rgba(0, 0, 0, 0.1)"
                                 :border-right "2.5em solid rgba(0, 0, 0, 0.2)"
                                 :border-radius "50%"
                                 :width "5rem"
                                 :height "5rem"
                                 :animation (spin "1s linear infinite")})
