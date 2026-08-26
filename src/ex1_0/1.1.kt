package ex1_0

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val nomeDoCarro = "fusca"

    print("Insira seu nome: ")
    val nome = readlnOrNull().orEmpty()
    print("Qual a sua idade ? ")
    val idade = readlnOrNull().orEmpty()
    val nomeCar = nome.length
    println("Olá, ${nome.uppercase()}! Você tem $idade anos e seu nome tem $nomeCar carácteres")
    println("Há um $nomeDoCarro a sua frente. Em sua traseira está escrito 'There is no Hope :)'")



}