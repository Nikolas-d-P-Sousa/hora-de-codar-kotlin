package ex3_0

fun main(){
    var num: Int
    var nums = intArrayOf()
    var soma = 0
    for (i in 0..5){
        nums = nums.copyOf(nums.size +1)
        print("Insira um número: ")
        num = readln().toInt()
        while (num !in 0..10){
            print("Número inválido! Insira outro número: ")
            num = readln().toInt()
        }
        nums[i] = num

    }
    soma = nums.sum() / 6
    print("Sua media é $soma! ")

}