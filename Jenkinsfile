pipeline {
  agent any
  stages {
    stage('Unit test') {
      steps {
        sh '''
chmod +x gradlew'''
        sh './gradlew clean test'
      }
    }

  }
}