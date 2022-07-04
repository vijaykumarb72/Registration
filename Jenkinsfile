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
                    sh './mvnw clean org.sonarsource.scanner.maven:sonar-maven-plugin:3.9.0.2155:sonar'
                }
            }
         }
        
            
    }

}

 
    
