pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                echo 'Android Beta Build!'
            }
        }
    }
}
