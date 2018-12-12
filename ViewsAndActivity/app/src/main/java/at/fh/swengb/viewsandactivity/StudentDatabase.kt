package at.fh.swengb.viewsandactivity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_student_database.*

class StudentDatabase : AppCompatActivity() {

    private val students = mutableListOf<Student>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_database)
        Log.i("MyActivity", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i("MyActivity", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MyActivity", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MyActivity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MyActivity", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MyActivity", "onDestroy")
    }

    fun addStudent(view: View) {
        val name = student_name.text.toString()
        val currentSemester = current_semester.text.toString().toIntOrNull() ?: 0

        val student = Student(name, currentSemester)
        students.add(student)

        info.text = student.name

        Log.i("MyActivity", "Before removing Students below the 3rd Semester: ${students.size}")
        // Remove ALL entries from a list that match a certain condition
        // In this case all students that are below the 3rd semester
        students.removeAll { it.currentSemester < 3 }
        Log.i("MyActivity", "After removing Students below the 3rd Semester: ${students.size}")
    }
}
