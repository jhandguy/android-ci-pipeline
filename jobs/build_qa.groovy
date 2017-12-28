pipelineJob('build-qa') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelines/build_qa.groovy'))
            sandbox()
        }
    }
}
