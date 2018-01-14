
pipeline {
  agent any

  stages {
    stage('Seed Cross Jobs') {
      steps {

        bat 'ls'
        bat 'ls jobs'

        git url: 'https://github.com/jhandguy/app-ci-pipeline.git', branch: 'master'

        bat 'ls'
        bat 'ls jobs'

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
