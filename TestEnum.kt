fun main(args: Array<String>)
{
    val up: Direction = Direction.UP
    println(up.code)

    val up1 = enumValueOf<Direction>("UP")
    println(up1.code)
    //use of values() to get the values
    val values: Array<Direction> = Direction.values()
    for (elements in values)
    {
        println(elements)
    }
    for (elements in values)
    {
        var data = enumValueOf<Direction>("$elements")
        println(data.code)
    }
    //use of enumValues to get the values
    val values2: Array<Direction> = enumValues<Direction>()
    for (elements in values2)
    {
        println(elements)
    }
    for (elements in values2)
    {
        var data = enumValueOf<Direction>("$elements")
        println(data.code)
    }
    println("${
        Direction.UP.data()
    }")
}
enum class Direction(val code : String)
{
    UP("going up"){
        override fun data(): Unit{
            println("up")
        }
    },
    DOWN("going down"){
        override fun data(): Unit{
            println("down")
        }
    },
    RIGHT("going right"){
        override fun data(): Unit{
            println("right")
        }
    },
    LEFT("going left"){
        override fun data(): Unit{
            println("left")
        }
    },
    NONE("going none"){
        override fun data(): Unit{
            println("none")
        }
    };
    abstract fun data()
}