package bbl.solution


class PersonName(var firstName: String, var lastName: String) {

    fun concat(): String {
        return "$firstName $lastName"
    }

}


data class DataPersonName (var firstName: String, var lastName: String) {
    fun concat(): String {
        return "$firstName $lastName"
    }
}


fun main(args: Array<String>) {
    val personName = bbl.solution.PersonName("first", "last")
    val data = bbl.solution.DataPersonName("first", "last")

    val data2 = data.copy(lastName = "lastname copy")
    println(personName)
    println(data)



}