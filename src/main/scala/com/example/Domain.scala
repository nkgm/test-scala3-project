package com.example

object Domain {

  object UserId extends NewUUIDType

  case class User(uuid: UserId.Type, name: String)
}
