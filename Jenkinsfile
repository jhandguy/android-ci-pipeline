
pipeline {
  agent any

  stages {
    stage('Seed Cross Jobs') {
      steps {
        git url: 'https://github.com/jhandguy/app-ci-pipeline.git', branch: 'master'

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
