fun main(args: Array<String>)
{
    var ageInt: Person <Int> = Person <Int>(30)
    var ageString: Person <String> = Person <String>("40")


    var stringList: ArrayList<String> = arrayListOf<String>("rishab","ritu")
    var floatList: ArrayList<Float> = arrayListOf<Float>(10.5f,230.4f,828.7f)
    stringList.printValue()
    floatList.printValue()
}

class Person<T>(age: T)
{
    var age: T = age
    init {
        this.age=age
        println(age)
    }
}

fun <T> ArrayList<T>.printValue()
{
    for (element in this)
    {
        println(element)
    }
}