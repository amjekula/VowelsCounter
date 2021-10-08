pipeline {
    agent any
    stages {
      stage('maven compile') {
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