resource "aws_dynamodb_table" "basic_dynamodb_table" {
    name           = "netlfx-tf-backend"
    billing_mode   = "PAY_PER_REQUEST"
    hash_key       = "LockId"


    attribute {
        name = "LockId"
        type = "S"
    }

  

    tags = {
        Name        = "netlfx-tf-backend"
    }
  
}