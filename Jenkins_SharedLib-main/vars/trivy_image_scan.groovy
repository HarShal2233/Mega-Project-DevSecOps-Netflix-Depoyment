def call(String imageName) {
    sh """
        echo "=============================="
        echo " Trivy Image Scan Started"
        echo " Image: ${imageName}"
        echo "=============================="

        trivy image ${imageName} \
            --severity HIGH,CRITICAL \
            --exit-code 0 \
            --format table | tee trivy-image-report.txt

        echo "Scan Completed"
    """
}