#!/bin/bash

for d in $( ls -d */ )
do
    ( cd "$d" && mvn install -DskipTests )
done

docker-compose build

docker-compose up -d --force-recreate