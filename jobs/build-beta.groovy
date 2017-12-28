pipelineJob('build-beta') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelines/build-beta.groovy'))
            sandbox()
        }
    }
}
