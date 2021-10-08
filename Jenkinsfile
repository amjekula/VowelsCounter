pipeline{
    agent { docker { image 'maven:3.3.3' } }
    stages{
        stage('log version info'){
            sh 'mvn --version'
            sh 'mvn clean test'
        }
    }
}