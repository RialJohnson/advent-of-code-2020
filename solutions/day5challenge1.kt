/**
 * Rial Johnson
 * AOC Day 5 - Challenge 1
 */

fun main() {
    
    val input = "FFBBFFFLRL\r\nFFBBFBBRRL\r\nFBBBFFBLRL\r\nBBFBFFBLRR\r\nBFBBBFFLLL\r\nBFBBBBBLLR\r\nFBFBFBFLLR\r\nBFBFBBFLLR\r\nFBBFBFBLLL\r\nBBBFBFBRLL\r\nBFBBBFBLRL\r\nFBBFFFBLLR\r\nBFFBFBFLRL\r\nFBBBBFBRLR\r\nFFBBBBBRRL\r\nFBBFBFFLRL\r\nFBBBBBBLLR\r\nFBBFBBBRRL\r\nFBBFFBFRLL\r\nFBFBBBBRRR\r\nBFFBFBFRRL\r\nBFBFBBBLLR\r\nFFFFBFBLRL\r\nFBFFBFFLRL\r\nFFBFBBBRRR\r\nFFBFFFFLRR\r\nFBBBFFFLLR\r\nFFFFFBFLLL\r\nBFFFFFFLRL\r\nFBBBBBFRLR\r\nBBBFFBBRRR\r\nFFFFBBBRLL\r\nFBFFBBBRLR\r\nBFBBBFFRRL\r\nBBFBBFBLRL\r\nBFBFBFFRRR\r\nBBFBFFFLLL\r\nFBFBFBFRRR\r\nBFBFBFFRRL\r\nBBFBBFBRRL\r\nFFBBFBFLRL\r\nFBFFFFFRLR\r\nFBBFFFBLLL\r\nFBBBBFFRLL\r\nFFBBBBBLLL\r\nBFFBBFFRLR\r\nFFFBBFBRRR\r\nFBBBFFFRLL\r\nFFFBFBFLRL\r\nBFFBBFFLRL\r\nBFBBBBBLRL\r\nBFFFFFBRRR\r\nFFFBBFBLRL\r\nFBBBFBFRLL\r\nFBBFBFBLRR\r\nBBFBBFFLRR\r\nFBFFBBFLLL\r\nFFFFFBBRLL\r\nFFBBFFBRLR\r\nBBFFFFFLLL\r\nBFFFFBFLRR\r\nFBFBBFFRRL\r\nBFBFFBBLLR\r\nFBBBFBBRLR\r\nBBBFBFFRLL\r\nBBFFBBFRLR\r\nFFBFFBBRLR\r\nFFBBBFBRLR\r\nBBBFFFBLRR\r\nBBFBFBFLRR\r\nBFBBBBBRLR\r\nBFFFFFBLLR\r\nFBFFBFFRLL\r\nBBBFFBBRLR\r\nFFBBBFBRRR\r\nBFBBBFBRLR\r\nFBFFFBBLRL\r\nFFFBFFFRLL\r\nBBFFBFFLLL\r\nBFFBBFFRRR\r\nFFBFBFBRRL\r\nFFBBBFBRRL\r\nFBBFFBBRLR\r\nFBFFBBFRLR\r\nBFBFFBBRRR\r\nBBFBFBBRLR\r\nFFBFFFFRRL\r\nBBFFBFFLLR\r\nFBBFBFBRRR\r\nBFBFBBBRRL\r\nFBFBFFBRRL\r\nFFFBBFFRLL\r\nBFBFFFFRRR\r\nFBBFFBFLLR\r\nFFBFBFFRLL\r\nFBFFBFBLLL\r\nFBFBFFFLRL\r\nBBFFFFFRRR\r\nFBFFBBFLRR\r\nFBFFFBFLRL\r\nFBBBFBBRRL\r\nBFFBFFFRLR\r\nFFBBBBFLLR\r\nBFFFFBFLRL\r\nBFFBFFBRRR\r\nFFBFBFBLRL\r\nBBFFFBBRLL\r\nFFBFBBFRRR\r\nFFFBFBFRRL\r\nFBFFBFBRRR\r\nFBBBBFBRRL\r\nFBFFFFFLLR\r\nFFBFFFFLLR\r\nFBBBBFFRLR\r\nBBBFFBBLRR\r\nBBBFFBFLRR\r\nFBBFBBBLRR\r\nFBBFBBFRRL\r\nFFFBFFBLLL\r\nFBFFFFBLLL\r\nBBFFFFBLLL\r\nFBFFFBFLRR\r\nFFBFBFFLRR\r\nBBFBFFFRLL\r\nFFFBBBFRLR\r\nFFBFFBBRLL\r\nBBBFBFFRRL\r\nBFFBBBBLRR\r\nBFFFFFFLLL\r\nBBBFFFBLLL\r\nFBBBBBFRLL\r\nFBBFBBBLLR\r\nBBFBFFFRRR\r\nBBFFFBBLLL\r\nFBBFFBFLRL\r\nBBFBFFFLRR\r\nBFBFFBFRLL\r\nBFFFBFBLLR\r\nBBBFBFBLLL\r\nBBBFFBFRLR\r\nFBFFBFBRLR\r\nBFBBFFFLLL\r\nBBFFFFBLRR\r\nBBFFFBBRRL\r\nBBBFBFFLLL\r\nBFBFFBFLLL\r\nFBBBBFFLLR\r\nFFBFFFFRLR\r\nFFBBBFBRLL\r\nBFFFFFFRRL\r\nBFBFFBBLRL\r\nBBFBBBFRLL\r\nBFFFBFFLLR\r\nBBFBFFBRLL\r\nBFBBFFFRLL\r\nBBFBBFBRLR\r\nFFFBBFBRLR\r\nBFFFBBFLRL\r\nFFBFFBFRLL\r\nFFFBFFBLRL\r\nBFBBBFFRLR\r\nBBBFFBBLRL\r\nBFFBBBBRRL\r\nFFBBFFFRLL\r\nBFBFFBFLRL\r\nBFFBBBBRRR\r\nBBFBFBFRRL\r\nBBBFFBFRRL\r\nBFFFBFBLRL\r\nFFFBFBFRLR\r\nFBFFBBBLRR\r\nFFFFBBBLLL\r\nBBBFBBFLLR\r\nBFFBFBFRRR\r\nBFBFFFBRRR\r\nBBFBBBBLLR\r\nFFBBBBBLRL\r\nFFBFFBFLRR\r\nFFBBBFBLRR\r\nBBFBBFBRRR\r\nFFFFFFBRRR\r\nBFBFBFBRRL\r\nBBFFBBBLRR\r\nBBFBFFFRLR\r\nFBBFBFBLLR\r\nBFBBFFBRLL\r\nFFFFBFBLLR\r\nBFBFFBBRLR\r\nFBFFFBFRRR\r\nBFFBFFFRLL\r\nFBBBFFFRRR\r\nFFFBBBFLLL\r\nFBBBBBBRRL\r\nFBBFFBBLLR\r\nBBBFBFFLRR\r\nBFBBFBFLRR\r\nFFFBBBBRRR\r\nBFFFBBFRLR\r\nFBFFBBFLLR\r\nFBFFFFFRRL\r\nBBBFBBFLLL\r\nBBBFFFFRLR\r\nFFFFBBBRRR\r\nFBBBFBBLLL\r\nBFFBFFBLLL\r\nFBFBBFBRLR\r\nFFBFFBBLLR\r\nFFFFBFFLRR\r\nFBBFFBFLLL\r\nFBFBBFBRRR\r\nBBBFBFBLLR\r\nBBFFBFBLLL\r\nFFBFFBFRLR\r\nFBBBFBBLRR\r\nBBFBBFBLLL\r\nFFBFFBFRRR\r\nFBBBBFFLRL\r\nBFBBFBFLLR\r\nFBFBBBFRLR\r\nBFBBFFBLLR\r\nFFFBBBFLLR\r\nFFFBBBFRRL\r\nBFFFBFBRLR\r\nBBBFBBFLRR\r\nBBFBBFFLLR\r\nBBFBBBBRLR\r\nFBBFFFFLRR\r\nFBFBBFFRLL\r\nFFBFFFFRRR\r\nFFFBBFFRRL\r\nFFFBBFBRRL\r\nFFFBFBFLLR\r\nFFBBBBFRRR\r\nBFFFFBBRRL\r\nBFFFFBFRRR\r\nBFBBBFBLRR\r\nFFBBFFFRRL\r\nFBBBBBBRRR\r\nBBFBFFBLLR\r\nFBFFFFBRLL\r\nBFBBFBFLLL\r\nFBFFFBBRLL\r\nFBBBFFBLLR\r\nBBFBBBFRLR\r\nFBFBBFBLRR\r\nFFFFFBFLLR\r\nFBFBBBFLRL\r\nFFBFFFBRRR\r\nFFFBBFFLRL\r\nBBBFFFFLLR\r\nBFBFFFFRRL\r\nFBFBFBBLLR\r\nFBBBFBFRRL\r\nBBFBBBBRRL\r\nBFBBFBFLRL\r\nBFFBBFFLLR\r\nBFBFFBBRLL\r\nFBFFBFFRLR\r\nFBFBFBFLRR\r\nBFBFBBFRRR\r\nFBBBBFBLRL\r\nFFBBBFFRRR\r\nFFBBFFBRLL\r\nFFBBBBBRLL\r\nFBFFFBFRRL\r\nFFFBBBFLRL\r\nBBBFBFFRRR\r\nFFFBFFFRRR\r\nFBFFBFFLLL\r\nFFBBFFBRRL\r\nBFFBFFBRRL\r\nFFBBBFFRLR\r\nBBBFFFFRRR\r\nBBFBFBBRRR\r\nFBFBBBBLRR\r\nBFBFBFBLLL\r\nFFBBFFBLLR\r\nBFFFBBBRLR\r\nBFBBFBBRLR\r\nBFFFFBBLLR\r\nFBFBFBBRLR\r\nBFFBBBFLLR\r\nFBFFBFBLRL\r\nBFBFBBBRLL\r\nBFBBBFFLRL\r\nFFFBFFFLRR\r\nBFFBBFBRLL\r\nFFBBBBFRLL\r\nBBFFFBBLLR\r\nFBFBFBFRLR\r\nBBBFFFBRLR\r\nBFFFFFBRLR\r\nBBBFFFFLLL\r\nFFFBBFBRLL\r\nBFFFFFBRRL\r\nFBFFBBBRRL\r\nFBFBFBBLLL\r\nFBFBBFBRRL\r\nFBBFBBBRRR\r\nBFBFFBBRRL\r\nFBBBBFBLLL\r\nFBBBBBBRLR\r\nBBFFFBFRRL\r\nFFFFBFBLLL\r\nFFFFBBFLRR\r\nFFFFBFFLRL\r\nBFFFBBFRLL\r\nBBFFFFBRRR\r\nBFBFFFFRLL\r\nBFFFFBFLLR\r\nBBBFFBBRRL\r\nBBFBBFBLLR\r\nBFFFFBFRLR\r\nFBBBFBFLLR\r\nFFFFFBBLRR\r\nBFBFFFFLRR\r\nFBFBBFFLRL\r\nFBFFFBBRRR\r\nBBFBBBFLRL\r\nBFBBBFFLLR\r\nBFBFBBFRRL\r\nFBFFFFBLRL\r\nFBBFBFFRLR\r\nBFBFBBBLRR\r\nBFBFBBFLRL\r\nBBFFBFFRLL\r\nFBFFBBBLRL\r\nBFBFBFFLLR\r\nFFFBFFBLLR\r\nFFFBFBBRRR\r\nBBFBFFFLLR\r\nFBBBFBFRLR\r\nFBFFBBBLLL\r\nFFBFBBFLRR\r\nFBFBFFFLLL\r\nBBFFFFFLRL\r\nFBFBBFBLRL\r\nBBFFFBFLLR\r\nBBFBBBBRRR\r\nBFBBBFFRRR\r\nFFFBFFBRLL\r\nFBBBFFFRLR\r\nBBBFBFBLRL\r\nFBFFFFBRLR\r\nBFFFFFBLLL\r\nFBFFFFBLLR\r\nBFBBFFBLRR\r\nBFBFBBBRRR\r\nBBBFBFBRRR\r\nFFFBBFFRRR\r\nFBBBFFFLRR\r\nBBFBFFFRRL\r\nBFBFBBFRLR\r\nBFFFBFBRLL\r\nFBFFFFFLLL\r\nFFFBBBBLRL\r\nFFFBBFFLLL\r\nFBFFFFBRRR\r\nFFBFBFBRLR\r\nBFBFFFBLRR\r\nBFFFBFBLLL\r\nFBBFBFFRLL\r\nFBFBFFFRLL\r\nFBBBFFBRRR\r\nFBBBFFBRLL\r\nFFBBFBBLLL\r\nFBBBBFBRRR\r\nBFBBBFBLLR\r\nFBBBBBFLLR\r\nFFBBFBFLRR\r\nBFFBBFBLLR\r\nFBFFFFBLRR\r\nBFFBFFFRRR\r\nBFFFBBBRLL\r\nFBFBBBFRLL\r\nBFBBBFBRRL\r\nFFBFFFBRRL\r\nFBBFFFFRLR\r\nBFBFBFFLLL\r\nFFBFBFBLLL\r\nFBFBBFBRLL\r\nFBFBFFBRLR\r\nBFFFFFBLRR\r\nFBBBFFBRLR\r\nBFBBFBBLLL\r\nBBFFBFBRRR\r\nFFFBFBBRRL\r\nFFBBBFFRLL\r\nBFFFFFFRLL\r\nBFBFFFBRLL\r\nFFFFFBFRLL\r\nBBBFFFBRRL\r\nFFBBBBFRRL\r\nBFFFBBBLRL\r\nFFFFFBBLLR\r\nBFFFFBBLRR\r\nBFBFFFBLLL\r\nFFFFFBBRLR\r\nBBFBFBFLLL\r\nFBFBBBBRLR\r\nFBBFBFBRRL\r\nFFBFBFBRRR\r\nFBBBBBFLRL\r\nBBFBFFBLLL\r\nBBFFFFBRLL\r\nBBBFBFBRLR\r\nBBFBFBBLLL\r\nBFBBBBBLRR\r\nBBFFFBFRRR\r\nFFFBFBFRLL\r\nBFFBBFBLLL\r\nFBFFBBBRRR\r\nFFFBFBFLLL\r\nBBFFBBFLRL\r\nBBFFFFBRLR\r\nBFBFBBBRLR\r\nBBBFBFFLLR\r\nFFBBBBFRLR\r\nBBFFBFFRRL\r\nBBFBFFBRRR\r\nBFBFFBFLLR\r\nFBFFBBFRLL\r\nBBFFFFBLLR\r\nFBFBFFFRLR\r\nFFBFBFBLLR\r\nBFBBFFBRRL\r\nFBBFFBBRRL\r\nBBFFBFBRLR\r\nFFFFBFBLRR\r\nFFFFBBBLRR\r\nFFBFBFFLLL\r\nFFBBBFFRRL\r\nBBFFFBFRLL\r\nFBFBBBFLRR\r\nFBBFBFFRRR\r\nFBBFBFFLLR\r\nBFFBBBFLRR\r\nFBBFBBFRLR\r\nBFFBBBFLLL\r\nBBFBBFBRLL\r\nBBBFFBBLLR\r\nBBBFBFBRRL\r\nFBFBBBFRRL\r\nFBBFFFBRLR\r\nBFBBFBBLRL\r\nFFBBFFFRRR\r\nBFBFFFFRLR\r\nBBFFFFFLLR\r\nBBFBFFBRLR\r\nBBFBFBFLRL\r\nFBFFFFFLRL\r\nFFBBBFFLRL\r\nFBFBFBBLRR\r\nFFBFBBBRLL\r\nFFBFBFFRLR\r\nFBBBFBFLRR\r\nFBFFBFFLRR\r\nBBFFBFBRRL\r\nFBBFFFFLRL\r\nFFFFBBFLRL\r\nFFBBFFBLRR\r\nBFBFFFBLLR\r\nBFBFBBFLRR\r\nBFBFBFBLLR\r\nBFBBFBFRLL\r\nBFBBFFBRLR\r\nFBFFFBBLLL\r\nFFFBBBBRRL\r\nFBBFBFFLLL\r\nFBFFBFBRLL\r\nBFFBFFFRRL\r\nFBFBFFBLLR\r\nBBFFBBFLLL\r\nFFBBBFBLLR\r\nBFBBFFFLLR\r\nFBBBFBFRRR\r\nFBBBFFBRRL\r\nFFFFBBFRRR\r\nFFBFFFFLRL\r\nFBBFBBFLRR\r\nFFBBBFBLLL\r\nFBFFFBFRLR\r\nFFBFFBBRRL\r\nFFFFBBFRRL\r\nBBBFFFFLRL\r\nFBBFFFBLRL\r\nFFBFBFBLRR\r\nFFFFBFFRRR\r\nFFFBFBFRRR\r\nBBFBBBBLLL\r\nFFBBFFBRRR\r\nFBBFFBBLRR\r\nFBBFBBFLLL\r\nBBFBBBFRRL\r\nFFFBBBBLLR\r\nFFBFFBBLRR\r\nBBFBBFFRLL\r\nBFBBBBFRLL\r\nBBFBFFBRRL\r\nBFFFBBFRRL\r\nFBBBBBBLLL\r\nFFBBFFBLLL\r\nFFBBFBBLRR\r\nBFBFBFBLRR\r\nFBBBFBBLLR\r\nBBFBFBFRLL\r\nFBBFBFFLRR\r\nFBBBFBFLLL\r\nFFBBFFFLRR\r\nBFFBBBFRLL\r\nFBBBBFBLLR\r\nBFBFFFFLRL\r\nFFBFBBBLLL\r\nFFBFFFBLRR\r\nBFBFBFBRLL\r\nFBFBFBFRLL\r\nBFBBBBBLLL\r\nFFBFBFBRLL\r\nBFBFFFFLLR\r\nBFFBBBBLLL\r\nFFBBFBBRLL\r\nFFFFBFBRLR\r\nFBFBBFFLLR\r\nBFBFBBFRLL\r\nFFBFFFFLLL\r\nFBBFFBFLRR\r\nFFBFFFBRLL\r\nFFFFBBBLLR\r\nBFBBBBBRLL\r\nFBBFBBBLRL\r\nFBFFBBBRLL\r\nFBFFFBBLLR\r\nFFBBBFBLRL\r\nFFFFBFFRLL\r\nBBFFFBBLRL\r\nBFFFBFFRRL\r\nBFFBFBFLLL\r\nBBFFFBFLLL\r\nFFFFFBFLRL\r\nFBBFFFFRRR\r\nFBBBBBFLRR\r\nFFBFFFBRLR\r\nFBBBFFFLLL\r\nFFBFBBBLRL\r\nFFBFFFBLLL\r\nFBFFBBBLLR\r\nBBBFBFFRLR\r\nFFFBFFFRLR\r\nBBFBBBFLLR\r\nFFBBFFFRLR\r\nFFFFFBFRLR\r\nFBBFFFBRRL\r\nBFFBBBBRLR\r\nBFFBFFBRLL\r\nBFBBBFBRLL\r\nFBFFBBFRRR\r\nFBFBBFFLLL\r\nBBFBFBBLRL\r\nBBBFBBFLRL\r\nFBFBFFBLRR\r\nFBFFFFFRLL\r\nBFBBFBFRRR\r\nBFBFBBBLLL\r\nFFBBBFFLRR\r\nBFBBFBBLLR\r\nFBBBBFFRRR\r\nBFFFBFFLRL\r\nFFFFBFBRLL\r\nBFFFFBBLLL\r\nBFFBFBBLLL\r\nBFFBFBBRRL\r\nBBBFFFBLRL\r\nBBBFFFBRRR\r\nBFFFBBFLRR\r\nFFBBFBFRLL\r\nBFFBBFBRLR\r\nFFBFFBFLLR\r\nFBFBBBBLRL\r\nBFFBBFFRRL\r\nBBFFFBBRRR\r\nFBBBFBBRRR\r\nBFFFFBFRRL\r\nFFBFBBBRRL\r\nBFFFBBBRRR\r\nBFBBBFBRRR\r\nBFBFBFFRLR\r\nFFFFFBBRRR\r\nFBFBFBFLRL\r\nFFBBBBBLRR\r\nBBFFFFBLRL\r\nFFFBFFFLLR\r\nFFFBFFFRRL\r\nFBBBFBBLRL\r\nBBFFBBFLLR\r\nBBFFBFFLRR\r\nBFFFFFFRLR\r\nFBBFBBFRLL\r\nBFBBBBFRRR\r\nFBFBBBBLLR\r\nFFFBBFFRLR\r\nFBBFBBBRLR\r\nFBBFBFBRLR\r\nFBBBFFFLRL\r\nFFBBFBBRLR\r\nBFFFBBBLLL\r\nBBFBBFFRRR\r\nFBFBFFFLRR\r\nBBFFBBFRRR\r\nFBBFBFFRRL\r\nBFFFFBFLLL\r\nBBBFFBBLLL\r\nBFBBBBFRRL\r\nFBBFFFBRRR\r\nBFBBBBFLLL\r\nFFFBFFBRRL\r\nBFFBFFBLLR\r\nFFBBFBFRRL\r\nFBFFFBBRLR\r\nBFFFBBBLRR\r\nFFBFBFFRRR\r\nFBFBFFBRLL\r\nBFBBBBFLRL\r\nBFBBFFFRRR\r\nFBFBFBFRRL\r\nBBFBBFFLRL\r\nFBBFFFFLLL\r\nBBBFFBBRLL\r\nFBFFFBBRRL\r\nFFBFBFFLRL\r\nFBFFBBFLRL\r\nBFFBFBFLRR\r\nBFFFFBBLRL\r\nBBFBBBBLRL\r\nFFBFBBFRLL\r\nFBFFFBFLLL\r\nBFFBFFBLRL\r\nFBBFFFBLRR\r\nFFFFBFFRRL\r\nFBBFFBFRLR\r\nBFFFBFFRRR\r\nFFFFBFBRRL\r\nBBFFBFBLRL\r\nFBBFBFBRLL\r\nBFBBFFFLRL\r\nFFFBBBFRRR\r\nBFFFFFFLLR\r\nFBFBBFFRRR\r\nBFFFFFBRLL\r\nFFFFBBBRRL\r\nBFFBFBFLLR\r\nFFFFBFFRLR\r\nBFFBBBFRRL\r\nBFBBFBBRLL\r\nFFFFFBFRRL\r\nFFBBBBFLRL\r\nFFBBFBFLLR\r\nBBFFBBBRLL\r\nBFFBFFFLLR\r\nBBFBBBBRLL\r\nBFFBFBBRLR\r\nFFBFBFFRRL\r\nFBBFBBFLRL\r\nFFBFFBBLRL\r\nBFBFFFBRLR\r\nBFFBFFFLRR\r\nBFFBBBBLRL\r\nFFFBFBBRLR\r\nFBBBBBFRRR\r\nBFBFBFFLRL\r\nBFBFFFBLRL\r\nFBBBFBBRLL\r\nFBFBFBFLLL\r\nFBBFFBFRRR\r\nFFFBFBBLRR\r\nFFFBFFFLRL\r\nBFBFBFBRRR\r\nBFFBBFFLLL\r\nBFFBFBBRRR\r\nFFBFFBFRRL\r\nFBFFFBFRLL\r\nFFBFBBFLLL\r\nFFBBFFBLRL\r\nFBFBBBBRRL\r\nBFFBBFBRRL\r\nFBFBFBBLRL\r\nBBFBFBFRLR\r\nFBFFFFFLRR\r\nBBBFFBFRLL\r\nBFBFBFFRLL\r\nFBBFFBBLRL\r\nFBFBFBBRRL\r\nFFBBBBBRLR\r\nFBBFBBFLLR\r\nFFFBFBBRLL\r\nBBFFFFBRRL\r\nBFBFBFBLRL\r\nFBFBBFBLLR\r\nBBBFBFBLRR\r\nFFFFBBFRLL\r\nFFBBBBBRRR\r\nBFBBFFBRRR\r\nBFFFBBBLLR\r\nFBBBBBBRLL\r\nFFBFBBFRLR\r\nBBFFBBFRLL\r\nBFFBFFFLRL\r\nFFBBFFFLLL\r\nBFFBFBBLRL\r\nBBBFFFFRLL\r\nBBFBBBFRRR\r\nFBFFBFFRRR\r\nFBBFFFFRLL\r\nBFFFBBBRRL\r\nFBFBBBFLLL\r\nFFFFBBFLLR\r\nFBBFBBFRRR\r\nBBFFBBBRLR\r\nBBFBBFBLRR\r\nBFFFBFFLLL\r\nBBFBFBFRRR\r\nFFBFFFBLRL\r\nBBFFFBBRLR\r\nFBFBFBBRRR\r\nBFBBFFBLRL\r\nBFFFFBFRLL\r\nBBFBFBBRLL\r\nBFFFFBBRLL\r\nFFFFBFFLLR\r\nFFBBBBFLRR\r\nFBFBFFFRRR\r\nFFFBBFBLLR\r\nFFBBFBFRRR\r\nBFBBFBBRRR\r\nFFBFBBBLLR\r\nFFBFFBFLLL\r\nFFFFBBBLRL\r\nFFBFBFFLLR\r\nBFBBBFFLRR\r\nFBBFFFFLLR\r\nFBFFFFBRRL\r\nBFFBBFFLRR\r\nFFBBFBBRRR\r\nFFFFBFBRRR\r\nBFBBBBFLLR\r\nFBBFFBBRRR\r\nBBFBFBBLRR\r\nFFFBBBBLRR\r\nFBFFFBBLRR\r\nBFFBFBFRLR\r\nBFBFFBFRLR\r\nBFBBFFFRLR\r\nFFBBFFFLLR\r\nFFFFFBFLRR\r\nBFFBBFBLRR\r\nFFFFBBFRLR\r\nBFFFBBFLLR\r\nFBFBFFBRRR\r\nBBFBFBBRRL\r\nFBFBBFFLRR\r\nBFBFFBFLRR\r\nBBFFFBBLRR\r\nFBFFBBFRRL\r\nFBBBBBBLRL\r\nFBBFFBBLLL\r\nBFBFBBBLRL\r\nBBBFFFBLLR\r\nBFFFBFFLRR\r\nBBFFBBFRRL\r\nBFBFBBFLLL\r\nFFBBBFFLLR\r\nBFBBFBFRRL\r\nFBFFBFFRRL\r\nBFFFBFBLRR\r\nBFBBFBBRRL\r\nBBFBFFBLRL\r\nBFFBBBFRRR\r\nFBFBBFBLLL\r\nBBFFBFFRRR\r\nBBFFBFBRLL\r\nBBBFFBFLLR\r\nFFFBBFBLLL\r\nFBBBFFFRRL\r\nBFFBFFBLRR\r\nBBFBFBBLLR\r\nFFBBFBFRLR\r\nBBFFFFFRLR\r\nFBFFBFBLRR\r\nBFFFFFFRRR\r\nFFBBFBFLLL\r\nBFBBFBBLRR\r\nBBFFFBFRLR\r\nBBBFFBFRRR\r\nFFFFBBFLLL\r\nBBFFBFBLRR\r\nBFFBFBBRLL\r\nFBFFFBFLLR\r\nBFFFBBFRRR\r\nFFBFBBFRRL\r\nBFBFFBBLRR\r\nFBBFFBFRRL\r\nFFBBBBBLLR\r\nBFBFFBBLLL\r\nBFBBBBFLRR\r\nFFFFBBBRLR\r\nBFFBBBBLLR\r\nBFFFFFFLRR\r\nBFFFFBBRLR\r\nFFFBBBBRLL\r\nBFBBFFFLRR\r\nBFFBBBFRLR\r\nBFFBBFFRLL\r\nFBFBBBBLLL\r\nBFBFBFBRLR\r\nBBFBBFFLLL\r\nBBFBBBBLRR\r\nFFBBFBBLLR\r\nFBBFFFBRLL\r\nFBBBBFFRRL\r\nFFFBBFBLRR\r\nFFFBFBBLLR\r\nFFFFFBBRRL\r\nFBFBBBFRRR\r\nBBFFFBFLRL\r\nFBFBFFBLLL\r\nFBFBFFFRRL\r\nBFBFFFBRRL\r\nBBFFBFFRLR\r\nBBFFBFBLLR\r\nFFFBFBFLRR\r\nBBFBBBFLLL\r\nBFBBBFFRLL\r\nBFFFBFBRRL\r\nFFFFBFFLLL\r\nFBBBBBFRRL\r\nFBFBFFBLRL\r\nFBBBBBBLRR\r\nFFFBBBBRLR\r\nBFFBFBBLLR\r\nBBFFBBFLRR\r\nBFFFFFBLRL\r\nFFBBBBFLLL\r\nBFFBFBBLRR\r\nFFFBBBFLRR\r\nFFBFBBFLRL\r\nFBBFBFBLRL\r\nBBBFFFFRRL\r\nBBFBFBFLLR\r\nBFBBBFBLLL\r\nFFBFBBBLRR\r\nBFFBFFBRLR\r\nFFFBBBBLLL\r\nBFFFBFFRLR\r\nBFFFBBFLLL\r\nFBBBBFBLRR\r\nFBBFBBBRLL\r\nBFBFFBFRRL\r\nBFFFFBBRRR\r\nBBFFBBBLRL\r\nFBBBBFBRLL\r\nBFBBFFFRRL\r\nBBBFFBFLLL\r\nBFBFFBFRRR\r\nFFBFFBBRRR\r\nFFBFBBBRLR\r\nFBBBBFFLRR\r\nBFBFBFFLRR\r\nBFBBBBFRLR\r\nFFFFFBFRRR\r\nBFFBBFBRRR\r\nBFBBBBBRRL\r\nBFFBBFBLRL\r\nFFFBFBBLRL\r\nFFFBFBBLLL\r\nFFBBFBBLRL\r\nBBBFFFFLRR\r\nFFFFFBBLRL\r\nFBFFBFBLLR\r\nFBFBBBBRLL\r\nBFFBFBFRLL\r\nBFFFBFFRLL\r\nBFFFBFBRRR\r\nBBBFBFFLRL\r\nBFFBFFFLLL\r\nBBFFFFFRRL\r\nFBFBFFFLLR\r\nFFBFFBBLLL\r\nBBFFBFFLRL\r\nBBFFBBBLLL\r\nFFFFFBBLLL\r\nBFBBFFBLLL\r\nFFFBFFBRLR\r\nFBBFFBBRLL\r\nFBFBFBBRLL\r\nBFFBBBFLRL\r\nFFFBFFBLRR\r\nFBFBBFFRLR\r\nFFFBBFFLLR\r\nFBFBBBFLLR\r\nFBBFFFFRRL\r\nBBFBBBFLRR\r\nBFBBFBFRLR\r\nFFBFFFBLLR\r\nFFBFFBFLRL\r\nBBFFBBBRRR\r\nBBFFFFFLRR\r\nFBFFBFBRRL\r\nFBFFBFFLLR\r\nFBBBFFBLLL\r\nFBBBFFBLRR\r\nBFBBBBBRRR\r\nBBBFFFBRLL\r\nFBFFFFFRRR\r\nBBFBBFFRLR\r\nBBFFBBBLLR\r\nBBBFFBFLRL\r\nBBFFFBFLRR\r\nFFFBFFFLLL\r\nFFBFBBFLLR\r\nBBFFFFFRLL\r\nBBFBBFFRRL\r\nFBBFBBBLLL\r\nFFFBFFBRRR\r\nFBBBBFFLLL\r\nFFFBBFFLRR\r\nBBFFBBBRRL\r\nFFBBBFFLLL\r\nFBBBFBFLRL\r\nBBFBFFFLRL\r\nFFBFFFFRLL\r\nFFFBBBFRLL\r\nFBBBBBFLLL\r\nBFBFFFFLLL"
    val listOfBoardingPasses = input.split("\r\n").toList()
    println(findHighestBoardingPass(listOfBoardingPasses)) // answer
}

fun findHighestBoardingPass(boardingPasses: List<String>): Int {
    
    val rows = createListOfRange(0, 127)
    val columns = createListOfRange(0, 7)    
    
    var highestSeatId = 0
    boardingPasses.forEach {
        val rowAssignment = it.substring(0,7)
    	val colAssignment = it.substring(7,10)
        val seatId = getSeatId(myBinarySearch(rowAssignment, rows), myBinarySearch(colAssignment, columns))
        
        if (seatId > highestSeatId) {
			highestSeatId = seatId
        }
    }
    
    return highestSeatId
}

fun getSeatId(rowNumber: Int, colNumber: Int): Int {
    return rowNumber * 8 + colNumber
}

fun myBinarySearch(key: String, list: List<Int>): Int {
    
    var trimmedList = list
    
    key.forEach {
        if (it == 'F' || it == 'L') {
            trimmedList = createListOfRange(trimmedList.first(), trimmedList[(trimmedList.size / 2) - 1])
        } 

        else if (it == 'B' || it == 'R') {
            trimmedList = createListOfRange(trimmedList[trimmedList.size / 2], trimmedList.last())
        }
    }
    
    return trimmedList.first()
}

fun createListOfRange(floor: Int, ceiling: Int): List<Int> {
    val list = mutableListOf<Int>()
    for (i in floor..ceiling) {
        list.add(i)
    }
    return list.toList()
}

fun printList(list: List<Int>) {
	list.forEach {
		print("${it}, ")
    }
    println()
}
