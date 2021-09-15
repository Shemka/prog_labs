import java.lang.Math.*

fun main(){
    val min_b: Double = -12.0
    val max_b: Double = 2.0

    var a = ShortArray(10)
    var x = FloatArray(10)
    
    var j: Int = 0
    for(i in 5..23 step 2){
        a[j] = i.toShort()
        x[j] = getRandom(min_b, max_b).toFloat()
        j++
    }

    var new_a = Array(10){FloatArray(10)}
    for(i in 0..9){
        for(j in 0..9){
            when(a[i].toInt()){
                13 -> {
                    var c = (atan(pow((x[j].toDouble() - 5.0) / 14.0, 2.0)) - 1)
                    var b = (pow(atan((x[j].toDouble() - 5.0) / 14.0), 2.0 * (1 - exp(x[j].toDouble()))))
                    new_a[i][j] = pow(sin(cbrt(x[j].toDouble())), c / b).toFloat()
                }
                5, 11, 15, 19, 21 -> {
                    new_a[i][j] = pow(2 * cbrt(cos(x[j].toDouble())), 2.0).toFloat()
                }
                else -> {
                    new_a[i][j] = cos(cos(cos(pow((3 - x[j].toDouble()) / 2, x[j].toDouble())))).toFloat()
                }
            }
            print("%.2f \t".format(new_a[i][j]))
        }
        println()
    }
    
}

fun getRandom(min: Double, max:Double): Double{
    return random()*(max - min + 1.0) + min
}