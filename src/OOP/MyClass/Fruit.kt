package OOP.MyClass

import java.util.*

// Primary Constructor
class Fruit (size: Int, color: String, taste: String, type: String, origin: String?){
    lateinit var size: String
    lateinit var color: String
    lateinit var taste: String
    lateinit var type: String
    lateinit var origin: String

    //    Secondary Constructor
//    constructor(size: String, color: String, taste: String, type: String, origin: String) {
//        this.size = if (size >= 10.toString()) "Big" else "Small"
//        this.color = color
//        this.taste = taste
//        this.type = type
//        this.origin = origin ?: "-"
//    }

    init {
        this.size = if (size >= 10) "Big" else "Small"
        this.color = color.uppercase()
        this.taste =
            taste.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
        this.type = type
        this.origin = origin ?: "-"
    }
}
