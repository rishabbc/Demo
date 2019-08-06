//private abstract methods
fun main(args: Array<String>)
{
    var lion = Animal.Lion()
    var tiger = Animal.Tiger()
    var dog = wolf()

    animalType(lion)
    animalType(tiger)
    animalType(dog)
    lion.display()
}
sealed class Animal
{
    class Lion: Animal()
    {
        fun display()
        {
            println("lion")
        }
    }
    class Tiger: Animal()
    open class Dog: Animal()

}
class wolf: Animal.Dog()
{
}
fun animalType(a:Animal)=
    when(a)
    {
        is Animal.Tiger -> println("is a tiger")
        is Animal.Lion -> println("is a lion")
        else -> println("is a dog or wolf")
    }
