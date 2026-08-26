package ex2_0

fun main(){

    println("Insira um número")
    val num = readln().toInt()
    if (num == 0){
        println("Você inseriu o número $num")
    }
    if (num>0){
        println("$num é um número positivo")
    }
    if (num<0){
        println("$num é um número negativo")
    }

}