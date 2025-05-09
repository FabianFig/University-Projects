#!/bin/bash

if [ $# -ne 2 ]; then
	echo "usage: $0 <firstName> <lastName>"
	exit 1
fi

echo "My name is $1 $2"
echo "I am running this script from `pwd`"
echo "My username is `whoami`"
echo "I am logged into `hostname`"
