#!/usr/bin/env groovy

def generateAppsInfo(apps, environment, apps_info){
    apps.split("\\r?\\n").each { line ->
        def app_info = line.split(',')

        if (environment == 'Dev'){
            package_name = "${app_info[0]}"
            anypoint_app_name = environment.toLowerCase() + "-" + package_name + "-" + app_info[1]
            version_number = ''
        } else {
            package_name = (app_info[0] =~ /(^.*-(proc|sys|exp)-api)/)[ 0 ][ 1 ]
            version_number = (app_info[0] =~ /(\d+\.\d+\.\d+)$/)[ 0 ][ 1 ]
            anypoint_app_name = environment.toLowerCase() + "-" + package_name + "-" + app_info[1]
        }

        app_properties_path =  "./" + environment.toLowerCase() + "/"  + package_name + "-" + app_info[1] + ".json"

        apps_info[app_info[0]] = [
            app_release_number: app_info[1],
            app_workers_count: app_info[2],
            app_workers_type: app_info[3],
            app_region: app_info[4],
            package_name: package_name,
            version_number: version_number,
            anypoint_app_name: anypoint_app_name,
            app_properties_path: app_properties_path,
            rollback: false
        ]
    }
}

def foo(apps_info){
    apps_info.each{ app, info ->
            //apps_info[app].current_filename = downloadSnapJar(artifactory_user, artifactory_api_key, apps_info[app].package_name)
              println apps_info[app].app_release_number
              println apps_info[app].app_workers_count
              println apps_info[app].app_workers_type
              println apps_info[app].app_region
              println apps_info[app].package_name
              println apps_info[app].version_number
			  println apps_info[app].anypoint_app_name 
              println apps_info[app].app_properties_path
	}		  
}
