#!/bin/sh
mvn clean package && docker build -t learining.jee/event .
docker rm -f event || true && docker run -d -p 8080:8080 -p 4848:4848 --name event learining.jee/event 
