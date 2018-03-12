
# Order

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | unique identifier of this item | 
**result** | **Object** | * empty when no result (pending status, completed earn) * coupon_code when completed spend  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  | 
**completionDate** | **String** | UTC ISO | 
**blockchainData** | [**BlockchainData**](BlockchainData.md) |  |  [optional]
**offerType** | [**OfferTypeEnum**](#OfferTypeEnum) |  | 
**title** | **String** | usually a brand name | 
**description** | **String** |  | 
**callToAction** | **String** |  |  [optional]
**amount** | **Integer** | kin amount | 
**content** | **String** | optional json payload defining a coupon page |  [optional]
**error** | [**Error**](Error.md) |  |  [optional]



<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PENDING | &quot;pending&quot;
COMPLETED | &quot;completed&quot;
FAILED | &quot;failed&quot;


<a name="OfferTypeEnum"></a>
## Enum: OfferTypeEnum
Name | Value
---- | -----
EARN | &quot;earn&quot;
SPEND | &quot;spend&quot;



