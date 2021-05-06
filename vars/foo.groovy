#!/usr/bin/env groovy

def call(obj1,obj2){
    println "calling from 1st $obj2"
    validate(obj1)
}

def validate(st){
    println "calling from 2nd $st"
}
