node {
  jobDsl targets: ['jobs/build-qa.groovy', 'jobs/build-beta.groovy'].join('\n'),
         removedJobAction: 'DELETE',
         removedViewAction: 'DELETE',
         lookupStrategy: 'SEED_JOB'
}
