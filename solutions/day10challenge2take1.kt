/**
 * Rial Johnson
 * AOC Day 10 - Challenge 2
 */

/*
 * NOTE: THIS IS A BAD SOLUTION
 * It's runtime is O(2^n)
 * It will only work for small input sizes
 */

fun main() {
    val testInput = "28\r\n33\r\n18\r\n42\r\n31\r\n14\r\n46\r\n20\r\n48\r\n47\r\n24\r\n23\r\n49\r\n45\r\n19\r\n38\r\n39\r\n11\r\n1\r\n32\r\n25\r\n35\r\n8\r\n17\r\n7\r\n9\r\n4\r\n2\r\n34\r\n10\r\n3"

    val joltageList = testInput.split("\r\n").toList()
    val joltageListAsNums = getNumList(joltageList)

    println(countArrangements(joltageListAsNums))
}

fun countArrangements(joltageList: List<Int>): Long {

    val mutableJoltageList = joltageList.toMutableList()
    val highestJoltage = mutableJoltageList.maxOrNull()!!

    mutableJoltageList.add(0)
    mutableJoltageList.add(highestJoltage + 3)

    val orderedList = mutableJoltageList.sorted()
    val nodeList = makeNodeList(orderedList)

    makeNodeGraph(nodeList)

    val count = MutableLong(0)

    return graphTraversal(nodeList.first(), nodeList.last(), count)
}

fun graphTraversal(start: Node, end: Node, count: MutableLong): Long {

    if (start == end) {
        count.value = count.value + 1
    } else {
        start.childList.forEach {
            count.value = graphTraversal(it, end, count)
        }
    }

    return count.value
}

fun makeNodeGraph(nodeList: List<Node>) {
    var index = 0
    val endIndex = nodeList.size
    nodeList.forEach {
        if (index != endIndex) {
            val node = it
            val sublist = nodeList.subList(index + 1, endIndex)

            sublist.forEach {
                if (node.value >= it.value - 3) node.addChild(it)
            }
            index++
        }
    }
}

fun makeNodeList(joltageList: List<Int>): List<Node> {

    val nodeList = mutableListOf<Node>()

    joltageList.forEachIndexed { index, value ->
        val node = Node(value, index)
        nodeList.add(node)
    }

    return nodeList
}

fun getNumList(listOfValues: List<String>): List<Int> {
    val listOfNums = mutableListOf<Int>()

    listOfValues.forEach {
        listOfNums.add(it.toInt())
    }

    return listOfNums
}

class Node(value: Int, index: Int) {
    var value: Int = value
    var childList: MutableList<Node> = mutableListOf<Node>()
    val index: Int = index

    fun addChild(child: Node) {
        childList.add(child)
    }
}

class MutableLong(inValue: Long) {
    var value = inValue
}