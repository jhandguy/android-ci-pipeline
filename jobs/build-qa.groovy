pipelineJob('build-qa') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelines/build-qa.groovy'))
            sandbox()
        }
    }
}
