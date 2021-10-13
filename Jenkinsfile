pipeline {
    agent any
    tools{
        maven 'maven3'
    }

    stages {
      //stage('maven compile') {
        steps {
           withMaven (maven: 'maven3'){
                sh 'mvn clean install'
           }
        }
        stage('Upload jar to Nexus'){
            nexusArtifactUploader artifacts: [
                [
                    artifactId: 'VowelsCounter',
                    classifier: '', file:
                    'target/VowelsCounter-1.0-SNAPSHOT.jar',
                    type: 'jar'
                ]
            ], credentialsId: 'nexus-password',
               groupId: 'org.example',
               nexusUrl: '172.17.0.2:8081',
               nexusVersion: 'nexus3',
               protocol: 'http',
               repository: 'maven-snapshots',
               version: '1.0-SNAPSHOT'
        }
      //}
    }
}
