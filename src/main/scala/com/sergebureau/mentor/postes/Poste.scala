package com.sergebureau.mentor.postes

import com.sergebureau._
import com.sergebureau.mentor.gabarits._

/**
 * Created by sergebureau on 15-08-01.
 */
case class Poste(nom: String, gabaritDeBase: Gabarit, poids:List[List[Int]]) {
  def this() = this("",null,null)
}
