fun main (args: Array<String>)
{
    val inner = OuterClass.NestedClass()
    inner.innerFunc()
}
class OuterClass
{
    class NestedClass // do not store a reference to outer class
    {
        fun innerFunc()
        {
            println("nested class inner func")
        }
    }
}