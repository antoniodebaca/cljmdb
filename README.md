# cljmdb

FIXME

## Prerequisites

You will need [Leiningen][] 2.0.0 or above installed.

[leiningen]: https://github.com/technomancy/leiningen

## Running

To start a web server for the application at port 3000, run:

    lein ring server

You can also start your own port
This will start at web.clj:
CLJMDB_PORT=8888 lein run


## License

You will need Docker MongoDB running this is the command to run it:
sudo docker run -d -p 27017-27019:27017-27019 --name mongodb mongo


Copyright © 2022 FIXME
