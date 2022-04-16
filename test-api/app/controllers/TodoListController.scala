package controllers

import play.api.mvc.{BaseController, Action, AnyContent}

import javax.inject._

@Singleton
abstract class TodoListController  @Inject()(val controller: HomeController)
extends BaseController{
  def getAll(): Action[AnyContent] = Action{
    NoContent
  }
}