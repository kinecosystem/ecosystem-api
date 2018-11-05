# Kin Ecosystem SDK API

## marketplace API
The `openapi.yaml` file contains definitions of the services and models that will be available for our client to access on the server.

To edit the file you can use the [online editor](http://editor.swagger.io/?url=https://raw.githubusercontent.com/kinfoundation/ecosystem-api/master/openapi.yaml)

### JWT specs and examples:
#### JWT encoded messages
##### JWT header format

For all 3 JWTs we will use the following template:
```
{
	alg: string; // ES256 but can be discussed
	typ: string; // JWT
	kid: string; // identifier of the keypair that was used to sign the JWT. identifiers and public keys will be provided by signer authority. This enables using multiple private/public key pairs (a list of public keys and their ids need to be provided by signer authority to verifier in advanced)
}
```

#### Register payload
```
{
	// common/ standard fields
	iat: number;  // issued at - seconds from epoc
	iss: string; // issuer
	exp: number; // expiration
	sub: string; // subject - "register"

	// application fields
	user_id: string; // id of the user - or a deterministic unique id for the user (hash)
}
```
##### [Example (viewable on jwt.io)](https://jwt.io/?token=eyJhbGciOiJFUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6InNvbWVfaWQifQ.eyJpYXQiOjE1MTYyMzkwMjIsImlzcyI6ImtpayBzZXJ2ZXIiLCJleHAiOjE1MjYyMzkwMjIsInN1YiI6InJlZ2lzdGVyIiwidXNlcl9pZCI6ImFfaGFzaF9vbl9raWtfdXNlcl9pZCJ9.6DwojspQ46inlwYwn3NNH0bmQIzKd7mL0VX8V2ZmlH8aZqWF2UbK_Md5kcxgnXgq0P6tExVTr1vxpwhfj7_3dg)
```
eyJhbGciOiJFUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6InNvbWVfaWQifQ.eyJpYXQiOjE1MTYyMzkwMjIsImlzcyI6ImtpayBzZXJ2ZXIiLCJleHAiOjE1MjYyMzkwMjIsInN1YiI6InJlZ2lzdGVyIiwidXNlcl9pZCI6ImFfaGFzaF9vbl9raWtfdXNlcl9pZCJ9.6DwojspQ46inlwYwn3NNH0bmQIzKd7mL0VX8V2ZmlH8aZqWF2UbK_Md5kcxgnXgq0P6tExVTr1vxpwhfj7_3dg
```

#### Spend payload
```
{
	iat: number;  // issued at - seconds from epoc
	iss: string; // issuer
	exp: number; // expiration
	sub: string; // subject - "spend"

	nonce: string; // optional, to create a unique pair for offer id per user
	offer: {
		id: string; // offer id - id is decided by digital service
		amount: number; // amount of kin for this offer - price
	};
	sender: {
		user_id: string; // optional: user_id who will perform the
		title: string; // order title - appears in order history
		description: string; // order description - appears in order history
	};
}
```
##### [Example (viewable on jwt.io)](https://jwt.io/?token=eyJhbGciOiJFUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6InNvbWVfaWQifQ.eyJpYXQiOjE1MTYyMzkwMjIsImlzcyI6ImtpayBzZXJ2ZXIiLCJleHAiOjE1MjYyMzkwMjIsInN1YiI6InNwZW5kIiwib2ZmZXIiOnsiaWQiOiJPMTIzMTIzMTIzIiwiYW1vdW50Ijo1MDAwfSwic2VuZGVyIjp7InRpdGxlIjoiQmx1ZSBUaGVtZSIsImRlc2NyaXB0aW9uIjoiT2NlYW4gQmx1ZSIsInVzZXJfaWQiOiJzb21lX3VzZXIifX0.BRacJ37zbbaKivWD_uhC2JXozzrHDN5B9VeG7d1BXjkpPYEfpaEy_kKF6xqp7oUMjEG2ltrOQPJ-UkFcFl6H-g)
```
eyJhbGciOiJFUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6InNvbWVfaWQifQ.eyJpYXQiOjE1MTYyMzkwMjIsImlzcyI6ImtpayBzZXJ2ZXIiLCJleHAiOjE1MjYyMzkwMjIsInN1YiI6InNwZW5kIiwib2ZmZXIiOnsiaWQiOiJPMTIzMTIzMTIzIiwiYW1vdW50Ijo1MDAwfSwic2VuZGVyIjp7InRpdGxlIjoiQmx1ZSBUaGVtZSIsImRlc2NyaXB0aW9uIjoiT2NlYW4gQmx1ZSIsInVzZXJfaWQiOiJzb21lX3VzZXIifX0.BRacJ37zbbaKivWD_uhC2JXozzrHDN5B9VeG7d1BXjkpPYEfpaEy_kKF6xqp7oUMjEG2ltrOQPJ-UkFcFl6H-g
```
#### Earn payload
```
{
	iat: number;  // issued at - seconds from epoc
	iss: string; // issuer
	exp: number; // expiration
	sub: string; // subject - "earn"

	nonce: string; // optional, to create a unique pair for offer id per user
	offer: {
		id: string; // offer id - id is decided by digital service
		amount: number; // amount of kin for this offer - price
	};
	recipient: {
		user_id: string; // user_id who will perform the order
		title: string; // order title - appears in order history
		description: string; // order description - appears in order history
	};
}
```
##### [Example (viewable on jwt.io)](https://jwt.io/?token=eyJhbGciOiJFUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6InNvbWVfaWQifQ.eyJpYXQiOjE1MTYyMzkwMjIsImlzcyI6ImtpayBzZXJ2ZXIiLCJleHAiOjE1MjYyMzkwMjIsInN1YiI6ImVhcm4iLCJvZmZlciI6eyJpZCI6Ik8xMjMxMjMxMjMiLCJhbW91bnQiOjUwMDB9LCJyZWNpcGllbnQiOnsidGl0bGUiOiJCbHVlIFRoZW1lIiwiZGVzY3JpcHRpb24iOiJPY2VhbiBCbHVlIiwidXNlcl9pZCI6InNvbWVfdXNlciJ9fQ.R7OpvaZQIAzjQ0MSi5nC1c39oC9oN08NVKwricMyWnuMbK5FD9Qn6ecmol4JnMGE5IZA7j_LR-EEbVhhEYi57g)
```
eyJhbGciOiJFUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6InNvbWVfaWQifQ.eyJpYXQiOjE1MTYyMzkwMjIsImlzcyI6ImtpayBzZXJ2ZXIiLCJleHAiOjE1MjYyMzkwMjIsInN1YiI6ImVhcm4iLCJvZmZlciI6eyJpZCI6Ik8xMjMxMjMxMjMiLCJhbW91bnQiOjUwMDB9LCJyZWNpcGllbnQiOnsidGl0bGUiOiJCbHVlIFRoZW1lIiwiZGVzY3JpcHRpb24iOiJPY2VhbiBCbHVlIiwidXNlcl9pZCI6InNvbWVfdXNlciJ9fQ.R7OpvaZQIAzjQ0MSi5nC1c39oC9oN08NVKwricMyWnuMbK5FD9Qn6ecmol4JnMGE5IZA7j_LR-EEbVhhEYi57g
```
#### PayToUser payload
```
{
	iat: number;  // issued at - seconds from epoc
	iss: string; // issuer
	exp: number; // expiration
	sub: string; // subject - "pay_to_user"

	nonce: string; // optional, to create a unique pair for offer id per user
	offer: {
		id: string; // offer id - id is decided by digital service
		amount: number; // amount of kin for this offer - price
	};
	sender: {
		user_id: string; // optional: user_id who will perform the order
		title: string; // offer title - appears in order history
		description: string; // offer description - appears in order history
	};
	recipient: {
		user_id: string; // user_id who will receive the order
		title: string; // offer title - appears in order history
		description: string; // offer description - appears in order history
	};
}
```
##### [Example (viewable on jwt.io)](https://jwt.io/?tokeneyJhbGciOiJFUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6InNvbWVfaWQifQ.eyJpYXQiOjE1MTYyMzkwMjIsImlzcyI6ImtpayBzZXJ2ZXIiLCJleHAiOjE1MjYyMzkwMjIsInN1YiI6InBheV90b191c2VyIiwib2ZmZXIiOnsiaWQiOiJPMTIzMTIzMTIzIiwiYW1vdW50Ijo1MDAwfSwic2VuZGVyIjp7InRpdGxlIjoiVGlwIEZyb20gRG9vZHkiLCJkZXNjcmlwdGlvbiI6IkRvb2R5IHRpcHBlZCB5b3UiLCJ1c2VyX2lkIjoidXNlcjpuaXR6YW4ifSwicmVjaXBpZW50Ijp7InRpdGxlIjoiVGlwIFRvIE5pdHphbiIsImRlc2NyaXB0aW9uIjoiWW91IHRpcHBlZCBOaXR6YW4iLCJ1c2VyX2lkIjoidXNlcjpkb29keSJ9fQ.GVufyAI2UkpzzLlSL7a_kb5JcdSkgBb1PnzdL7wUkIGx-IUUu_pgTecElwTbZvWrCSr_GkJ4leD1MnXHSUb_QQ)
```
eyJhbGciOiJFUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6InNvbWVfaWQifQ.eyJpYXQiOjE1MTYyMzkwMjIsImlzcyI6ImtpayBzZXJ2ZXIiLCJleHAiOjE1MjYyMzkwMjIsInN1YiI6InBheV90b191c2VyIiwib2ZmZXIiOnsiaWQiOiJPMTIzMTIzMTIzIiwiYW1vdW50Ijo1MDAwfSwic2VuZGVyIjp7InRpdGxlIjoiVGlwIEZyb20gRG9vZHkiLCJkZXNjcmlwdGlvbiI6IkRvb2R5IHRpcHBlZCB5b3UiLCJ1c2VyX2lkIjoidXNlcjpuaXR6YW4ifSwicmVjaXBpZW50Ijp7InRpdGxlIjoiVGlwIFRvIE5pdHphbiIsImRlc2NyaXB0aW9uIjoiWW91IHRpcHBlZCBOaXR6YW4iLCJ1c2VyX2lkIjoidXNlcjpkb29keSJ9fQ.GVufyAI2UkpzzLlSL7a_kb5JcdSkgBb1PnzdL7wUkIGx-IUUu_pgTecElwTbZvWrCSr_GkJ4leD1MnXHSUb_QQ
```
#### PaymentConfirmation payload
```
{
	iat: number;  // issued at - seconds from epoc
	iss: string; // issuer
	exp: number; // expiration
	sub: string; // subject - "payment_confirmation"

	sender_user_id: string; // user identifier - same value as given by register
	recipient_user_id: string; // user identifier - same value as given by register
	offer_id: string; // offer id - id is decided by digital service
	nonce: string; // the same as was send in the order JWT, or a default value in case none was used
	payment: {
		blockchain: string; // identifier of the blockchain network the transaction was made on
		transaction_id: string; // stellar identifier of the blockchain transaction
	};
}
```
##### [Example (viewable on jwt.io)](https://jwt.io/?token=eyJhbGciOiJFUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6InNvbWVfaWQifQ.eyJpYXQiOjE1MTYyMzkwMjIsImlzcyI6ImtpayIsImV4cCI6MTUyNjIzOTAyMiwic3ViIjoicGF5bWVudF9jb25maXJtYXRpb24iLCJvZmZlcl9pZCI6Ik8xMjMxMjMxMjMiLCJzZW5kZXJfdXNlcl9pZCI6InVzZXI6ZG9vZHkiLCJyZWNpcGllbnRfdXNlcl9pZCI6InVzZXI6bml0emFuIiwicGF5bWVudCI6eyJibG9ja2NoYWluIjoic3RlbGxhci1tYWlubmV0IiwidHJhbnNhY3Rpb25faWQiOiJ0cmFuc2FjdGlvbjoxMjM0NSJ9fQ.-AbZOfC69eY1It43RccOXluY-sjWSi4JFvQkVKO9D2UgYU3jNPbEcBERLrqBHPSpS6f26LVpIsg5A81UQNoukw)
```
eyJhbGciOiJFUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6InNvbWVfaWQifQ.eyJpYXQiOjE1MTYyMzkwMjIsImlzcyI6ImtpayIsImV4cCI6MTUyNjIzOTAyMiwic3ViIjoicGF5bWVudF9jb25maXJtYXRpb24iLCJvZmZlcl9pZCI6Ik8xMjMxMjMxMjMiLCJzZW5kZXJfdXNlcl9pZCI6InVzZXI6ZG9vZHkiLCJyZWNpcGllbnRfdXNlcl9pZCI6InVzZXI6bml0emFuIiwicGF5bWVudCI6eyJibG9ja2NoYWluIjoic3RlbGxhci1tYWlubmV0IiwidHJhbnNhY3Rpb25faWQiOiJ0cmFuc2FjdGlvbjoxMjM0NSJ9fQ.-AbZOfC69eY1It43RccOXluY-sjWSi4JFvQkVKO9D2UgYU3jNPbEcBERLrqBHPSpS6f26LVpIsg5A81UQNoukw
```

#### Key Pair used in Examples
Public:
```
-----BEGIN PUBLIC KEY-----
MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEEVs/o5+uQbTjL3chynL4wXgUg2R9
q9UU8I5mEovUf86QZ7kOBIjJwqnzD1omageEHWwHdBO6B+dFabmdT9POxg==
-----END PUBLIC KEY-----
```
Private:
```
-----BEGIN PRIVATE KEY-----
MIGHAgEAMBMGByqGSM49AgEGCCqGSM49AwEHBG0wawIBAQQgevZzL1gdAFr88hb2
OF/2NxApJCzGCEDdfSp6VQO30hyhRANCAAQRWz+jn65BtOMvdyHKcvjBeBSDZH2r
1RTwjmYSi9R/zpBnuQ4EiMnCqfMPWiZqB4QdbAd0E7oH50VpuZ1P087G
-----END PRIVATE KEY-----
```

## internal payment

To edit the file you can use the [online editor](http://editor.swagger.io/?url=https://raw.githubusercontent.com/kinfoundation/ecosystem-api/master/payment.yaml)

## creating client stubs

openapi3 code generation is supported by a few projects

### java

using `github.com:swagger-api/swagger-codegen` on branch `v3.0.0-rc0` compile the maven project and run the following:
```
java -jar modules/swagger-codegen-cli/target/swagger-codegen-cli.jar generate -i ~/Workspace/ecosystem-api/openapi.yaml -l java  -o java_client
```
