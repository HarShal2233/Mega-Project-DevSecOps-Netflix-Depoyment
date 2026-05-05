def call(String imageName, String tag, String dockerHubUser) {
    withCredentials([string(credentialsId: 'tmdb-api-key', variable: 'TMDB_KEY')]) {
        sh """
            docker build \
            --build-arg VITE_TMDB_API_KEY=$TMDB_KEY \
            -t ${dockerHubUser}/${imageName}:${tag} .
        """
    }
}