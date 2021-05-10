#!/usr/bin/env groovy

def generateAppsInfo(params.ARTIFACT_ID, params.REGION){
   pg = params.ARTIFACT_ID
   rg = params.REGION
   println $pg and $rg	
}
