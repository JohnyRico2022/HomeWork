fun main() {

    val amount = 1000
    val FeeMinimum = 35

    val CardFee = (amount / 100) * 0.75

    val result = if (CardFee < FeeMinimum) FeeMinimum else CardFee

    println(" Вы отправляете: $amount руб.")
    println(" Комиссия за перевод: $result руб.")
}