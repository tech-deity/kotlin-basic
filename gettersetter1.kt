//In Kotlin, setter is used to set the value of any variable and getter is used to get the value. Getters and setters are auto-generated in the code.


   

class Company {
    
     var name : String = ""
    get()=field
    set(value){
        field = value
    }
}

fun main(){
    
    val c = Company()
    c.name="vishal"
    println(c.name)
}

// Conventionally, we choose the name of the setter parameter is value, but we can choose a different name if we want. The value parameter contains the value that a property is assigned to.
//In above program, we have initialized the property name as c.name = “GeeksforGeeks”, the value parameter contains the assigned value “GeeksforGeeks”

//field helps in storing the property value in memory possible. When we initialize a property with a value, the initialized value is written to the backing field of that property.
// In above program, the value is assigned to field and then field is assigned to get().
