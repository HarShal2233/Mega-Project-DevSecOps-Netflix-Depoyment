def call(String imageName) {
    sh """
    trivy image --severity HIGH,CRITICAL \
    --format table \
    ${imageName} > trivy-image-report.txt
    """
}