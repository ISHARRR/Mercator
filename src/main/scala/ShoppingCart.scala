object ShoppingCart {
  private val applePrice: Double = 0.60
  private val orangePrice: Double = 0.25

  def calculateTotalCost(items: List[String]): Double = {
    val appleCount = items.count(_.toLowerCase == "apple")
    val orangeCount = items.count(_.toLowerCase == "orange")

    val totalCost = (appleCount * applePrice) + (orangeCount * orangePrice)
    BigDecimal(totalCost).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
  }
}
