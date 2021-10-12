/*pipeline {
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
*/

node {
   def mvnHome
   stage('Preparation') {
      git 'https://github.com/amjekula/VowelsCounter.git'
      mvnHome = tool 'maven3'
   }
   stage('Build') {
      if (isUnix()) {
         sh "'${mvnHome}/bin/mvn' -Dmaven.test.failure.ignore clean package"
      } else {
         bat(/"${mvnHome}\bin\mvn" -Dmaven.test.failure.ignore clean package/)
      }
   }
   stage('Results') {
      junit '**/target/surefire-reports/TEST-*.xml'
      archive 'target/*.jar'
   }
   stage('Publish') {
nexusPublisher nexusInstanceId: 'nexus101', nexusRepositoryId: 'vowels-counter-app', packages: [[$class: 'MavenPackage', mavenAssetList: [[classifier: '', extension: '', filePath: 'target/Testing-1.0-SNAPSHOT.jar']], mavenCoordinate: [artifactId: 'Testing', groupId: 'org.example', packaging: 'jar', version: '1.0-SNAPSHOT']]]   }
}
