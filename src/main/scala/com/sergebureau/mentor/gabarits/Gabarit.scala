package com.sergebureau.mentor.gabarits

import com.sergebureau._
import com.sergebureau.mentor.questions._

/**
 * Created by sergebureau on 15-08-01.
 */
case class Gabarit(nom: String, questions: List[Question]) {
  def this() = this("",null)
}
