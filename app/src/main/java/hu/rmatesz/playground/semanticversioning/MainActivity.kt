package hu.rmatesz.playground.semanticversioning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import hu.rmatesz.playground.mylibrary.MyPublicAPI
import hu.rmatesz.playground.mylibrarywithprivatepart.PublicAPI

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.version).apply {
            text = "Version: ${BuildConfig.VERSION_NAME}; code: ${BuildConfig.VERSION_CODE}"
            
        }
        MyPublicAPI.publicmethod()
        MyPublicAPI.internalmethod()
        PublicAPI.foo()
    }
}
