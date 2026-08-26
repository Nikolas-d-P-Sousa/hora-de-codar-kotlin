package ex2_0

fun main(){
    print ("Insira um número: ")
    val num1 = readln().toFloat()
    print ("Insira um número: ")
    val num2 = readln().toFloat()
    if (num1 > num2)
    {
        println("$num1 é maior que $num2")

    }
    else{
        println("$num2 é maior que $num1")
    }
}