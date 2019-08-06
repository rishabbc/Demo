import java.lang.Integer.parseInt

class outerClass constructor()
{
     var name: String = "Rishab"
    inner class innerClass
    {
        var desc: String = "code inside inner class"
        private var id: Int = 101
        fun foo()
        {
            println("name is ${name}")
            println("id is $id")
        }
    }
}

class jo (val name: String)
{
    init {
        println(name)
    }
}








fun sum(a:Int, b:Int):Unit
{
    if(a>b)
    {
        println("a:$a is more than b:$b")
    }
    else
    {
        println("b:$b is more than a:$a")
    }
    println("sum of $a and $b is ${a+b}")
  //  return a+b
}
fun main(args:Array<String>)
{
    val a:Int =10000
    val b:Int=20

    val c : Int = 1_000_000
    sum(a,b)
    //val c:Int=sum(a,b)
  //  println(c)

    val s: String = "21"
    println("$s.length is ${s.length}")
    println(c)



    println(a == a)
    val boxedA : Int? = a
    val anotherBoxedA: Int? = a
    println(boxedA == anotherBoxedA)


    val m: Byte = 1
    val n: Int = m.toInt()

    println(n)
    val l =1L+3 // long+int=long
    println("l"+l)
    //val x =(4 inv())
    //println("x"+x)


    val num1 = 10
    val num2 = 20

    val result = if(num1 > num2)
        {
            "$num1 is greater than $num2"
        }
    else{
        "$num2 is greater than $num1"
    }
    println(result)


    val s1: String = "20"
    val x: Int = parseInt(s1)

    when (x){ //works as switch case in java
        parseInt(s) -> println("s encodes x")
        else -> println("s does not encode x")
    }

    val marks = arrayOf(10,100,1999,"hshsh")
    for (item in marks)
        println(item)
    for (item in marks.indices)
    {
        println("marks[$item]="+marks[item])
    }
    //or
    for ((index, value) in marks.withIndex())
    {
        println("marks[$index]="+value)
    }


    var y = 20
    while (y<30)
    {
        println(y)
        y++
    }
    for (i in 1..3)
    {
   loop@     for (j in 1..3)
        {
            if(i==2)
                break@loop
            println("i=$i and j=$j")

        }
    }





    //class outer class and inner class along with object creation

    println(outerClass().innerClass().desc)
    var obj1 =outerClass().innerClass()
    obj1.foo()



    var obj2 = jo(name = "jo")
}