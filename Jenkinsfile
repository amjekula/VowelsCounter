pipeline {
    agent any
    environment {
//         NEXUS_CREDS = credentials('NexusArtifactoryLogin')
        NEXUS_USER = "admin"
        NEXUS_PASSWORD = "password"
      }
    stages {
      stage('maven compile') {
        steps {
           withMaven (maven: 'maven3'){
                sh 'mvn clean deploy'
           }
        }
      }
    }
}
