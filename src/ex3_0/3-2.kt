package ex3_0

fun main(){
    var num2: Int
    print("Informe um número: ")
    val num1 = readln().toInt()
    print("Informe um número: ")
    num2 = readln().toInt()
    while (num2 <= 0){
        print ("Número inválido! Informe outro número: ")
        num2 = readln().toInt()
    }
    val resultado = num1/num2
    println ("O resultado é $resultado")
}