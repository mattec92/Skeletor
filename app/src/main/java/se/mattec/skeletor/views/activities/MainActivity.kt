package se.mattec.skeletor.views.activities

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.koin.android.ext.android.get
import org.koin.android.ext.android.inject
import se.mattec.skeletor.R
import se.mattec.skeletor.SkeletorApplication

class MainActivity : AppCompatActivity() {

    private val context: Context by inject()
    private val application: SkeletorApplication by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val context: Context = get()
        val application: SkeletorApplication = get()
    }

}
