package hu.rmatesz.playground.mylibrarywithprivatepart

object InternalAPI {
    fun foo() {
        android.util.Log.d("internal", "test")
    }
}
