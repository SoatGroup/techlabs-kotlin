package bbl


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
    val personName = PersonName("first", "last")
    val data = DataPersonName("first", "last")

    val data2 = data.copy(lastName = "lastname copy")
    println(personName)
    println(data)



}