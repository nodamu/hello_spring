pipeline {
  agent any
  stages {
    stage('Unit test') {
      steps {
        sh '''
sh " chmod +x gradlew && ./gradlew clean test"
'''
      }
    }

  }
}