
fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4, 7, 15, 464, 7454, 3)
    val list2 = listOf<Int>()
    showMiddleElement(list)
    println(getMiddleElement(list2))
}

fun showMiddleElement(list: Collection<Any>): String {
    if (list.isEmpty()){
        println("Empty list!")
    } else if (list.size % 2 == 0) {
        println("List size is even, there's no exact 'middle' element")
    }else {
        var middle = list.size / 2
        println("The middle element is: " + list[middle])
    }
}

fun getMiddleElement(list: List<Int>): String {
    val str = if (list.isEmpty()) "Empty list!" else "The middle element is: " + list[list.size / 2]
    return str
}
