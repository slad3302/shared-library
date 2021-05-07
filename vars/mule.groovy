#!/usr/bin/env groovy

def foo(obj1, obj2){
    cloud = "$obj1 + $obj2"
    any_env = coo(cloud)
    any_org = soo(obj1, any_env)	
}

def coo(st){
	println "hello $st"
}
def soo(a1, a2){
   println "$a1 and $a2"
}
