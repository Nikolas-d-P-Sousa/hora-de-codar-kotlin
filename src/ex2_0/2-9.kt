package ex2_0

fun main(){
    print("Informe a seu ano de nascimento: ")
    val idade = 2026 - (readln().toInt())
    println ("Você tem $idade anos")
    if (idade >= 16){
        println("Você já pode votar!")
    }
    else{
        println("Você ainda não pode votar.")
    }
}