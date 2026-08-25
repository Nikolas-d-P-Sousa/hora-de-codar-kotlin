fun main(){

    val numeros = arrayOf(0,0,0)
    print("Insira um número: ")
    numeros [0] = readln().toInt()
    print("Insira um número: ")
    numeros [1] = readln().toInt()
    print("Insira um número: ")
    numeros [2] = readln().toInt()
    numeros.sortByDescending { it }
    val num1 = numeros[0]
    val num2 = numeros[1]
    val soma = num1 + num2
    print("A soma dos dois maiores número é $soma")

}