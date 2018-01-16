
pipeline {
  agent any

  stages {
    stage('Seed Android Jobs') {
      steps {
        dir('shared') {
          git url: 'https://github.com/jhandguy/app-ci-pipeline.git'
          sh 'cp jobs/*.groovy ../jobs'
        }

        jobDsl targets: ['jobs/*.groovy'].join('\n'),
               removedJobAction: 'DELETE',
               removedViewAction: 'DELETE',
               sandbox: true,
               additionalParameters: [platform: 'android']
      }
    }
  }
}
