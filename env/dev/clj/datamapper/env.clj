(ns datamapper.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [datamapper.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[datamapper started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[datamapper has shut down successfully]=-"))
   :middleware wrap-dev})
