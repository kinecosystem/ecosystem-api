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
	alg: string, // ES256 but can be discussed
	typ: string, // JWT
	kid: string  // identifier of the keypair that was used to sign the JWT. identifiers and public keys will be provided by signer authority. This enables using multiple private/public key pairs (a list of public keys and their ids need to be provided by signer authority to verifier in advanced)
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
	nonce: string;  // random number/incremental - used to ensure only one account will be created for userID, In case Kik logic intentionally require an additional account for user a different nonce should be provided
	user_id: string; // id of the user - or a deterministic unique id for the user (hash)
}
```
##### Example (viewable on jwt.io)
```
eyJhbGciOiJFUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6InNvbWVfaWQifQ.eyJpYXQiOjE1MTYyMzkwMjIsImlzcyI6ImtpayBzZXJ2ZXIiLCJleHAiOjE1MjYyMzkwMjIsInN1YiI6InJlZ2lzdGVyIiwidXNlcl9pZCI6ImFfaGFzaF9vbl9raWtfdXNlcl9pZCIsIm5vbmNlIjoic29tZSByYW5kb20gc3RyaW5nIn0.ubseKRWI_b2Dmb9ROuv-uxLVprohlaPm_EbB-fWrb849L3Qmydd9xX1K-yK7bQnRBv9syEBdVQh5CmEDie7Uaw
```

#### Spend payload
```
{
	iat: number;  // issued at - seconds from epoc
	iss: string; // issuer
	exp: number; // expiration
	sub: string; // subject - "spend"

	offer: {
		id: string; // offer id - id is decided by kik
		amount: number; // amount of kin for this offer - price
	},
	sender: {
		user_id: string; // optional: user_id who will perform the order
title: string; // order title - appears in order history
		description: string; // order description - appears in order history
	}
	nonce: string;  // random number/incremental - used to identify this particular purchase - a user might be able to buy the same offer with different nonce values
}
```
##### Example (viewable on jwt.io)
```
eyJhbGciOiJFUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6InNvbWVfaWQifQ.eyJpYXQiOjE1MTYyMzkwMjIsImlzcyI6ImtpayBzZXJ2ZXIiLCJleHAiOjE1MjYyMzkwMjIsInN1YiI6InNwZW5kIiwib2ZmZXIiOnsiaWQiOiJPMTIzMTIzMTIzIiwiYW1vdW50Ijo1MDAwfSwic2VuZGVyIjp7InRpdGxlIjoiQmx1ZSBUaGVtZSIsImRlc2NyaXB0aW9uIjoiT2NlYW4gQmx1ZSIsInVzZXJfaWQiOiJzb21lX3VzZXIifSwibm9uY2UiOiJzb21lIHJhbmRvbSBzdHJpbmcifQ.SPvvD-8JV0Ecb7aqd5KRTu_7Vv2yeKPM1wib6Qy4K_tOhAvAd4TZld-W7xD5zhe4kzT3uQnq4ccFNvqBlCk7yQ
```
#### Earn payload
```
{
	iat: number;  // issued at - seconds from epoc
	iss: string; // issuer
	exp: number; // expiration
	sub: string; // subject - "earn"

	offer: {
		id: string; // offer id - id is decided by kik
		amount: number; // amount of kin for this offer - price
	},
	recipient: {
		user_id: string; // user_id who will perform the order
title: string; // order title - appears in order history
		description: string; // order description - appears in order history
	}
	nonce: string;  // random number/incremental - used to identify this particular purchase - a user might be able to buy the same offer with different nonce values
}
```
##### Example (viewable on jwt.io)
```
eyJhbGciOiJFUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6InNvbWVfaWQifQ.eyJpYXQiOjE1MTYyMzkwMjIsImlzcyI6ImtpayBzZXJ2ZXIiLCJleHAiOjE1MjYyMzkwMjIsInN1YiI6ImVhcm4iLCJvZmZlciI6eyJpZCI6Ik8xMjMxMjMxMjMiLCJhbW91bnQiOjUwMDB9LCJyZWNpcGllbnQiOnsidGl0bGUiOiJCbHVlIFRoZW1lIiwiZGVzY3JpcHRpb24iOiJPY2VhbiBCbHVlIiwidXNlcl9pZCI6InNvbWVfdXNlciJ9LCJub25jZSI6InNvbWUgcmFuZG9tIHN0cmluZyJ9.OE_Z6jqa4IuY4t0thk0OEgVVeevSrnvRQjwEHXqMU6cGJK3cm257yZZPc9yG-GDckDBsGERFSFaCGy3TAK60Gg
```
#### PayToUser payload
```
{
	iat: number;  // issued at - seconds from epoc
	iss: string; // issuer
	exp: number; // expiration
	sub: string; // subject - "pay_to_user"

	offer: {
		id: string; // offer id - id is decided by kik
		amount: number; // amount of kin for this offer - price
	},
	sender: {
		user_id: string; // optional: user_id who will perform the order
title: string; // offer title - appears in order history
		description: string; // offer description - appears in order history
	}
recipient: {
		user_id: string; // user_id who will receive the order
title: string; // offer title - appears in order history
		description: string; // offer description - appears in order history
	}
	nonce: string;  // random number/incremental - used to identify this particular purchase - a user might be able to buy the same offer with different nonce values
}
```
##### Example (viewable on jwt.io)
```
eyJhbGciOiJFUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6InNvbWVfaWQifQ.eyJpYXQiOjE1MTYyMzkwMjIsImlzcyI6ImtpayBzZXJ2ZXIiLCJleHAiOjE1MjYyMzkwMjIsInN1YiI6InBheV90b191c2VyIiwib2ZmZXIiOnsiaWQiOiJPMTIzMTIzMTIzIiwiYW1vdW50Ijo1MDAwfSwic2VuZGVyX29yZGVyIjp7InRpdGxlIjoiVGlwIEZyb20gRG9vZHkiLCJkZXNjcmlwdGlvbiI6IkRvb2R5IHRpcHBlZCB5b3UiLCJ1c2VyX2lkIjoidXNlcjpuaXR6YW4ifSwicmVjaXBpZW50X29yZGVyIjp7InRpdGxlIjoiVGlwIFRvIE5pdHphbiIsImRlc2NyaXB0aW9uIjoiWW91IHRpcHBlZCBOaXR6YW4iLCJ1c2VyX2lkIjoidXNlcjpkb29keSJ9LCJub25jZSI6InNvbWUgcmFuZG9tIHN0cmluZyJ9.XEH6zbelizwnu1Awi-Tq-9i-CYjDpuiUvVK13SFfXKaczXHHDvlWAtzystog9PNqpkbgnhTMD0H_5hk3fkNheg
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
	payment: {
		blockchain: string; // identifier of the blockchain network the transaction was made on
		transaction_id: string; // stellar identifier of the blockchain transaction
	}
	nonce: string;  // the same value given by the spend
}
```
##### Example (viewable on jwt.io)
```
eyJhbGciOiJFUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6InNvbWVfaWQifQ.eyJpYXQiOjE1MTYyMzkwMjIsImlzcyI6ImtpayIsImV4cCI6MTUyNjIzOTAyMiwic3ViIjoicGF5bWVudF9jb25maXJtYXRpb24iLCJvZmZlcl9pZCI6Ik8xMjMxMjMxMjMiLCJzZW5kZXJfdXNlcl9pZCI6InVzZXI6ZG9vZHkiLCJyZWNpcGllbnRfdXNlcl9pZCI6InVzZXI6bml0emFuIiwicGF5bWVudCI6eyJibG9ja2NoYWluIjoic3RlbGxhci1tYWlubmV0IiwidHJhbnNhY3Rpb25faWQiOiJ0cmFuc2FjdGlvbjoxMjM0NSJ9LCJub25jZSI6InNvbWUgcmFuZG9tIHN0cmluZyJ9.f2H0b-kTbXajAC_0calVpfTg3_HYy6yVRTpOJ9lK9Pv0rGzhnqyjI7NjKEbvBume8cPkpJVSBCpWud7t4GQoFg
```

#### Key Pair used in Examples
```
-----BEGIN PUBLIC KEY-----
MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEEVs/o5+uQbTjL3chynL4wXgUg2R9
q9UU8I5mEovUf86QZ7kOBIjJwqnzD1omageEHWwHdBO6B+dFabmdT9POxg==
-----END PUBLIC KEY-----
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
