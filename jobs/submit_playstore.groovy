pipelineJob("android-submit-playstore") {
  description("Submit Android App to Playstore")

  definition {
    cps {
      script(readFileFromWorkspace('pipelines/submit_playstore.groovy'))
    }
  }
}
