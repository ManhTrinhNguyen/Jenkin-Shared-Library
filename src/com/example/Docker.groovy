package com.example

class Docker implements Serializable {
    def script

    Docker(script) {
        this.script = script
    }

    def buildDockerImage(String imageName) {
        script.echo "building the docker image..."
        script.withCredentials([usernamePassword(credentialsId: 'docker-hub-credentials', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
            script.sh "docker build -t $imageName ."
            script.sh "echo '${script.PASS}' | docker login -u '${script.USER}' --password-stdin"
            script.sh "docker push $imageName"
        }
    }
}
