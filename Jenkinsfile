pipeline {
    agent any
    stages {
      stage('build') {
        steps {
           withMaven{
                sh 'mvn clean compile'
           }
        }
      }

      stage('test') {
        steps {
        withMaven{
            sh 'mvn test'
            }
        }
      }
    }
}