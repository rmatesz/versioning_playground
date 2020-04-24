package hu.rmatesz.playground.mylibrary

import hu.rmatesz.playground.mylibrarywithprivatepart.InternalAPI
import hu.rmatesz.playground.mylibrarywithprivatepart.PublicAPI

object MyPublicAPI {
    fun publicmethod() {
        PublicAPI.foo()
    }

    fun internalmethod() {
        InternalAPI.foo()
    }
}
