package at.fh.swengb.collectionsandrecyclerview

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

    val myStudent = Student("Chris", 7)
    val myStudent1 = Student("Chris", 7)
    val myStudent2 = Student("Chris", 7)
    val myStudent3 = Student("Chris", 7)
    val myStudent4 = Student("Chris", 7)

    val list = listOf<Student>(Student("Chris", 7),Student("Chris", 7),Student("Rob", 7), Student("George", 2), Student("Lisa", 3))
    //list.add (student("gum",2))
    val firstElement =list[0]
    //Log.v("myActivity", "list")


    val myList = mutableListOf<Student>(Student("Chris", 7),Student("Chris", 7),Student("Rob", 7), Student("George", 2), Student("Lisa", 3))
    val firstElement = list.get(0)
    //val firstElement = list[0]


    val set = mutableSetOf<Student>(Student("Chris", 7),Student("Chris", 7),Student("Rob", 7), Student("George", 2), Student("Lisa", 3))
   // set.add(Student("Emil",5))


    val ima18List = listOf(Student("Tyrion", 1), Student("Jon", 1))
    val ima17List = mutableListOf(Student("Sansa", 3), Student("Arya", 3), Student("Bran", 3))
    val studentMap = mapOf<String, List<Student>>("IMA18" to ima18List, "IMA17" to ima17List)

    var s Student("aba",3)
    for ((student, 1) in map)

    val ima16List = listOf(Student("Tom", 5), Student("Joey", 3))
        }







