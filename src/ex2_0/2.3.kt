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

    print("O maior número é ")
    print(numeros[0])
    print("O menor número é ")
    print(numeros[2])


}