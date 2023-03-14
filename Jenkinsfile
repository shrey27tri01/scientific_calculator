pipeline {

    agent any

    stages {
        stage ('Git Pull') {
            steps {
                git url: 'https://github.com/shrey27tri01/scientific_calculator.git',
                branch: 'master',
                credentialsId: 'GitHubCredentials'
            }
        }
        stage ('Maven Build') {
            steps {
                script {
                    sh 'mvn clean install'
                }
            }
        }
    }
}