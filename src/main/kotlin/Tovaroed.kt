import Customer.*
class Tovaroed (): Customer() {
    var tovaroed = "Undefined"

    constructor(_tovaroved: String): this() {
        tovaroed = _tovaroved
    }
    override fun BlackListAdd() {
        blackListed = true
    }
    override fun BlackListRemove() {
        blackListed = false
    }
}