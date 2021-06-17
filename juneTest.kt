abstract class  Emp(val name:String , val exp:Int){
    abstract var salary:Double

    abstract fun dob(date:String)

    fun empDetails(){
        println("name of the employee : $name")
        println("experience in years :  $exp")
        println("annual salary : $salary")

    }
}
class Eng(nameE:String ,expE:Int):Emp(nameE,expE){
    override var salary=50000.00
    override fun dob(date:String){
        println("dob is $date")

    }

    fun main() {
        
        val eng=Eng("rahul",33)
        eng.empDetails()
        eng.dob("27 july 2006")
    }

}