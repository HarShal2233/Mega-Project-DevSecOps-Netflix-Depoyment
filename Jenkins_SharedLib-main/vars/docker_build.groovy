def call(String imageName, String tag, String dockerHubUser) {
    withCredentials([string(credentialsId: 'tmdb-api-key', variable: 'TMDB_KEY')]) {
        sh """
            docker build \
            --build-arg TMDB_V3_API_KEY=$TMDB_KEY \
            -t ${dockerHubUser}/${imageName}:${tag} .
        """
    }
}