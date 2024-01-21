fun main() {
    print("Nhập số a: ")
    val a = readLine()!!.toInt()
    print("Nhập số b: ")
    val b = readLine()!!.toInt()
    if (a % 2 == 0) {
        println("$a là số chẵn")
    } else {
        println("$a là số lẻ")
    }
    if (b % 2 == 0) {
        println("$b là số chẵn")
    } else {
        println("$b là số lẻ")
    }
}