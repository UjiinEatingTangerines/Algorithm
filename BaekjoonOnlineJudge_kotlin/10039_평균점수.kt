
import java.util.*

fun main() {
    val sc: Scanner = Scanner(System.`in`)

    var result: Int = 0

    for (i: Int in 1..5){
        var score: Int = sc.nextInt()

        if(score <40) score = 40
        result += score
    }

    println(result/5)

}