resource "aws_s3_bucket" "my_s3_bucket" {
    bucket = "netlfx-tf-s3-bucket"

    tags = {
        Name = "netlfx-tf-s3-bucket"
    }

}