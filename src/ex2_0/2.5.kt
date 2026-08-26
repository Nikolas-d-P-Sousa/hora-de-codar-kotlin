package ex2_0

fun main(){
    val nums = arrayOf(0,0,0,0,0,0)
    var soma = 0
    for (i in 1..6){
        print("Insira um número: ")
        nums[i-1] = readln().toInt()

    }
    soma = nums.sum()
    soma /= 6
    println("Os valores inseridos foram; ")
    for (i in 1..6){
        print("-  ")
        println(nums[i-1])
    }
    print("A média é $soma")
}