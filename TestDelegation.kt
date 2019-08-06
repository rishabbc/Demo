import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

/*
*in this code the flyAndFindFood gets overridden
interface BirdInterface{
    fun flyAndFindFood()
    fun land()
}

class Eagle(val age:Int): BirdInterface{
    override fun flyAndFindFood() {
        println("I am eagle. i am $age years old. I am flying and finding food ")
    }
    override fun land(){
        println("i am eagle. i am landing.")
    }
}

class Cuckoo(b: BirdInterface): BirdInterface by b{
    override fun flyAndFindFood() {
        println("i am cuckoo. i am flying and finding food")
    }
}
fun main(args: Array<String>)
{
    var eagle=Eagle(3)
    var cuckoo = Cuckoo(eagle)
    cuckoo.flyAndFindFood()
    cuckoo.land()
}*/

//here the print() in BaseImpl does not get overridden and the method is accessed through delegation
/*
interface Base1 {
    fun print()
}

class BaseImpl(val x: Int): Base1{
    override  fun print(){
        print(x)
    }
}


class DerivedImpl(b: Base1) : Base1 by b{

}

fun main() {
    val ref1 = BaseImpl(3)
    val ref2 = DerivedImpl(ref1)
    ref2.print()
}*/
