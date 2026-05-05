def call(){
  timeout(time: 10, unit: "MINUTES"){
      retry(2) {
          waitForQualityGate abortPipeline: true
      }
  }
}
