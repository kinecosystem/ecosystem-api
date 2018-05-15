
# JWTBodyCommon

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**iat** | [**BigDecimal**](BigDecimal.md) | issued at - seconds from epoc | 
**iss** | **String** | issuer name, the same as app_id (kik) | 
**exp** | [**BigDecimal**](BigDecimal.md) | expiration - seconds from epoc | 
**sub** | [**SubEnum**](#SubEnum) | subject | 



<a name="SubEnum"></a>
## Enum: SubEnum
Name | Value
---- | -----
REGISTER | &quot;register&quot;
SPEND | &quot;spend&quot;
EARN | &quot;earn&quot;
PAY_TO_USER | &quot;pay_to_user&quot;
PAYMENT_CONFIRMATION | &quot;payment_confirmation&quot;



