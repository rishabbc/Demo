import kotlin.properties.Delegates
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

/*import kotlin.reflect.KProperty

class DelegateClass
{
    var p: String by DelegationProperties()
}
class DelegationProperties{
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "the string at $thisRef in property ${property.name}"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("new value to ${property.name} in $thisRef is $value")
    }
}
fun main(){
    val dc = DelegateClass()
    dc.p = "new string"
    println(dc.p)
}*/


/*
val lazyValue: String by lazy {
    println("computed!")
    "rishab"
}

fun main() {
    println(lazyValue)
    println(lazyValue)
}
*/

/*
class DelegateTest {
    val name : String by NameDelegate(Database())
}

class Database {
    fun queryName() : String = "Sample results"
}

class NameDelegate<T>(private val db : Database) : ReadOnlyProperty<T, String> {
    override fun getValue(thisRef: T, property: KProperty<*>): String = db.queryName()
}

fun main(){
    val dc = DelegateTest()
    println(dc.name)
}*/

// delegation using observable
/*
fun main(args: Array<String>) {
    val paris=Travel()
    paris.placeName="Paris"
    paris.placeName="Italy"
    println(paris.placeName)

}
class Travel {
    var placeName:String by Delegates.observable("<>"){
            property, oldValue, newValue ->
        println("oldValue = $oldValue, newValue = $newValue")
    }
}*/

//delegation using vetoable
/*
fun main(args: Array<String>) {
    val paris=Travel()
    paris.placeName="Paris"
    paris.placeName="Italy"
    println(paris.placeName)
}
class Travel {
    var placeName:String by Delegates.vetoable("<>"){
            property, oldValue, newValue ->
        if(newValue.equals("Paris" )){
            return@vetoable false
        }
        true
    }
}*/

//local delegated properties

class Delegate {
    operator fun getValue(t: Any?, p: KProperty<*>): Int = 1
}

fun box(): String {
    val prop: Int by Delegate()
    return if (prop == 1) "OK" else "fail"
}
fun main()
{
    println(box())
}