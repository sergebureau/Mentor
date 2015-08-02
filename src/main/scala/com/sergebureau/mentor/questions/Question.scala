package com.sergebureau.mentor.questions

/**
 * Created by sergebureau on 15-08-01.
 */
case class Question(laQuestion: String, domaines: String, suggestion: Option[String]) {
  def this() = this("","",Some(""))
}
