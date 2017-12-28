pipelineJob('build-beta') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelines/build_beta.groovy'))
            sandbox()
        }
    }
}
