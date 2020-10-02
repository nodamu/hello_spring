pipeline {
  agent any
  stages {
    stage('Unit Test') {
      steps {
        sh 'chmod +x gradlew'
        sh '''sudo apt install default-jdk
'''
        sh './gradlew clean test'
      }
    }

  }
}