import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ShoppingCartTest extends AnyFlatSpec with Matchers {

  "ShoppingCart" should "calculate total cost for apples and oranges" in {
    ShoppingCart.calculateTotalCost(List("Apple", "Apple", "Orange", "Apple")) shouldEqual 2.05
  }

  it should "handle an empty list" in {
    ShoppingCart.calculateTotalCost(List()) shouldEqual 0.00
  }

  it should "handle a list with only apples" in {
    ShoppingCart.calculateTotalCost(List("Apple", "Apple", "Apple")) shouldEqual 1.80
  }

  it should "handle a list with only oranges" in {
    ShoppingCart.calculateTotalCost(List("Orange", "Orange", "Orange")) shouldEqual 0.75
  }

  it should "handle a list with mixed cases" in {
    ShoppingCart.calculateTotalCost(List("apple", "ORANGE", "aPpLe", "OrAnGe")) shouldEqual 2.05
  }
}
