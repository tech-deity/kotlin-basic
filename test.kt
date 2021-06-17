fun main() {
	// initialize with duplicate values but output with no repeatition
	var immutableSet = listOf<Int>(6,9,9,0,0)
	// gives compile time error
	//immutableSet.add(7)
	for(item in immutableSet){
		println(item)
	}
}
