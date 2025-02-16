# Error

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | Unique error id. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The HTTP status code . |  [optional]
**title** | **String** | Short error description. |  [optional]
**detail** | **String** | Detailed error description. |  [optional]
**source** | [**ErrorSource**](ErrorSource.md) |  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
_400 | &quot;400&quot;
_401 | &quot;401&quot;
_404 | &quot;404&quot;
_500 | &quot;500&quot;
