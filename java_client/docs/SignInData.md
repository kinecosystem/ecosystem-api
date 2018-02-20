
# SignInData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**jwt** | **String** | jwt should contain \&quot;user_id\&quot;, \&quot;app_id\&quot; and \&quot;timestamp\&quot;, issuer,   |  [optional]
**userId** | **String** |  | 
**appId** | **String** |  | 
**deviceId** | **String** |  | 
**publicAddress** | **String** | the address where earned funds will go to | 
**signInType** | [**SignInTypeEnum**](#SignInTypeEnum) |  | 



<a name="SignInTypeEnum"></a>
## Enum: SignInTypeEnum
Name | Value
---- | -----
JWT | &quot;jwt&quot;
WHITELIST | &quot;whitelist&quot;



