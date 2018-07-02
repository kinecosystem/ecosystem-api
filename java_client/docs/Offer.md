
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
**content** | **String** | The coupon description or the poll payload - as serialized json | 
**blockchainData** | [**BlockchainData**](BlockchainData.md) |  |  [optional]



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
QUIZ | &quot;quiz&quot;
TUTORIAL | &quot;tutorial&quot;
POLL | &quot;poll&quot;
COUPON | &quot;coupon&quot;



