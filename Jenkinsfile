pipeline {
  agent any
  stages {
    stage('Unit test') {
      steps {
        sh '''
chmod +x gradlew'''
        sh 'sh "./gradlew clean test"'
      }
    }

  }
}