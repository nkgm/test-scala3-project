package com.example

import java.util.UUID

trait NewUUIDType {
  opaque type Type = UUID

  def apply(id: UUID): Type = id

  extension (t: Type) inline def value: UUID = t
}

