pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                echo 'Android QA Build!'
            }
        }
    }
}
