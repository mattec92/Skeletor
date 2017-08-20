package se.mattec.truechat.views.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import se.mattec.truechat.R
import se.mattec.truechat.dagger.Dagger

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Dagger.component(this).inject(this);
    }

}
