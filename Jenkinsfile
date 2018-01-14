
pipeline {
  agent any

  stages {
    stage('Seed Android Jobs') {
      steps {
        git url: 'https://github.com/jhandguy/app-ci-pipeline.git', branch: 'master'
        
        jobDsl targets: ['jobs/*.groovy'].join('\n'),
               removedJobAction: 'DELETE',
               removedViewAction: 'DELETE',
               sandbox: true,
               additionalParameters: [platform: params.platform]
      }
    }
  }
}
