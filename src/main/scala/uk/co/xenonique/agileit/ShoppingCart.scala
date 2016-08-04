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
    val list = cartItems.map{
      name => name.toLowerCase() match  {
        case "orange" => Orange()
        case "apple" => Apple()
        case _ => throw new NoSuchElementException("Sorry I don't know this product!")
      }
    }
    new ShoppingCart( list)
  }

}
