package $package$.app

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import $package$.core.*
import $package$.R

internal class $name;format="Camel"$Fragment : Fragment(), $name;format="Camel"$Contract.View {

    private lateinit var presenter : $name;format="Camel"$Contract.Presenter

    override fun onAttach(context: Context) {
        super.onAttach(context)
        val serviceLocator = $name;format="Camel"$ServiceLocator(context)
        presenter = serviceLocator.getPresenter()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_$name;format="lower,snake"$, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter.bind(this)
        presenter.onViewCreated()
    }

    override fun onDestroyView() {
        presenter.unbind()
        super.onDestroyView()
    }

    companion object {

        internal fun newInstance(): Fragment = $name;format="Camel"$Fragment()
    }
}
