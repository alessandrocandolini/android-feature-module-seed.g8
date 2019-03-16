package $package$.app

import android.content.Context
import $package$.core.*

internal class $name;format="Camel"$ServiceLocator(private val context: Context) {

    fun getPresenter(): $name;format="Camel"$Contract.Presenter = getPresenter(getInteractor(), getTracker())

    private fun getPresenter(interactor : $name;format="Camel"$Contract.Interactor,
    tracker : $name;format="Camel"$Contract.Tracker
    ): $name;format="Camel"$Contract.Presenter =  $name;format="Camel"$Presenter(interactor, tracker)


    private fun getInteractor(): $name;format="Camel"$Contract.Interactor = TODO()

    private fun getTracker(): $name;format="Camel"$Contract.Tracker = TODO()

}
