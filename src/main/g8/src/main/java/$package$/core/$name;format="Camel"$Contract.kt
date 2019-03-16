package $package$.core

internal interface $name;format="Camel"$Contract{

    interface View {


    }

    interface Presenter {

        fun bind(view: View)

        fun onViewCreated()

        fun unbind()

    }

    interface Interactor {


    }

    interface Tracker {


    }


}
