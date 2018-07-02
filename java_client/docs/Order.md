
# Order

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
**result** | **Object** | * empty when no result (pending status, completed earn) * coupon code or confirm payment JWT when completed spend  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  | 
**completionDate** | **String** | UTC ISO | 
**callToAction** | **String** |  |  [optional]
**content** | **String** | optional json payload defining a coupon page |  [optional]
**error** | [**Error**](Error.md) |  |  [optional]



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


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PENDING | &quot;pending&quot;
COMPLETED | &quot;completed&quot;
FAILED | &quot;failed&quot;



