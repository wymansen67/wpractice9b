package Customer
open class Customer () {
    var name = "name"
    var bank_account: Double = 0.0
    open var blackListed:Boolean = false

    constructor(_name: String): this() {
        name = _name
    }

    open fun BlackListAdd() {
    }
    open fun BlackListRemove() {
    }

}