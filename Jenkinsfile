pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        
        stage ('Deploy') {
            steps {
              script {
                deploy adapters: [tomcat9(credentialsId: 'deployer-user', path: '/opt/apache-tomcat-9.0.55/webapps', url: 'http://34.125.78.138:8080')], contextPath: '/pipeline', onFailure: false, war: '**/*.war' 
              }
            }
         }
            
    }

}

 
    
