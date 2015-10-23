#!/usr/bin/env bash

cd docker

docker build --rm -t balamaci/oracle-jdk8 -f oracle-jdk8.dockerfile .

docker build --rm -t balamaci/tomcat7-jdk8 -f tomcat7-jdk8.dockerfile .

docker build --rm -t balamaci/mvn3-jdk8 -f mvn3-jdk8.dockerfile .

docker build --rm -t balamaci/ui-tests -f ui-tests.dockerfile .