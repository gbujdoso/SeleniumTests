pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                echo "Build tests"
                script {
                    def mavenDir = "c:\\apache-maven-3.8.6\\bin\\"
                    def projectDir = env.WORKSPACE
                    env.mavenDir = mavenDir
                    env.projectDir = projectDir
                }
                dir (env.projectDir) {
                    echo "Execute maven"
                    echo "${env.projectDir}"
                    bat script:"${env.mavenDir}\\mvn compile"
                    bat script:"${env.mavenDir}\\mvn test"

                }

            }
        }
    }
}

/* cannot use Windows host and Linux docker, bug: https://issues.jenkins.io/browse/JENKINS-60473
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
*/