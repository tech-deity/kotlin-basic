enum class Day(val num:Int){
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);

 fun printformattedDay()
 {
     println("Day is $this")
 }

}

fun main() {

    val day=Day.SUNDAY
    println(day.num)
    for( i in Day.values())
    {
        println(i)
    }
    day.printformattedDay()
}
