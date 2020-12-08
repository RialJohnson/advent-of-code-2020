/**
 * Rial Johnson
 * AOC Day 8 - Challenge 2
 */

fun main() {
    val input = "acc +0\r\njmp +516\r\nacc -16\r\nnop +326\r\njmp +366\r\njmp +400\r\njmp +494\r\nacc -5\r\njmp +475\r\nacc +29\r\nnop +24\r\njmp +186\r\njmp -5\r\nacc +50\r\nacc +49\r\nacc +49\r\nnop +507\r\njmp +236\r\nacc -4\r\nacc +50\r\nacc +48\r\njmp +293\r\njmp +461\r\nacc +48\r\nacc +2\r\njmp +241\r\nacc +38\r\njmp +544\r\njmp +1\r\njmp +382\r\nacc -4\r\nacc -10\r\nacc +44\r\njmp +444\r\njmp +1\r\nacc +20\r\nacc -1\r\nacc +25\r\njmp +332\r\nacc +18\r\njmp +184\r\nacc +1\r\nacc +20\r\nacc -7\r\nacc -12\r\njmp +84\r\nacc +30\r\njmp -19\r\nnop +491\r\nacc +37\r\nacc +44\r\njmp +220\r\nacc +3\r\nacc +19\r\njmp +485\r\njmp +222\r\nnop +264\r\nacc +4\r\njmp +151\r\nnop -36\r\nacc +48\r\njmp +356\r\nacc +28\r\nacc +29\r\nnop +397\r\njmp +168\r\nnop +115\r\nacc -13\r\nacc -11\r\njmp +470\r\njmp +201\r\nacc +48\r\nacc -6\r\nacc -18\r\nacc -13\r\njmp +442\r\njmp +266\r\nacc +10\r\nacc +30\r\nacc -7\r\nacc -8\r\njmp +380\r\nacc +1\r\nnop +106\r\nacc +9\r\nacc -11\r\njmp -79\r\njmp +166\r\nacc -9\r\njmp +300\r\nacc +39\r\nacc +1\r\nacc +27\r\nacc +26\r\njmp +367\r\njmp +291\r\nacc +18\r\njmp +100\r\nacc +25\r\nacc +43\r\nacc -8\r\nacc -12\r\njmp +475\r\nacc +15\r\njmp +492\r\nacc -5\r\nacc -12\r\nacc +35\r\nacc +25\r\njmp +360\r\nnop +301\r\nacc +32\r\nacc -1\r\njmp +436\r\nacc +21\r\njmp +109\r\nacc +1\r\nnop +230\r\njmp -113\r\nacc +24\r\nacc +12\r\nacc +13\r\nacc +27\r\njmp -52\r\njmp +476\r\nacc +15\r\nacc -18\r\nacc -13\r\njmp +323\r\nacc -10\r\nacc +35\r\nacc -6\r\nnop +377\r\njmp +8\r\njmp +430\r\nnop +50\r\nacc +33\r\nacc -1\r\njmp -72\r\nacc -19\r\njmp -92\r\njmp +1\r\njmp -87\r\nnop -120\r\nnop -34\r\njmp +159\r\njmp +183\r\njmp +1\r\nacc -4\r\nacc +49\r\nacc -4\r\njmp +73\r\nacc -18\r\nacc +34\r\nacc -8\r\njmp +403\r\nacc +32\r\nacc +0\r\nacc +0\r\njmp +390\r\nacc +19\r\njmp +305\r\nacc -15\r\njmp +176\r\nacc +3\r\njmp +36\r\nacc +29\r\nacc +21\r\njmp +1\r\nacc -17\r\njmp +144\r\nacc +16\r\nacc +4\r\nacc +49\r\nacc -7\r\njmp -65\r\nacc +28\r\nacc +2\r\nacc +23\r\nacc +46\r\njmp +278\r\njmp +424\r\nacc +45\r\nacc +7\r\njmp -49\r\njmp -50\r\nacc -11\r\nnop -121\r\njmp -140\r\njmp +1\r\nacc -8\r\njmp +206\r\nacc -7\r\njmp +1\r\nacc +20\r\nacc +30\r\njmp +375\r\nnop +312\r\njmp +111\r\nacc +23\r\njmp -15\r\nacc +27\r\nacc +46\r\nacc +36\r\njmp +360\r\nacc +1\r\nacc +25\r\nacc +29\r\njmp -137\r\njmp +177\r\nacc +15\r\nacc -13\r\nacc +48\r\nacc +29\r\njmp +76\r\nnop -174\r\nacc +27\r\njmp +214\r\nacc +4\r\njmp +120\r\nnop -165\r\nacc -16\r\njmp +2\r\njmp +238\r\njmp +224\r\njmp -154\r\nacc +12\r\njmp +162\r\nacc +31\r\nacc +26\r\nacc -13\r\nacc +18\r\njmp +173\r\nacc +38\r\njmp +1\r\njmp +199\r\njmp -202\r\njmp +127\r\nacc -12\r\njmp -42\r\nacc -12\r\nacc +36\r\nacc -4\r\nacc +24\r\njmp +343\r\nacc -17\r\nnop +277\r\nacc +13\r\njmp +56\r\njmp +41\r\nnop +92\r\nacc +32\r\njmp +182\r\nnop +111\r\nacc +0\r\nacc +29\r\njmp +219\r\nnop -234\r\nacc +0\r\nacc +31\r\nacc +49\r\njmp +216\r\njmp +247\r\nacc +24\r\nacc -10\r\njmp +218\r\nacc +14\r\nacc -19\r\nacc +14\r\njmp +11\r\njmp +82\r\nacc +5\r\nacc +28\r\nacc +35\r\njmp -93\r\nacc +24\r\njmp -210\r\nacc +39\r\njmp -107\r\njmp -150\r\nacc -7\r\njmp -185\r\nacc +25\r\nacc -15\r\njmp +63\r\nacc +14\r\nacc +50\r\njmp -7\r\nacc +13\r\njmp +298\r\nnop +69\r\njmp -268\r\nacc -5\r\njmp +66\r\njmp +48\r\nnop -1\r\nacc +38\r\nacc +3\r\nacc +46\r\njmp +259\r\nnop +235\r\nacc +4\r\njmp -186\r\njmp +94\r\nacc -16\r\nacc +6\r\njmp +287\r\nacc -19\r\njmp -221\r\njmp -69\r\nacc +8\r\nnop -102\r\nacc +31\r\njmp +204\r\njmp -81\r\nacc +12\r\nacc +21\r\nacc -8\r\nnop +151\r\njmp -155\r\nacc +50\r\nnop +145\r\nacc -6\r\nacc +0\r\njmp -296\r\nacc +16\r\nacc +30\r\nacc +11\r\njmp +254\r\nacc +0\r\nacc -8\r\nnop +162\r\nacc -17\r\njmp -144\r\nacc +6\r\nacc +2\r\nacc +32\r\nacc -5\r\njmp +21\r\njmp -77\r\nacc +38\r\njmp +117\r\nacc +27\r\nacc -11\r\nnop -203\r\njmp +201\r\njmp -305\r\nacc +40\r\nnop -330\r\nacc -7\r\njmp -279\r\njmp +60\r\nnop -163\r\njmp -53\r\nnop +115\r\nacc +24\r\njmp +1\r\nacc +45\r\njmp -92\r\nacc +0\r\nacc +13\r\njmp -302\r\nacc +25\r\njmp +208\r\nnop -293\r\njmp +5\r\njmp +1\r\nacc -13\r\nnop -272\r\njmp +62\r\nacc -4\r\nacc +32\r\nacc +49\r\njmp -124\r\nacc -19\r\nnop -246\r\njmp -353\r\nnop -349\r\nacc +13\r\nacc +21\r\njmp -165\r\nacc +14\r\nacc +37\r\nnop +28\r\nacc +7\r\njmp -308\r\nacc +11\r\njmp +71\r\njmp -139\r\nnop -19\r\nacc -7\r\nacc -3\r\njmp -302\r\nacc -2\r\nacc +1\r\nnop -43\r\njmp -280\r\nacc +10\r\nacc +9\r\njmp -358\r\nacc +39\r\nacc +16\r\nacc -11\r\njmp +1\r\njmp +142\r\nacc -15\r\nacc -17\r\nacc +9\r\nacc +11\r\njmp -172\r\njmp -90\r\nnop +135\r\nacc -1\r\njmp -379\r\nacc +39\r\nacc -13\r\njmp -57\r\nacc -3\r\nacc -7\r\njmp +1\r\njmp +80\r\nacc +7\r\nacc +11\r\nacc +30\r\nnop +69\r\njmp -140\r\nacc +11\r\nacc +7\r\nacc +3\r\njmp -417\r\njmp -314\r\nacc -6\r\njmp -6\r\njmp -224\r\nacc +0\r\njmp -131\r\nacc +7\r\nacc +33\r\njmp +20\r\nacc +32\r\nacc -14\r\nnop -375\r\njmp -394\r\nacc +8\r\nacc +47\r\nacc +29\r\nacc -6\r\njmp -381\r\nacc -8\r\njmp -353\r\njmp -108\r\nacc -16\r\nacc +21\r\njmp -329\r\nacc +13\r\nacc +0\r\nacc +0\r\njmp -402\r\nacc -8\r\njmp -307\r\njmp -308\r\njmp -358\r\nacc +38\r\nacc -19\r\nacc +33\r\njmp -276\r\njmp -114\r\nacc -6\r\njmp +55\r\nacc +16\r\njmp -244\r\nnop +22\r\nacc -7\r\nacc +19\r\njmp -154\r\njmp +18\r\njmp -50\r\nacc +31\r\nacc +50\r\nacc +2\r\njmp -260\r\nacc -16\r\njmp -135\r\nacc +50\r\nacc -9\r\nacc +50\r\nacc +27\r\njmp -323\r\nacc +26\r\nnop -249\r\nacc +46\r\nacc +3\r\njmp -474\r\nacc +50\r\nacc -7\r\njmp -78\r\njmp +1\r\nacc -6\r\nacc +6\r\njmp +94\r\nacc +47\r\nacc -3\r\nacc +13\r\njmp -485\r\nnop -499\r\nacc +35\r\nacc +35\r\nacc -1\r\njmp -259\r\nnop -486\r\nacc +48\r\nacc -4\r\njmp +23\r\nacc +33\r\nacc +37\r\nacc +10\r\njmp +61\r\nacc -1\r\njmp +1\r\njmp +1\r\nacc -8\r\njmp +61\r\njmp -237\r\njmp -164\r\nacc +39\r\nacc +38\r\nnop -302\r\njmp -468\r\nacc -15\r\njmp -6\r\nacc -9\r\nacc +1\r\nacc +41\r\nacc +48\r\njmp -285\r\nacc +1\r\nacc +24\r\njmp -111\r\njmp -90\r\nacc +46\r\nacc +21\r\nacc +43\r\njmp -103\r\nacc -9\r\nnop -5\r\njmp -274\r\nacc -13\r\njmp -262\r\njmp -39\r\nacc +43\r\nnop -463\r\nacc +15\r\nacc +23\r\njmp -176\r\nnop -305\r\nacc +2\r\nacc +28\r\njmp -198\r\nacc +15\r\nacc -18\r\njmp -473\r\nacc -13\r\nacc +9\r\njmp -46\r\nacc +1\r\nacc +43\r\nacc +6\r\njmp +10\r\nacc +24\r\nacc -3\r\njmp -424\r\nacc -1\r\nacc +47\r\njmp +1\r\nacc +20\r\njmp -17\r\njmp -59\r\nnop -19\r\nacc +42\r\nacc +47\r\njmp -9\r\njmp -576\r\nnop -148\r\nacc +0\r\njmp +12\r\nacc -15\r\njmp -209\r\nacc +13\r\njmp -442\r\nnop -548\r\nnop -62\r\nacc +22\r\njmp -92\r\njmp -516\r\nacc +8\r\njmp -301\r\nacc +1\r\njmp -146\r\nacc -15\r\njmp -366\r\njmp -440\r\nacc +17\r\nacc +25\r\nacc +28\r\njmp -240\r\nacc -2\r\nacc +25\r\nnop -68\r\nacc +14\r\njmp +1"
    
    val listOfInstructions = input.split("\r\n").toList()
    println(executeInstructions(listOfInstructions)) // answer
}

fun executeInstructions(instructions: List<String>): Int {
    val visitedBefore = HashMap<Int, Boolean>()
    var infiniteLoop = false
    var index = 0
    val maxIndex = instructions.size - 1
    
    while (!infiniteLoop) {
        if (visitedBefore.get(index) == true) {
            infiniteLoop = true
            break
        }
        
        val instruction = instructions[index]
        val instructionPair = parseInstruction(instruction)
        val operation = instructionPair.first
        val argument = instructionPair.second
        
        visitedBefore.put(index, true)
        
        if (operation == "acc") {
            index++
        } else if (operation == "jmp") {
            
            val newInstructions = instructions.toMutableList()
            newInstructions[index] = "nop $argument"
            val tryChangingThisInstruction = changingThisInstructionTerminates(newInstructions)
            
            if (tryChangingThisInstruction.first == true) {
                return tryChangingThisInstruction.second
            } else {
                val potIndex = index + argument
                if (potIndex > maxIndex + 1) index = potIndex - maxIndex // wrap back to the beginning
                else if (potIndex < 0) index = maxIndex + potIndex // wrap back to end
                else index = potIndex
            }
            

        } else if (operation == "nop") {
            
            val newInstructions = instructions.toMutableList()
            newInstructions[index] = "jmp $argument"
            val tryChangingThisInstruction = changingThisInstructionTerminates(newInstructions)
            
            if (tryChangingThisInstruction.first == true) {
                return tryChangingThisInstruction.second
            } else index++
        } else println("operation not recognized!")
    }   

    return -1.also{println("you've met a terrible fate")}
}

fun changingThisInstructionTerminates(instructions: List<String>): Pair<Boolean, Int> {
    var accVal = 0
    val visitedBefore = HashMap<Int, Boolean>()
    var infiniteLoop = false
    var index = 0
    val maxIndex = instructions.size - 1
    
    while (!infiniteLoop) {
        if (index == maxIndex + 1) {
            return Pair(true, accVal)
        }
        
        if (visitedBefore.get(index) == true) {
            infiniteLoop = true
            break
        }
        
        val instruction = instructions[index]
        val instructionPair = parseInstruction(instruction)
        val operation = instructionPair.first
        val argument = instructionPair.second
        
        visitedBefore.put(index, true)
        
        if (operation == "acc") {
            accVal += argument
            index++
        } else if (operation == "jmp") {
            val potIndex = index + argument
            if (potIndex > maxIndex + 1) index = potIndex - maxIndex // wrap back to the beginning
            else if (potIndex < 0) index = maxIndex + potIndex // wrap back to end
            else index = potIndex
        } else if (operation == "nop") {
            index++
        } else println("operation not recognized!")
    }   

    return Pair(false, accVal)
}

fun parseInstruction(instruction: String): Pair<String, Int> {
    
    val operation = instruction.split(" ").first()
    val argument = instruction.split(" ").last().replace("+", "").toInt()
    
    return Pair(operation, argument)   
}