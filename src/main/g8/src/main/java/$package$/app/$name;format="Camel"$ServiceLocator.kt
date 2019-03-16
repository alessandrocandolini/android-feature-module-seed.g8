package $package$.app

import android.content.Context
import $package$.core.*
import $package$.data.*
import kotlinx.coroutines.CoroutineDispatcher
import retrofit2.Retrofit
import retrofit2.create

internal class $name;format="Camel"$ServiceLocator(private val context: Context) {

    fun getPresenter(): $name;format="Camel"$Contract.Presenter = getPresenter(getInteractor(), getTracker(), getUiDispatcher(), getIoDispatcher())

    private fun getPresenter(
            interactor : $name;format="Camel"$Contract.Interactor,
            tracker : $name;format="Camel"$Contract.Tracker,
            ui: CoroutineDispatcher,
            io: CoroutineDispatcher
    ): $name;format="Camel"$Contract.Presenter =  $name;format="Camel"$Presenter(interactor, tracker, ui, io)

    private fun getInteractor(): $name;format="Camel"$Contract.Interactor = TODO()

    private fun getTracker(): $name;format="Camel"$Contract.Tracker = TODO()

    private fun get$name;format="Camel"$Api(retrofit : Retrofit) : $name;format="Camel"$Api = retrofit.create()

    private fun get$name;format="Camel"$ApiWrapper(api : $name;format="Camel"$Api) : $name;format="Camel"$ApiWrapper = $name;format="Camel"$ApiWrapperDefault(api)

    private fun getUiDispatcher() : CoroutineDispatcher = TODO()

    private fun getIoDispatcher() : CoroutineDispatcher = TODO()

}
