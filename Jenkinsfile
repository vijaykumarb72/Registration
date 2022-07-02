pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package -Dmaven.test.skip=true
            }
        }
        
        stage ('Deploy') {
            steps {
              script {
                deploy adapters: [tomcat9(credentialsId: 'deployer-user', path: '', url: 'http://34.125.78.138:8080')], contextPath: '/registration', onFailure: false, war: '**/*.war' 
              }
            }
         }
            
    }

}

 
    
