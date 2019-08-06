abstract class Car
{
    abstract  fun run()
}
abstract class Honda: Car()
{
    abstract override fun run()
}
class HondaCivic:Honda()
{
    override fun run()
    {
        println("honda civic running")
    }
}
fun main(args: Array<String>)
{
    val obj1 = HondaCivic()
    obj1.run()
}