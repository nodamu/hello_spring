pipeline {
  agent any
  stages {
    stage('Unit Test') {
      steps {
        sh 'chmod +x gradlew'
        sh './gradlew clean test'
      }
    }

  }
}