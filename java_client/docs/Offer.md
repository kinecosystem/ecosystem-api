
# Offer

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  | 
**title** | **String** |  | 
**description** | **String** |  | 
**image** | **String** |  | 
**amount** | **Integer** |  | 
**offerType** | [**OfferTypeEnum**](#OfferTypeEnum) |  | 
**contentType** | [**ContentTypeEnum**](#ContentTypeEnum) | determines the type of data that appears in the content |  [optional]
**content** | **String** | The coupon description or the poll payload | 



<a name="OfferTypeEnum"></a>
## Enum: OfferTypeEnum
Name | Value
---- | -----
EARN | &quot;earn&quot;
SPEND | &quot;spend&quot;


<a name="ContentTypeEnum"></a>
## Enum: ContentTypeEnum
Name | Value
---- | -----
POLL | &quot;poll&quot;
COUPON | &quot;coupon&quot;



