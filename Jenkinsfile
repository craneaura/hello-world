pipeline {
  agent any
  stages {
    stage('Source') {
      steps {
        timestamps() {
          git(url: 'https://github.com/craneaura/hello-world.git', branch: 'master', changelog: true, poll: true, credentialsId: 'craneaura@github.com')
        }

      }
    }

  }
}