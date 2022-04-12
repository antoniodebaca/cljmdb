(ns cljmdb.web
  (:require
   [ring.adapter.jetty :as jetty]
   [compojure.handler :as ch]
   [cljmdb.handler :as mdb]))

(defn -main [& args]
  (let [port (Integer. (or (System/getenv "CLJMDB_PORT")
              3000))]
    (jetty/run-jetty (ch/site #'mdb/app)
                     {:port port 
                      :join? false})))