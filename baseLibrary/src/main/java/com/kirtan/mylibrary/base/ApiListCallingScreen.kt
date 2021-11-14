package com.kirtan.mylibrary.base

interface ApiListCallingScreen<ApiRequestType : Any?, ApiResponseType, ParsedResponse> :
    ApiCallingScreen<ApiRequestType, ApiResponseType> {
    /**
     * @return #ParsedResponse from #response in the parameter.
     * */
    fun parseListFromResponse(response: ApiResponseType): ParsedResponse
}