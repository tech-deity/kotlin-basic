sealed class Mammal(val name:String)
class Cat(val catName:String):Mammal(catName)
class Human(val humanName:String, val job:String):Mammal(humanName)
fun greetMammal(m:Mammal):String{

    when(m){
        is Human-> return "hello ${m.name}; your working as a ${m.job}"
        is Cat-> return "Hello $(m.name}"

    }
}

fun main()
{
    println(greetMammal(Cat("miika")))
    println(greetMammal(Human("ravi","android developer")))
}