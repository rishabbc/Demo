class Company {
    var name: String = ""
        get() = field	 // getter
        set(value) {		 // setter
            field = value
        }
    var age: Int = 0
        get() = field	 // getter
        set(value) {		 // setter
            field = value
        }
}
fun main(args: Array<String>) {
    val c = Company()
    c.name = "GeeksforGeeks" // access setter
    println(c.name)		 // access getter
    c.age = 100
    println(c.age)
}
/*
class Company {
    val companyName: String
        get()
        {
            return "helli"
        }
    var name: String = ""
    var age: Int = 0
        get() = field	 // getter
        set(value) {		 // setter
            field = value
        }

}
fun main(args: Array<String>) {
    val c = Company()
    c.name = "GeeksforGeeks" // access setter
    println(c.name)		 // access getter
    c.age = 100
    println(c.age)

    println(c.companyName)
}

 */
