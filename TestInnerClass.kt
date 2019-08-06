fun main(args: Array<String>)
{
    val ref = AnotherOuterClass().InnerClasss()
    ref.inner()
}
class AnotherOuterClass
{
    var name: String = "Rishab"

    inner class InnerClasss
    {
        fun inner()
        {
            val outer = this@AnotherOuterClass
            println(outer.name)
            //or
            println("this is my name $name")

        }
    }
}