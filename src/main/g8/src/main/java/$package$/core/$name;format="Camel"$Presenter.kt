package $package$.core

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

internal class $name;format="Camel"$Presenter(
    private val interactor: $name;format="Camel"$Contract.Interactor,
    private val tracker: $name;format="Camel"$Contract.Tracker,
    private val ui: CoroutineDispatcher,
    private val io: CoroutineDispatcher
) : $name;format="Camel"$Contract.Presenter, CoroutineScope {

    private var view: $name;format = "Camel"$Contract.View? = null

    private val job = Job()

    override val coroutineContext: CoroutineContext
        get() = ui + job

    override fun bind(view: $name;format = "Camel"$Contract.View) {
        this.view = view
    }

    override fun onViewCreated() {
        fetch()
    }

    private fun CoroutineScope.fetch() = launch(io) {
        TODO()
    }

    private fun CoroutineScope.render() = launch(ui) {
        view?.let {
            TODO()
        }
    }

    override fun unbind() {
        this.view = null
        job.cancel()
    }

}
