#!/usr/bin/env groovy

def foo(obj1, obj2){
    cloud = "$obj1 + $obj2"
    any_env = su(cloud)
    any_org = susu(obj1, any_env)
}

def su(a1){
    return "hello+$a1"
}

def susu(q1, q2){
    return "Namaste $q1 adnd $q2"
}

