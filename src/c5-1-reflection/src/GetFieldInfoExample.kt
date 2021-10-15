import java.lang.reflect.Modifier

fun main() {
    val cls = Class.forName("java.lang.String")
    val fields = cls.declaredFields
    val ps = System.out

    fields.mapIndexed { index, field ->
        ps.println("이름 = ${field.name}")
        ps.println("타입 = ${field.type}")
        val mod = field.modifiers
        ps.println("제어자 = ${Modifier.toString(mod)}")
        ps.println("--------------------------------------------")
    }
}