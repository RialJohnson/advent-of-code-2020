/**
 * Rial Johnson
 * AOC Day 10 - Challenge 1
 */

fun main() {
    
    val input = "59\r\n134\r\n159\r\n125\r\n95\r\n92\r\n169\r\n43\r\n154\r\n46\r\n110\r\n79\r\n117\r\n151\r\n141\r\n56\r\n87\r\n10\r\n65\r\n170\r\n89\r\n32\r\n40\r\n118\r\n36\r\n94\r\n124\r\n173\r\n164\r\n166\r\n113\r\n67\r\n76\r\n102\r\n107\r\n52\r\n144\r\n119\r\n2\r\n72\r\n86\r\n73\r\n66\r\n13\r\n15\r\n38\r\n47\r\n109\r\n103\r\n128\r\n165\r\n148\r\n116\r\n146\r\n18\r\n135\r\n68\r\n83\r\n133\r\n171\r\n145\r\n48\r\n31\r\n106\r\n161\r\n6\r\n21\r\n22\r\n77\r\n172\r\n28\r\n78\r\n96\r\n55\r\n132\r\n39\r\n100\r\n108\r\n33\r\n23\r\n54\r\n157\r\n80\r\n153\r\n9\r\n62\r\n26\r\n147\r\n1\r\n27\r\n131\r\n88\r\n138\r\n93\r\n14\r\n123\r\n122\r\n158\r\n152\r\n71\r\n49\r\n101\r\n37\r\n99\r\n160\r\n53\r\n3"
    
    val joltageList = input.split("\r\n").toList()
    val joltageListAsNums = getNumList(joltageList)
    
    println(findAdapterOrder(joltageListAsNums))
}

fun findAdapterOrder(joltageList: List<Int>): Int {
    
    val mutableJoltageList = joltageList.toMutableList()
    val highestJoltage = mutableJoltageList.maxOrNull()!!
    
    mutableJoltageList.add(0)
    mutableJoltageList.add(highestJoltage + 3)
    
    val orderedList = mutableJoltageList.sorted()
    
    var numOf1Differences = 0
    var numOf3Differences = 0
    
    var previousJoltage = -1
    orderedList.forEach {
        if (it != orderedList[0]) {
            if (it - previousJoltage == 1) numOf1Differences++
            else if (it - previousJoltage == 3) numOf3Differences++
        }
        
        previousJoltage = it
    }
	
    return numOf1Differences * numOf3Differences
}

fun getNumList(listOfValues: List<String>): List<Int> {
    val listOfNums = mutableListOf<Int>()
    
    listOfValues.forEach {
        listOfNums.add(it.toInt())
    }
    
    return listOfNums
}