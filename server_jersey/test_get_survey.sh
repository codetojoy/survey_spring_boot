#!/bin/bash

BASE_URI=http://localhost:5151/server_jersey/rest

RESULT=survey

mkdir -p data
cd data
touch $RESULT.json
rm $RESULT.json

wget -q $BASE_URI/survey?userId=444 -O $RESULT.json

echo "wget result: $?"
echo "" 

cat $RESULT.json

cd .. 
echo ""
echo "Ready."
