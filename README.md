[![Clojars](https://img.shields.io/clojars/v/io.aviso/pretty.svg)](http://clojars.org/io.aviso/pretty)
[![CI](https://github.com/AvisoNovate/pretty/actions/workflows/clojure.yml/badge.svg)](https://github.com/AvisoNovate/pretty/actions/workflows/clojure.yml)

[Full Documentation](http://ioavisopretty.readthedocs.org/en/latest/)

[API](http://avisonovate.github.io/docs/pretty/)

*Sometimes, neatness counts.*

If you are trying to puzzle out a stack trace, 
pick a critical line of text out of a long stream of console output,
or compare two streams of binary data, a little bit of formatting can go a long way.

That's what _io.aviso/pretty_ is for.  It adds support for pretty output where it counts:

* Readable output for exceptions
* ANSI font and background color support
* Hex dump of binary data
* Hex dump of binary deltas
* Formatting data into columns

![Example](docs/images/formatted-exception.png)

[Full Documentation](http://ioavisopretty.readthedocs.org/en/latest/)

Pretty is also incorporated into the [ultra](https://github.com/venantius/ultra/) plugin,
and is packaged as part of [Boot](https://github.com/boot-clj/boot).


Parts of Pretty can be used with [Babashka](https://book.babashka.org/#introduction), such as the `io.aviso.ansi` namespace; however,
Babashka runs in an interpreter and its approach to exceptions is
incompatible with JVM exceptions.

----

io.aviso/pretty is released under the terms of the Apache Software License 2.0.
