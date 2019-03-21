package $package$.app

import android.content.Context
import $package$.core.*
import $package$.data.*
import kotlinx.coroutines.CoroutineDispatcher
import retrofit2.Retrofit
import retrofit2.create

internal class $name;format="Camel"$ServiceLocator(private val context: Context) {

    fun getPresenter(): $name;format="Camel"$Contract.Presenter = TODO()

    private fun getInteractor(): $name;format="Camel"$Contract.Interactor = TODO()

    private fun getTracker(): $name;format="Camel"$Contract.Tracker = TODO()

    private fun getRetrofit() : Retrofit = TODO()

    private fun get$name;format="Camel"$Api(retrofit : Retrofit) : $name;format="Camel"$Api = retrofit.create()

    private fun get$name;format="Camel"$ApiWrapper(api : $name;format="Camel"$Api) : $name;format="Camel"$ApiWrapper = $name;format="Camel"$ApiWrapperDefault(api)

    private fun getUiDispatcher() : CoroutineDispatcher = TODO()

    private fun getIoDispatcher() : CoroutineDispatcher = TODO()

}
