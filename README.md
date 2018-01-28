# Kin Ecosystem SDK API

The `openapi.yaml` file contains definitions of the services and models that will be available for our client to access on the server.

To edit the file you can use the online editor: https://editor.swagger.io//#/

## creating client stubs

openapi3 code generation is supported by a few projects

### java

using `github.com:swagger-api/swagger-codegen` on branch `v3.0.0-rc0` compile the maven project and run the following:
```
java -jar modules/swagger-codegen-cli/target/swagger-codegen-cli.jar generate -i ~/Workspace/ecosystem-api/openapi.yaml -l java  -o java_client
```
