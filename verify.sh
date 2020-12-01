#!/usr/bin/env bash
RESPONSE=`curl -s localhost:8080/helloFromProperties`
if [[ "$RESPONSE" == 'Hello Artem from spring boot native!' ]]; then
  exit 0
else
  exit 1
fi