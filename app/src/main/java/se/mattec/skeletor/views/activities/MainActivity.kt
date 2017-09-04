package se.mattec.skeletor.views.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import se.mattec.skeletor.R
import se.mattec.skeletor.dagger.Dagger

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Dagger.component(this).inject(this);
    }

}
