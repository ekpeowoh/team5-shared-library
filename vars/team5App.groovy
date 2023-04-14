 def call(String repourl){
 pipeline{
    agent any
    stages{
        stage('1-clone'){
            steps{
                echo 'This is group 5 healthapp project on parallel job'
            }
        }
        stage('2-Jamescode'){
            parallel{
                stage('subjob'){
                    steps{
                        sh 'lscpu'
                    }
                }
                stage('subjob1'){
                    steps{
                        sh 'sudo systemctl status jenkins'
                    }
                }
            }
        }
        stage('Chiomacode'){
            parallel{
                stage('subjob2'){
                    steps{
                        sh 'df -h'
                    }
                }
                stage('subjob3'){
                    steps{
                        sh 'cat /etc/passwd'
                    }
                }
            }
        }
        stage('3 Mikecode'){
            parallel{
                stage('subjob3'){
                    steps{
                        sh 'ls'
                    }
                }
                stage('3-subjob3'){
                    steps{
                        sh '#!/bin/bash'
                    }
                }
            }
        }
        stage('4 Ekeminicode'){
            parallel{
                stage('4 subjob4'){
                    steps{
                        sh 'pwd'
                    }
                }
                stage('4-subjob4'){
                    steps{
                        sh 'whoami'
                    }
                }
            }
        }
        stage('5 Chriscode'){
            parallel{
                stage('5-subjob'){
                    steps{
                        sh 'du -h'
                    }
                }
                stage('5subjob'){
                    steps{
                        sh 'free -g'
                    }
                }
            }
        }
        stage('6-Osaskicode'){
            parallel{
                stage('6-subjob'){
                    steps{
                        sh 'uname -r'
                    }
                }
                stage('6subjob'){
                    steps{
                        sh 'ps -ef'
                    }
                }
                 stage("Checkout Code") {
               steps {
                   git branch: 'main',
                          url: "${repoUrl}"
            }
        }
    }
}
    }
 }
 }
 
 
 
 
