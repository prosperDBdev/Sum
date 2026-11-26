pipeline {
    agent any
    stages {
        stage("Checkout") {
            steps {
                git url:'https://github.com/prosperDBdev/Sum', branch:'main'
            }
        }
        stage("Compile") {
            steps {
                bat "./gradlew compileJava"
            }
        }
        stage("Test") {
            steps {
                bat "./gradlew test"
            }
        }

        stage("Code Coverage") {
                    steps {
                        bat "./gradlew jacocoTestReport"
                        publishHTML(target: [
                            allowMissing: false,
                            alwaysLinkToLastBuild: false,
                            keepAll: true,
                            reportDir: 'build/reports/jacoco/test/html',
                            reportFiles: 'index.html',
                            reportName: 'JaCoCo Report'
                        ])
                        bat "./gradlew jacocoTestCoverageVerification"
                    }
                }
    }
}