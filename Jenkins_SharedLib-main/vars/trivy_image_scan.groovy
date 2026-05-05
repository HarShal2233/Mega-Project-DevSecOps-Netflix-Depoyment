def call(String imageName) {
    sh """
    echo "=============================="
    echo " Trivy Image Scan Started"
    echo " Image: ${imageName}"
    echo "=============================="

    trivy image \
      --severity HIGH,CRITICAL \
      --exit-code 1 \
      --format table \
      ${imageName} | tee trivy-image-report.txt

    echo "Scan Completed"
    """
}