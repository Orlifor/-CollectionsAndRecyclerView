package at.fh.swengb.kotlinandviews

interface Printable {
    fun print(): String
}

open class Person(val name: String) : Printable {
    override fun print(): String {
        return name
    }
}
class Student(name: String, val currentSemester: int) : Person(name) {

    override fun print(): String {
        val superPrint = super.print()
        return "$superPrint $currentSemester"
    }
}