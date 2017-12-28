pipelineJob('build-qa') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelines/build-beta.groovy'))
            sandbox()
        }
    }
}
