#!/usr/bin/env groovy

def call(String name = 'human') {
	var date = new Date();
	echo "Hello, ${name}, it's now ${date}"
}
