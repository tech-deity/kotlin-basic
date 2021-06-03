data  class Person(val id :Int , val name :String)

fun main (){

    val p1=Person(1,"vishal")
    val p2=Person(1,"vishal")

    println(p1)
    println(p2)
    println(p1==p2)
    
    val p3=p1.copy(id=22)
    println(p3)

    val hash1=p1.hashCode()
    println(hash1)
    val hash2 =p2.hashCode()
    println(hash2)


    val hash3 =p3.hashCode()
    println(hash3
    )
}
