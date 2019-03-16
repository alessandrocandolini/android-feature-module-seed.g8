package $package$.core

internal class $name;format="Camel"$Presenter(
    private val interactor: $name;format="Camel"$Contract.Interactor,
    private val tracker: $name;format="Camel"$Contract.Tracker
) : $name;format="Camel"$Contract.Presenter {

    private var view: $name;format = "Camel"$Contract.View? = null

    override fun bind(view: $name;format = "Camel"$Contract.View) {
        this.view = view
    }

    override fun onViewCreated() {
        TODO()
    }

    override fun unbind() {
        this.view = null
    }

}
