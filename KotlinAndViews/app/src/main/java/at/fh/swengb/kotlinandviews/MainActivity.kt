package at.fh.swengb.kotlinandviews

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.v("MyActivity", "Hello Logcat Verbose")
        Log.d("MyActivity", "Hello Logcat Debug")
        Log.i("MyActivity", "Hello Logcat Info")
        Log.w("MyActivity", "Hello Logcat Warning")
        Log.e("MyActivity", "Hello Logcat Error")

        var helloVar = "Hello Variables"
        Log.d("MyActivity", "$helloVar")
        helloVar = "Hello Variables 2"
        Log.d("MyActivity", "$helloVar")


        }
    val myPerson = Person ("George")
    val myStudent = Student(  "Chris", "7")
    Student.name
    printPrintable(person)
    printPrintable (Student)

    fun  printPrintable(Person : Printable) {
        Log.i( "myActicity", Printable.print())

    interface Printable {
        fun print():String
    }

    fun loopThings() {
        for (i in 0..20) {
            Log.d("MyActivity", "For-loop 01: $i")
        }

        for (i in 20 downTo 0 step 2) {
            if (i == 10) {
                continue
            }
            Log.d("MyActivity", "For-loop 02: $i")
        }

        var i = 20
        while (i > 0) {
            if (i == 15) {
                break
            }
            Log.d("MyActivity", "While-loop 02: $i")
            i--

            loopThings()
        }
    }
}
