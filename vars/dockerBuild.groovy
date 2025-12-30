
def call(String imageName) {
    echo "Building Docker image"
    sh "docker build -t ${imageName}:${env.BUILD_NUMBER} ."
}
