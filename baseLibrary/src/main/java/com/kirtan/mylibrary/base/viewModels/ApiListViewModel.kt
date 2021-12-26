package com.kirtan.mylibrary.base.viewModels

class ApiListViewModel<ApiResponseType> : ApiCallingViewModel<ApiResponseType>() {
    var dataStatus: Status = Status.DataNotParsed

    enum class Status { DataParsed, DataNotParsed, DataParsing }
}