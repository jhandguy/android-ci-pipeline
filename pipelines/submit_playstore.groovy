pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                echo 'Building App...'
                sleep 1
            }
        }
        stage('submit') {
            steps {
                echo 'Submitting to Playstore...'
                sleep 1
            }
        }
        stage('post') {
            steps {
                echo 'Message Posted on Slack!'
            }
        }
    }
}
