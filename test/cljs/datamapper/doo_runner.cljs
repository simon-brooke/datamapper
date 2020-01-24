(ns datamapper.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [datamapper.core-test]))

(doo-tests 'datamapper.core-test)

