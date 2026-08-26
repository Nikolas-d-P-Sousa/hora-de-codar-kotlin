package ex2_0

fun main(){

    val numeros = arrayOf(0,0,0)
    print("Insira um número: ")
    numeros [0] = readln().toInt()
    print("Insira um número: ")
    numeros [1] = readln().toInt()
    print("Insira um número: ")
    numeros [2] = readln().toInt()
    numeros.sortByDescending { it }
    val soma = numeros[0] + numeros[1]
    println("A soma dos dois maiores número é $soma")
    print ("O menor número é: ")
    println (numeros[2])


}