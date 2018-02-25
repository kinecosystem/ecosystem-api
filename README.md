# Kin Ecosystem SDK API

## marketplace API
The `openapi.yaml` file contains definitions of the services and models that will be available for our client to access on the server.

To edit the file you can use the [online editor](http://editor.swagger.io/?url=https://raw.githubusercontent.com/kinfoundation/ecosystem-api/master/openapi.yaml)

## internal payment

To edit the file you can use the [online editor](http://editor.swagger.io/?url=https://raw.githubusercontent.com/kinfoundation/ecosystem-api/master/payment.yaml)

## creating client stubs

openapi3 code generation is supported by a few projects

### java

using `github.com:swagger-api/swagger-codegen` on branch `v3.0.0-rc0` compile the maven project and run the following:
```
java -jar modules/swagger-codegen-cli/target/swagger-codegen-cli.jar generate -i ~/Workspace/ecosystem-api/openapi.yaml -l java  -o java_client
```
