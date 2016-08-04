package uk.co.xenonique.agileit

/**
  * The type ShoppingCart
  *
  * @author Peter Pilgrim (peter)
  */

class ShoppingCart(val items: List[CartItem] ) {


  def price(): BigDecimal = items.map(x => x.price).sum;

}

object ShoppingCart {
  // Convert strings to Scala case classes
  def convert(cartItems: List[String]): ShoppingCart =  {
    new ShoppingCart( List())
  }

}