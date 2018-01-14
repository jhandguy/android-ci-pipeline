
pipeline {
  agent any

  stages {
    stage('Seed Jobs') {
      steps {
        dir('shared') {
          git url: 'https://github.com/jhandguy/app-ci-pipeline.git', branch: 'generic'
        }

        jobDsl targets: ['shared/jobs/*.groovy', 'jobs/*.groovy'].join('\n'),
               removedJobAction: 'DELETE',
               removedViewAction: 'DELETE',
               sandbox: true,
               additionalParameters: [platform: 'android']
      }
    }
  }
}
