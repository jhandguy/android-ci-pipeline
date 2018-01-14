
pipeline {
  agent any

  stages {
    stage('Seed Android Jobs') {
      git url 'https://github.com/jhandguy/app-ci-pipeline'
      
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
