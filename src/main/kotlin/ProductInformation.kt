package ProductInformation
open class ProductInformation(_productName:String) {
    open var productName:String = _productName
    open var productPrice:Float = 0.0F
    open var productCount:Byte = 0

    constructor(_productName:String, _productPrice:Float): this(_productName){
        productPrice = _productPrice
    }
    constructor(_productName:String, _productPrice:Float, _productCount:Byte): this(_productName, _productPrice){
        productCount = _productCount
    }

    open fun Name(){
        println("Преобрести товар: $productName")
    }
    open fun Sales(){
        println("Товар продаётся по цене: $productPrice")
    }
    open fun Count(){
        println("Количество товара в наличии: $productCount")
    }

}