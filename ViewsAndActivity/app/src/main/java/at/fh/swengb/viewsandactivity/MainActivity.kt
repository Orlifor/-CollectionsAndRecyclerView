package at.fh.swengb.viewsandactivity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_copy)
    }

    fun openStudentDatabase(v: View) {
        val intent = Intent(this, StudentDatabase::class.java)
        startActivity(intent)
    }
}
