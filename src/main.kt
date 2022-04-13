fun main() {
    var numArray = arrayOf(12, 456, 32, 535, 3, 2, 78, 1)
    println(numArray[1])

    var friends = arrayOf("Amos", "Fred", "Brain")

    var county = arrayOf("Kenya", "52000000", "Nairobi", "Democray")
    println(numArray[3])

    var tableOne = arrayOf("Tessa", "Nyawera", "Angela", "Maryann", "Mercy", "Naima")
    var x = tableOne.get(2)
    tableOne.set(3,"Brenda")
    println(x)
    println(tableOne[3])

    println(tableOne.contentToString())

   //Addin another element.called breanda
    var table2 = tableOne.plus("brenda")
    println(table2.contentToString())

    tableOne = tableOne.plus("Brenda")
    println(tableOne.contentToString())

//interswitchng the position of names Angela and mercy.
    var ang = tableOne[2]
    var mer = tableOne[4]
    tableOne.set(4, "Angela")
    tableOne.set(2, "Mercy")

//
    table2 = arrayOf("Diana", "joana", "esther")
    var table3 =table2.plus(tableOne)
    println(table3.contentToString())


//finding the index of arrays
    var index = tableOne.indexOf("Esther")
    println(index)

    var nums = arrayOf(1,2,3,4,5,6,7,12,35,60)
    //count the numbers in the array.
    println(nums.count())
    //find the sum of numbers in the array.
    println(nums.sum())
    //to get the min or max value in array
    println(nums.minOrNull())
    println(nums.maxOrNull())

    var sortedNums =nums.sortedArrayDescending()
    println(sortedNums.contentToString()
    )
//looping through arrays
    nums.forEach { conslate ->
        //print them
        println(conslate)
        //find their squareroots
    println(conslate*conslate)
        //find their
        println(Math.pow(conslate.toDouble(),4.0))
    }

    var students = arrayOf("james","carol","mary", "oak")
    println(students.sortedArray().contentToString())
    var students1 = arrayOf("mary","james")


    //sorting arrays

    school(arrayOf("joana","jeruto","carol"))

}

// create a function that takes in an
//array of names and prints out each of them in uppercase
fun school(names:Array<String>){
    //println(names.contentToString()
            names.forEach { conslate ->
        println(conslate.uppercase())
    }
}