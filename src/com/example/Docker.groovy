package com.example

class Docker implements Serializable {
    def script

    Docker(script) {
        this.script = script
    }

    def dockerLogin() {
        script.echo "Login to Docker ...."
        script.withCredentials([script.usernamePassword(credentialsId: 'docker-hub-credentials', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
            script.sh "echo '${script.PASS}' | docker login -u '${script.USER}' --password-stdin"
        }
    }

    def dockerBuild(String imageName) {
        script.echo "Build Docker Image ...."
        script.sh "docker build -t $imageName ."
    }

    def dockerPush(String imageName) {
        script.echo "Push Docker Image ..."
        script.sh "docker push $imageName"
    }
}
