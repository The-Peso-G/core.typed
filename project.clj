(defproject org.typedclojure/core.typed.lib.clojure "0.7.0"
  :description "Type annotations and macros for the base Clojure distribution."
  :url "https://github.com/typedclojure/core.typed.lib.clojure"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :repositories {"sonatype-oss-public" {:url "https://oss.sonatype.org/content/groups/public/"}}
  :deploy-repositories [["releases"  {:sign-releases false :url "https://clojars.org/repo"}]
                        ["snapshots" {:sign-releases false :url "https://clojars.org/repo"}]]
  :release-tasks [["vcs" "assert-committed"]
                  ["change" "version" "leiningen.release/bump-version" "release"]
                  ["vcs" "commit"]
                  ["vcs" "tag" "v" "--no-sign"]
                  ["deploy"]
                  ["change" "version" "leiningen.release/bump-version"]
                  ["vcs" "commit"]
                  ["vcs" "push"]]
  :source-paths ["src/main/clojure/"]
  :test-paths ["src/test/clojure/"]
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/core.typed.runtime.jvm "0.7.1"]])
