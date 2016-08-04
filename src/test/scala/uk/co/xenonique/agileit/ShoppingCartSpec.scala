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

//  "List of cart items" should "be reversible" in {
//    List(Orange(), Apple(), Apple()).reverse should === ( List(Apple(), Apple(), Orange()))
//  }

  "Shopping cart" should "calculate price of items in a list" in {

    new ShoppingCart( List() ).price() should === (1.0)
  }
}





