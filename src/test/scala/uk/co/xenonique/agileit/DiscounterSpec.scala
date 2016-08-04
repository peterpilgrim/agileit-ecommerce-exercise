package uk.co.xenonique.agileit

import org.junit.runner.RunWith
import org.scalatest.{FlatSpec, Matchers}
import org.scalatest.junit.JUnitRunner

import scala.collection.immutable.List

/**
  * The type DiscounterSpec
  *
  * @author Peter Pilgrim (peter)
  */

/**
  * The {@link DiscounterSpec} validates the operation and behaviour of @{link DiscounterSpec}
  */
@RunWith(classOf[JUnitRunner])
class DiscounterSpec extends FlatSpec with Matchers {

  "Discounter" should "buy one get one free on Apples" in {
    new BuyTwoApplesGetOneFreeDiscounter().calculateDiscountPrice( List(Apple(),Apple())) should === (Apple().price)
  }

  "Discounter" should "discount for 3 for the price of 2 on Oranges" in {
    new BuyThreeOrangesForTwoDiscounter().calculateDiscountPrice( List(Orange(),Orange(),Orange())) should === (Orange().price )
  }
}
