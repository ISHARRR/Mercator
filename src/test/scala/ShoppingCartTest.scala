import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ShoppingCartTest extends AnyFlatSpec with Matchers {

  "ShoppingCart" should "calculate total cost for apples and oranges" in {
    ShoppingCart.calculateTotalCost(List("Apple", "Apple", "Orange", "Apple")) shouldEqual 1.45
  }

  it should "handle an empty list" in {
    ShoppingCart.calculateTotalCost(List()) shouldEqual 0.00
  }

  it should "handle a list with only apples" in {
    ShoppingCart.calculateTotalCost(List("Apple", "Apple", "Apple")) shouldEqual 1.20 // Buy one, get one free
  }

  it should "handle a list with only oranges" in {
    ShoppingCart.calculateTotalCost(List("Orange", "Orange", "Orange")) shouldEqual 0.50 // 3 for the price of 2
  }

  it should "handle a list with mixed cases" in {
    ShoppingCart.calculateTotalCost(List("apple", "ORANGE", "aPpLe", "OrAnGe")) shouldEqual 1.10
  }
}
