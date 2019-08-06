fun main(args: Array<String>)
{
    var user1 = User("sam",10, 13)
    var user2 = User("sam", 10,13)

    var newUser = user1.copy(name = "ballu")

    if (user1 == user2)
    {
        println("equal")
    }
    else
    {
        println("not equal")
    }
    println(user1.component1())
    println(user1.component3())
    println(user1.toString())
    println(newUser)
    println(user1==user2)
    println(user1.equals(user2))
    println(user2.hashCode()==user1.hashCode())

}

data class User (var name: String,var id: Int, var num: Int)
{

}