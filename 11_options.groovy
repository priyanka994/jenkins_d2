pipeline {
    agent any
    options {
        buildDiscarder(logRotator(numToKeepStr: '1'))
    }
    stages {
        stage('Build') {
            steps {
                echo "Hello World"
            }
        }
    }
}