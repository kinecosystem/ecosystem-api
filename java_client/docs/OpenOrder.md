
# OpenOrder

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | unique identifier of this item | 
**offerId** | **String** | the offer which this order was created from | 
**offerType** | [**OfferTypeEnum**](#OfferTypeEnum) |  | 
**title** | **String** | usually a brand name | 
**description** | **String** |  | 
**amount** | **Integer** | kin amount | 
**blockchainData** | [**BlockchainData**](BlockchainData.md) |  | 
**origin** | [**OriginEnum**](#OriginEnum) | the origin of the order | 
**expirationDate** | **String** |  | 



<a name="OfferTypeEnum"></a>
## Enum: OfferTypeEnum
Name | Value
---- | -----
EARN | &quot;earn&quot;
SPEND | &quot;spend&quot;


<a name="OriginEnum"></a>
## Enum: OriginEnum
Name | Value
---- | -----
MARKETPLACE | &quot;marketplace&quot;
EXTERNAL | &quot;external&quot;



