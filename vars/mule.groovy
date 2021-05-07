#!/usr/bin/env groovy

def foo(obj1, obj2){
    cloud = "$obj1 + $obj2"
    any_env = coo(cloud)	
}

def coo(st){
	println "hello $st"
}

