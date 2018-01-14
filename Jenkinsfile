
pipeline {
  agent any

  stages {

    git url 'https://github.com/jhandguy/app-ci-pipeline'

    stage('Seed Android Jobs') {
      steps {
        jobDsl targets: ['jobs/*.groovy'].join('\n'),
               removedJobAction: 'DELETE',
               removedViewAction: 'DELETE',
               sandbox: true,
               additionalParameters: [platform: params.platform]
      }
    }
  }
}
