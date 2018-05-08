
# JWTBodyRegister

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**iat** | [**BigDecimal**](BigDecimal.md) | issued at - seconds from epoc | 
**iss** | **String** | issuer name, the same as app_id (kik) | 
**exp** | [**BigDecimal**](BigDecimal.md) | expiration - seconds from epoc | 
**sub** | [**SubEnum**](#SubEnum) | subject | 
**userId** | **String** |  | 



<a name="SubEnum"></a>
## Enum: SubEnum
Name | Value
---- | -----
REGISTER | &quot;register&quot;
SPEND | &quot;spend&quot;
CONFIRM_PAYMENT | &quot;confirm_payment&quot;



