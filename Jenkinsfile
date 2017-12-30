
pipeline {
  agent any

  stages {
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
