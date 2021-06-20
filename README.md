# kotlin-basic-topics


<h1> why sealed Class </h1>

1. sealed class is abstract in nature that means we cant create object of sealed class <br>
2. Sealed classes give us the flexibility of having different types of subclasses and also containing the state <br>
3. subclasses that are extending the Sealed classes should be either nested classes of the Sealed class
         or should be declared in the same file as that of the Sealed class. <br>
         
4.Subclasses of a sealed class, as discussed, are either ordinary classes,
     data classes or sealed classes themselves and hence it is easy 
     to contain the state of the subclass. <br>
     
Example of sealed class 





