(ns project-b.core-test
  (:require [clojure.test :refer :all]
            [project-b.core :refer :all]))

(deftest a-test
  (testing "I totally expect bar."
    (is (= :bar  (foo)))))
