node {
  stage('Seed') {
    jobDsl targets: ['jobs/build-qa.groovy', 'jobs/build-beta.groovy'].join('\n')
  }
}
