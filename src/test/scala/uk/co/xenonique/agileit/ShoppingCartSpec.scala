package uk.co.xenonique.agileit

import org.junit.runner.RunWith
import org.scalatest.{FlatSpec, Matchers}
import org.scalatest.junit.JUnitRunner

import scala.collection.immutable.List

/**
  * The type ShoppingCart
  *
  * The @{link ShoppingCartSpec} validates the operation and behaviour of @{link ShoppingCart}
  * @author Peter Pilgrim (peter)
  *
  */
@RunWith(classOf[JUnitRunner])
class ShoppingCartSpec extends FlatSpec with Matchers {

  "Shopping cart" should "calculate price of items in a list" in {
    new ShoppingCart( List() ).price() should === (0.0)
    new ShoppingCart( List( Orange()) ).price() should === (0.60)
    new ShoppingCart( List( Apple()) ).price() should === (0.25)
    new ShoppingCart( List( Orange(), Orange(), Apple()) ).price() should === (1.45)
    new ShoppingCart( List( Orange(), Apple(), Orange()) ).price() should === (1.45)
    new ShoppingCart( List( Apple(), Orange(), Orange(), Apple()) ).price() should === (1.70)
  }

  "Shopping cart" should "take a list of items as String text input" in {
    val cart1 = ShoppingCart.convert( List("Apple","orange","apple"))
    cart1.items should === (List(Apple(), Orange(), Apple()))

    val cart2 = ShoppingCart.convert( List("orange","APPLE","Orange"))
    cart2.items should === (List(Orange(), Apple(), Orange()))

    val cart3 = ShoppingCart.convert( List())
    cart3.items should === (List())
  }

  "Shopping cart" should "barf with unrecognisable input" in {

    assertThrows[NoSuchElementException] {
      ShoppingCart.convert( List("Apple","DOG","CAT"))
    }

  }

}





