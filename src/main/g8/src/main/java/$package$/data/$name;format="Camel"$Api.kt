package $package$.data

import com.google.gson.annotations.SerializedName
import kotlinx.coroutines.Deferred
import retrofit2.http.Body
import retrofit2.http.POST

internal interface $name;format="Camel"$Api {

    @POST("/some_url")
    fun fetch(@Body data : $name;format="Camel"$ApiRequest) : Deferred<$name;format="Camel"$ApiResponse>

}

internal interface $name;format="Camel"$ApiWrapper {

    suspend fun fetch(@Body data : $name;format="Camel"$ApiRequest) : $name;format="Camel"$ApiResponse

}

internal class $name;format="Camel"$ApiWrapperDefault(private val api : $name;format="Camel"$Api) : $name;format="Camel"$ApiWrapper{

    override suspend fun fetch(@Body data : $name;format="Camel"$ApiRequest) : $name;format="Camel"$ApiResponse = api.fetch(data).await()

}

internal data class $name;format="Camel"$ApiRequest(val id : Long) // TODO add fields

internal data class $name;format="Camel"$ApiResponse(
        @SerializedName("id") val id : Long
) // TODO add fields
