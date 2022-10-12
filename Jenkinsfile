/* Requires the Docker Pipeline plugin */
/*
pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                echo "Build tests"
                def mavenDir = "c:\\apache-maven-3.8.6\\bin\\"
                def projectDir = ""
                dir () {
                    echo "Execute maven"
                    bat script:"mvn -v"
                }

            }
        }
    }
}
*/
pipeline {
    agent {
        docker {
            image 'maven:3.8.1-adoptopenjdk-11'
            args '-v $HOME/.m2:/root/.m2'
        }
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B'
            }
        }
    }
}