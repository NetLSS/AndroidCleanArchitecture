import java.lang.reflect.Modifier

fun main() {
    val cls = Class.forName("java.lang.String")
    val methods = cls.declaredMethods
    val ps = System.out

    for (i in methods.indices) {
        val m = methods[i]
        ps.println("이름 = ${m.name}")
        ps.println("제어 = ${Modifier.toString(m.modifiers)}")
        ps.println("메서드가 선언된 클래스 = ${m.declaringClass}")

        m.parameterTypes.mapIndexed { index, clazz ->
            ps.println("매개 변수 #$index $clazz")
        }

        m.exceptionTypes.mapIndexed { index, clazz ->
            ps.println("예외 사항 #$index $clazz")
        }

        ps.println("반환형 = ${m.returnType}")
        ps.println("---------------------------------------")
    }
}