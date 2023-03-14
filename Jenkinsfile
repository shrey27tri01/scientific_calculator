pipeline {

    agent any

    environment {
        registry = 'shrey27tri01/scientific_calculator'
        registryCredential = 'DockerHub'
        dockerImage = ''
    }

    tools {
        maven 'Maven 3.9.0'
        docker 'docker19.03.13'
    }

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
                    sh 'export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-11.0.2.jdk/Contents/Home'
                    sh 'mvn clean install'
                }
            }
        }
        stage('Docker Build To Image') {
            steps {
                script {
                    dockerImage = docker.build registry + ":latest"
                }
            }
        }
    }
}