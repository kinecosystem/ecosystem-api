
# Order

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**result** | **Object** | * empty when no result (pending status, completed earn) * failure_message when status is failed * coupon_code when completed spend  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  | 
**orderId** | **String** | unique identifier of this item | 
**completionDate** | **String** | UTC ISO | 
**blockchainData** | [**BlockchainData**](BlockchainData.md) |  |  [optional]
**offerType** | [**OfferTypeEnum**](#OfferTypeEnum) |  | 
**title** | **String** | usually a brand name | 
**description** | **String** |  | 
**callToAction** | **String** |  |  [optional]
**amount** | **Integer** | kin amount | 



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



