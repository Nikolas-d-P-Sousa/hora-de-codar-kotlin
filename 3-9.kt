package ex3_0

fun main(){
    var div24: Int = 0
    var div42: Int = 0
    var divZero: Int = 0
    for (i in 1..10){
        print ("Informe um número: ")
        var num = readln().toInt()
        if (num%24 == 0){
            div24++
        }
        else if (num%42 == 0){
            div42++
        }
        else{
            divZero++
        }
    }
    println("$div24 números são divisíveis por 24")
    println("$div42 números são divisíveis por 42")
    println("$divZero números não são divisíveis por 24 nem 42")


}