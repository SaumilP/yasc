#!/bin/bash
java -Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=4000 -jar yasc/target/yasc-1.0-SNAPSHOT.jar yasc/src/main/resources/yasc.yml