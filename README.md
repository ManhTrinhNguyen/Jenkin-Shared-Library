### Configure in Jenkins
1. Go to **Manage Jenkins > Configure System > Global Pipeline Libraries**.
2. Add:
   - **Name**: `shared-library`
   - **Default Version**: `main`
   - **Git Repository URL**: `https://your-repo-url.git`

### Example Jenkinsfile
```groovy
@Library('shared-library') _

pipeline {
    agent any

    stages {
        stage('Example Step') {
            steps {
                exampleStep('Hello from Shared Library!')
            }
        }
    }
}
