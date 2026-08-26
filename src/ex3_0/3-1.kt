package ex3_0

fun main(){
    print("Informe o tempo de detonação: ")
    var timer = readln().toInt()
    for (i in 0..timer){
        println("$timer!")
        timer--
    }
    println("BOOM!")
}