(defproject schemers "1.0.0-SNAPSHOT"
  :description "FIXME: write description"
  :dependencies [[org.clojure/clojure "1.4.0"]]

  :plugins [[lein-swank "1.4.4"]
            [lein-pprint "1.1.1"]
            [lein-ring "0.6.2"]
            [lein-difftest "1.3.8"]
            [lein-notes "0.0.1"]]
  
  :dev-dependencies [[clj-stacktrace "0.2.4"]
                     [swank-clojure "1.3.3"]]  )