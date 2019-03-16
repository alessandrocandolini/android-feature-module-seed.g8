package $package$.app

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

import $package$.R

internal class $name;format="Camel"$Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_$name;format="lower,snake"$)

        if (savedInstanceState == null) {

            val fragment = $name;format="Camel"$Fragment.newInstance()
            supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_layout, fragment)
                    .commit()

        }
    }

}
