
pipeline {
  agent any

  stages {
    stage('Seed Jobs') {
      steps {
        dir('shared') {
          git url: 'https://github.com/jhandguy/app-ci-pipeline.git', branch: 'generic'
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
