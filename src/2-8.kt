package ex2_0

fun main(){
    var nota: Double
    var nums = floatArrayOf()
    var media: Double
    for (i in 0..3){
        print("Insira um número: ")
        nums = nums.copyOf(nums.size +1)
        nota = readln().toFloat().toDouble()
        while (nota !in 0.0..10.0) {
            print("Número inválido! Insira outro número: ")
            nota = readln().toFloat().toDouble()
        }
        nums[i] = nota.toFloat()
        }
    media = (nums.sum()/4).toDouble()
    println("A sua média é $media")
    if (media > 5){
        println("Parabéns você passou! ")
    }
    else if (media < 5){
        println("Tente novamente! ")
    }
}