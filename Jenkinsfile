pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
         }
        stage('Quality Analysis') {
            steps{
                withSonarQubeEnv(installationName: 'Sonarqube'){
                    sh 'mvn sonar:sonar'
                }
            }
         }
        
            
    }

}

 
    
