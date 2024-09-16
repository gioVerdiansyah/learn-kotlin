package OOP.MyClass

import kotlin.reflect.KProperty

class DelegationName {
    private var value: String = "Default Value"

    operator fun getValue(classRef: Any?, property: KProperty<*>): String{
        println("From Class $classRef get value from property ${property.name}")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String) {
        println("From Class $classRef set value to $newValue from property ${property.name}")
        value = newValue
    }
}