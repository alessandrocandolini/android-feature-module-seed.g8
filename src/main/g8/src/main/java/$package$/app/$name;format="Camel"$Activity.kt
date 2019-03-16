package $package$.app

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v4.app.ActivityCompat

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

    companion object {

        fun start(activity: Activity) {
            val intent = Intent(activity, $name;format="Camel"$Activity::class.java)
            ActivityCompat.startActivity(activity, intent, null)
        }
    }

}
