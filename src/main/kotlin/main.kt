fun main(args: Array<String>) {
    val numeri  = intArrayOf(10,15,87,200,231)
    val result = binSearch(numeri,15,0,numeri.size)

    println(result)

}

fun binSearch(array: IntArray,target: Int,inizio : Int,fine: Int) : Int{
    var centro : Int = (fine + inizio) / 2

    if (inizio >= fine){
        return  -1
    }
    if (array[centro] == target){
        return  centro
    }
    if (array[centro] > target){
        return binSearch(array,target,inizio,centro)
    }
    else {
        return  binSearch(array,target,centro +1,fine)
    }

}