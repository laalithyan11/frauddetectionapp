pipeline {
    agent any

    environment {
        GIT_URL = 'https://github.com/laalithyan11/frauddetectionapp.git'
        BRANCH = 'main'
    }

    stages {
        stage('Checkout Source') {
            steps {
                git branch: "${BRANCH}",
                    url: "${GIT_URL}"
            }
        }

        stage('Build Spring Boot') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }
    }
}
