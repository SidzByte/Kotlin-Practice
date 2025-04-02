package practice.sealedClass

sealed class OrderStatus{
    object pending : OrderStatus()
    object inprogress : OrderStatus()
    data class delivered(val deliveredTime: String) : OrderStatus()
    data class canceled(val reason: String) : OrderStatus()
}

fun describeOrder(order : OrderStatus){
    when(order) {
        is OrderStatus.pending -> println("Order has pending status")
        is OrderStatus.inprogress -> println("Your order is on the way!")
        is OrderStatus.delivered -> println("Order has delivered successfully at ${order.deliveredTime}")
        is OrderStatus.canceled -> println("Order canceled : ${order.reason}") //we should not use else in force exhaustive when handling (when we want to check let compiler check all possibilities of cases)
    }
}

fun main(){
    val order1 = OrderStatus.pending
    val order2 = OrderStatus.inprogress
    val order3 =OrderStatus.delivered("10.0 AM")
    val order4 = OrderStatus.canceled("restaurant has closed")

    describeOrder(order1)
    describeOrder(order2)
    describeOrder(order3)
    describeOrder(order4)

}

//Sealed classes force exhaustive when handling, meaning:
//✅ Without else → The compiler forces you to handle all subclasses explicitly.
//✅ With else → The compiler stops checking, and you might miss handling new cases in the future.
//
//💡 Best Practice:
//🚫 Avoid using else unless absolutely necessary.
//✅ Explicitly list all sealed class cases to avoid missing anything.