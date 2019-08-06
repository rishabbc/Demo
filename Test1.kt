interface Inter {
    fun  f()
    {
        println("interface.f()")
    }
}

open class Base(val name: String) {

    open fun f()
    {
        println("base.f()")
    }
    open val x: Int  = 1


    init { println("Initializing Base") }

    open val size: Int = name.length.also { println("Initializing size in Base: $it") }
}

class Derived(name: String,val lastName: String) : Base(name.capitalize().also { println("Argument for Base: $it") }),Inter {

    override fun f(){
        super<Inter>.f()
        super<Base>.f()
        println("derived.f()")
    }
    override val x: Int= (super.x+1).also { println("x:$it") }

    init { println("Initializing Derived") }

    override val size: Int = (super.size + lastName.length).also { println("Initializing size in Derived: $it") }
}
fun main(args:Array<String>)
{
    val obj1 = Derived("rishab","bhattacharyya")
    obj1.f()
}