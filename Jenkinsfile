pipeline {
  agent any
  stages {
    stage('Unit test') {
      steps {
        sh 'sh "./gradlew clean test"'
      }
    }

  }
}