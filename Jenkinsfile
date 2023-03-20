pipeline {

    agent any

    environment {
        registry = 'shrey27tri01/scientific_calculator'
        registryCredential = 'DockerHub'
        dockerImage = ''
    }

    tools {
        maven 'Maven 3.6.3'
    }

    stages {
        stage ('Git Pull') {
            steps {
                git url: 'https://github.com/shrey27tri01/scientific_calculator.git',
                branch: 'master',
                credentialsId: 'GitHub'
            }
        }
        stage ('Maven Build') {
            steps {
                script {
                    sh 'mvn clean install'
                }
            }
        }
        stage ('Build Docker Image') {
            steps {
                script {
                    dockerImage = docker.build registry + ":latest"
                }
            }
        }
        stage ('Push Docker Image to DockerHub') {
            steps {
                script {
                    docker.withRegistry('', registryCredential) {
                        dockerImage.push()
                    }
                }
            }
        }
        stage('Deploy and Run Image'){
            steps {
                ansiblePlaybook becomeUser: null, colorized: true, disableHostKeyChecking: true, installation: 'Ansible', inventory: 'inventory', playbook: 'playbook.yml', sudoUser: null
            }
        }
    }
}
