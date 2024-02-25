class Employee(var name: String, var number: Int, var shift: Int) {
    fun displayInfo() {
        println("Employee Name: $name")
        println("Employee Number: $number")
        println("Employee Shift: $shift")
        println()
    }
}

fun main() {
    val employee1 = Employee("Joe", 101, 1)
    val employee2 = Employee("Jacki", 102, 2)
    val employee3 = Employee("Luke", 103, 3)
    val employee4 = Employee("Lincoln", 104, 1)

    employee1.displayInfo()
    employee2.displayInfo()
    employee3.displayInfo()
    employee4.displayInfo()
}