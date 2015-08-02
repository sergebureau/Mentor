package com.sergebureau.mentor.candidats

import com.sergebureau._
import com.sergebureau.mentor.questions._

/**
 * Created by sergebureau on 15-08-01.
 */
case class Candidat(nom: String, questions: List[Question], niveaux:List[List[Int]]) {
  def this() = this("",null, null)
}
