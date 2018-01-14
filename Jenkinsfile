
pipeline {
  agent any

  stages {
    stage('Seed Cross Jobs') {
      steps {

        sh 'ls'
        sh 'ls jobs'

        git url: 'https://github.com/jhandguy/app-ci-pipeline.git', branch: 'master'

        sh 'ls'
        sh 'ls jobs'

        jobDsl targets: ['jobs/*.groovy'].join('\n'),
               removedJobAction: 'DELETE',
               removedViewAction: 'DELETE',
               sandbox: true,
               additionalParameters: [platform: 'android']
      }
    }
    stage('Seed Android Jobs') {
      steps {
        jobDsl targets: ['jobs/*.groovy'].join('\n'),
               removedJobAction: 'DELETE',
               removedViewAction: 'DELETE',
               sandbox: true
      }
    }
  }
}
