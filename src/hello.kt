data class Customer(val Name : String, val Job : String)
data class Home(val Rooms: Int, val Inhabitants : Int, val Names: Array<String>)

fun main(args: Array<String>) {
    val names = arrayOf("George","Laure", "Alexander", "Adelina")
val krasnaPoliana = Home(3,4,names)
    println(krasnaPoliana)
}
