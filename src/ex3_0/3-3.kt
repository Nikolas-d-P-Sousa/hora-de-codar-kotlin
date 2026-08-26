package ex3_0

fun main(){
    var soma: Float = 0.0F
    var contador: Float = 0.0F
    for (i in 15..100){
        soma += i
        contador ++

    }
    soma /= contador
    println("O resultado é $soma")
}