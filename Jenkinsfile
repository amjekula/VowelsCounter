pipeline {
    agent any
    stages {
      stage('maven build') {
        steps {
           withMaven (maven: 'maven3'){
                sh 'mvn clean compile'
           }
        }
      }

      stage('maven test') {
        steps {
        withMaven(maven: 'maven3'){
            sh 'mvn test'
            }
        }
      }
    }
}