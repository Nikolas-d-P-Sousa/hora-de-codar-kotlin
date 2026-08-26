package ex2_0

fun main(){
    val nums = arrayOf(0,0,0,0,)
    for (i in 1..4){
        print("Insira um número: ")
        nums[i-1] = readln().toInt()

    }
    print("O primerio número é ")
    println(nums[0])
    print("O último número é ")
    println(nums[3])
    nums.sortByDescending { it }
    print("O maior número é ")
    println(nums[0])

}