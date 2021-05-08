#!/usr/bin/env groovy

def generateAppInfo(anypoint_environment, package_name, app_version, tag){
    if (anypoint_environment == 'Dev'){
        // package_name = "${params.ARTIFACT_ID}"
        anypoint_app_name = anypoint_environment.toLowerCase() + "-" + package_name + "-" + app_version
        build_description = "<b>App name:</b> ${anypoint_app_name},<br> <b>artifactId:</b> ${package_name}"
    } else {
        // package_name = (params.TAG_VERSION =~ /(^.*-(proc|sys|exp)-api)/)[ 0 ][ 1 ]
        version_number = (tag =~ /(\d+\.\d+\.\d+)$/)[ 0 ][ 1 ]
        anypoint_app_name = anypoint_environment.toLowerCase() + "-" + package_name + "-" + app_version
        build_description = "<b>App name:</b> ${anypoint_app_name},<br> <b>Tag:</b> ${tag}"
    }

    app_properties_path =  "./" + anypoint_environment.toLowerCase() + "/"  + package_name + "-" + app_version + ".json"
}
