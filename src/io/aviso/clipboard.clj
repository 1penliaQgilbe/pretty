(ns io.aviso.clipboard
  "Utilities for accessing text on the system clipboard using AWT.

  This is segregated from other code to prevent the AWT stack from initializing
  unnecessarily. On OS X, this initialization is seen as a Java application icon appearing in the Dock."
  {:added "0.1.33"}
  (:import
    [java.awt.datatransfer Clipboard DataFlavor StringSelection]
    [java.awt Toolkit]))

(defn- ^Clipboard clipboard
  "Returns the current clipboard."
  []
  (.getSystemClipboard (Toolkit/getDefaultToolkit)))

(defn ^String copy
  "Copies the current contents of the Clipboard, returning its contents as a string."
  []
  (-> (clipboard)
      (.getContents nil)
      (.getTransferData DataFlavor/stringFlavor)))

(defn paste
  "Pastes a string in as the new content of the Clipboard."
  [^String s]
  (.setContents (clipboard) (StringSelection. s) nil))
