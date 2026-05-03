terraform {
  required_providers {
    aws = {
      source  = "hashicorp/aws"
      version = "6.41.0"
    }
  }

backend "s3" {
    bucket = "netlfx-tf-s3-bucket"
    key    = "terraform.tfstate"
    region = "us-east-2"  
    #dynamodb_table = "netflix-tf-backend"
    use_lockfile = true
  }

}

provider "aws" {
  region = var.aws_region
}