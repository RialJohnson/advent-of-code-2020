/**
 * Rial Johnson
 * AOC Day 13 - Challenge 1
 */

fun main() {
    
    val input = "1003681\r\n23,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,37,x,x,x,x,x,431,x,x,x,x,x,x,x,x,x,x,x,x,13,17,x,x,x,x,19,x,x,x,x,x,x,x,x,x,x,x,409,x,x,x,x,x,x,x,x,x,41,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,29"
    
    val earliestTimestamp = input.split("\r\n").first().toLong()
    val busTimes = input.split("\r\n").last()
    
    println(findOptimalBusTime(earliestTimestamp, busTimes)) // answer
}

fun findOptimalBusTime(timeToLeave: Long, busTimes: String): Long {
    
    val listOfBusTimes = parseBusTimes(busTimes)
    
    var lowestDifference: Long = Long.MAX_VALUE
    var lowestIndex = -1
    listOfBusTimes.forEachIndexed { index, value ->
        val base = timeToLeave / value
        val firstPossibleTime = (base + 1) * value
        val difference = firstPossibleTime - timeToLeave
        
        if (difference < lowestDifference) {
			lowestDifference = difference
        	lowestIndex = index
        } 
    }
    
    return listOfBusTimes[lowestIndex] * lowestDifference
}

fun parseBusTimes(busTimes: String): List<Int> {
    
    val busTimesAsList = mutableListOf<Int>()
    val unParsedList = busTimes.split(",").toList()
    
    unParsedList.forEach {
        if (it.contains("[0-9]".toRegex())) busTimesAsList.add(it.toInt())
    }
    
    return busTimesAsList
}
