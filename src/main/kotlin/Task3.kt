fun main() {
    val amount = 1500
    val customer = true

    val discount: Int = if (amount in 1001..9999) {
        (amount - 100)
    } else if (amount > 10_000) {
        (amount - (amount * 0.05)).toInt()
    } else amount

    val discountCustomer = if (customer) discount - (discount * 0.01).toInt() else discount

    println("Стоимость покупки $discountCustomer руб.")
    if (customer) println("Была применена скидка постоянного покупателя!")
}

