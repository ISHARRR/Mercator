import scala.io.StdIn

object Main {
  def main(args: Array[String]): Unit = {
    println("Welcome to the Mercator Shop")
    println("Enter the items separated by spaces (e.g., 'Apple Apple Orange Apple'):")
    val inputItems = StdIn.readLine().split(" ").toList
    val totalCost = ShoppingCart.calculateTotalCost(inputItems)
    println(f"Total cost: £$totalCost%.2f")
  }
}
