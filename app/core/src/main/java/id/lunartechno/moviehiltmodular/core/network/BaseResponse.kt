package id.lunartechno.moviehiltmodular.core.network

data class BaseResponse<T>(
    var code : Int?=200,
    var message : String?="",
    var data : T?=null
)