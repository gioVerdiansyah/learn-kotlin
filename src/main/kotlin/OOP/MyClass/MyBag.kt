    package OOP.MyClass

    open class MyBag {
    //    Public
        val laptop: String = "Laptop Asus Vivobook"

    //    private
        private val mouse: String = "Mouse Asus"

    //    protected
        protected val keyboard: String = "Gamen Titan Lite"

    //    Internal
        internal val phone: String = "Vivo Y12"

        fun getMouse(): String {
            return mouse
        }
    }