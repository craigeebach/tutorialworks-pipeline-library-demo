#!/usr/bin/env groovy

def call(String name = 'human') {
	def date = new Date()
	echo "Hello, ${name}, it's now ${date}"
}
