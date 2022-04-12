
import java.util.*
import kotlin.collections.HashMap

fun main() {
    val sc: Scanner = Scanner(System.`in`)
    var n: Int = sc.nextInt()

    var count: Int = 0
    var hashMap = HashMap<Int,Any>()

    for(i: Int in 1..n){
        var nowNumber: Int = sc.next().toInt()
        if(hashMap.get(nowNumber) != null){
            count++
        }else{
            hashMap.put(nowNumber, "true")
        }
    }

    print(count)
}