#!/usr/bin/env bash
mvn clean
mvn install -Dmaven.test.skip=true
docker build -t bruesky/ea_order .
docker push bruesky/ea_order