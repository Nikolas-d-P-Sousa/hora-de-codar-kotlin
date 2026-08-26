package ex2_0
fun main(){
    var nums = intArrayOf()
    var soma = 0
    for (i in 0..5){
        print("Insira um número: ")
        nums = nums.copyOf(nums.size +1)
        nums[i] = readln().toInt()
        if (nums[i] <= 72){
            soma += nums[i]
        }
    }
    print("A soma é $soma! Números maiores que 72 não são somados")

}