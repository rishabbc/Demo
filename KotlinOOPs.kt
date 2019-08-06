//primary constructor
//performing inheritance using open
open class MyClass
{
    constructor(name: String):this(name,25)//call of another secondary constructor in the same class
    {
        println("name is :${name}")
       // println("age is :${age}")
        println("name is :${name}")
      //  println("age is :${age}")
    }
    constructor(name: String,id: Int)
    {
        println("name in 2ns constructor is : ${name}")
        println("id in 2nd constructor is: ${id}")
    }

   open fun printData()
    {
        println("print data method")
    }
}
//secondary constructor
//extending MyClass
open class MyClass2 : MyClass
{
    constructor(name: String, id: Int):super(name)//call of parent class constructor from child class
    {
        println(name)
        println(id)
    }
    override fun printData()
    {
        println("overridden print Data method of myclass2")
    }
}

class MyClass3 (name: String, id: Int): MyClass2("rishab", 51)
{
   override fun printData()
   {
       println("overridden print Data method of myclass3")
   }

}
fun main (args: Array<String>)
{

    var obj2 = MyClass3(name = "bro",id = 66)
    obj2.printData()

}
