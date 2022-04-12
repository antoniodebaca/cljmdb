(ns cljmdb.admin)

(def admin-login (or (System/getenv "CLJMDB_ADMIN_LOGIN")
                     "admin"))
(def admin-passw (or (System/getenv "CLJMDB_ADMIN_PASSW")
                     "admin"))

(defn check-login [login passw]
  (and (= login admin-login)
       (= passw admin-passw)))