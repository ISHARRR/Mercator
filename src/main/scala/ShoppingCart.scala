object ShoppingCart {
  private val applePrice: Double = 0.60
  private val orangePrice: Double = 0.25

  def calculateTotalCost(items: List[String]): Double = {
    val appleCount = items.count(_.toLowerCase == "apple")
    val orangeCount = items.count(_.toLowerCase == "orange")

    val appleCost = calculateAppleCost(appleCount)
    val orangeCost = calculateOrangeCost(orangeCount)

    BigDecimal(appleCost + orangeCost).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
  }

  private def calculateAppleCost(appleCount: Int): Double = {
    val applesToPay = (appleCount + 1) / 2 // Buy one, get one free
    applesToPay * applePrice
  }

  private def calculateOrangeCost(orangeCount: Int): Double = {
    val orangesToPay = (2 * (orangeCount / 3)) + (orangeCount % 3)
    orangesToPay * orangePrice
  }
}
