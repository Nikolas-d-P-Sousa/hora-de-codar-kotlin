package ex3_0

fun main(){
    print("Insira um número: ")
    val num1: Int = readln().toInt()
    print("Insiram um número: ")
    var num2: Int = readln().toInt()
    while (num2 < num1 ){
        println("Número inválido! O segundo número deve ser maior que o primeiro")
        print("Insira um número: ")
        num2 = readln().toInt()
    }
    var soma: Float = 0.0F
    var contador: Float = 0.0F
    for (i in num1..num2){
        soma += i
        contador ++

    }
    soma /= contador
    println("O resultado é $soma")
}