fun main() {
    val cls = Class.forName("java.lang.String")
    val constructors = cls.declaredConstructors
    val ps = System.out
    constructors.mapIndexed { index, constructor ->
        ps.println("생성자 이름 = ${constructor.name}")
        constructor.parameterTypes.mapIndexed { indexJ, clazz ->
            ps.println("매개 변수 #$indexJ $clazz")
        }
        ps.println("-----------------------------------------")
    }
}

/*
생성자 이름 = java.lang.String
매개 변수 #0 class java.lang.StringBuffer
-----------------------------------------
생성자 이름 = java.lang.String
매개 변수 #0 class java.lang.StringBuilder
-----------------------------------------
생성자 이름 = java.lang.String
매개 변수 #0 class [C
매개 변수 #1 int
매개 변수 #2 int
매개 변수 #3 class java.lang.Void
-----------------------------------------
생성자 이름 = java.lang.String
매개 변수 #0 class java.lang.AbstractStringBuilder
매개 변수 #1 class java.lang.Void
-----------------------------------------
생성자 이름 = java.lang.String
매개 변수 #0 class [B
매개 변수 #1 int
매개 변수 #2 int
매개 변수 #3 class java.nio.charset.Charset
-----------------------------------------
생성자 이름 = java.lang.String
매개 변수 #0 class [B
매개 변수 #1 class java.lang.String
-----------------------------------------
생성자 이름 = java.lang.String
매개 변수 #0 class [B
매개 변수 #1 class java.nio.charset.Charset
-----------------------------------------
생성자 이름 = java.lang.String
매개 변수 #0 class [B
매개 변수 #1 int
매개 변수 #2 int
-----------------------------------------
생성자 이름 = java.lang.String
매개 변수 #0 class [B
-----------------------------------------
생성자 이름 = java.lang.String
매개 변수 #0 class [B
매개 변수 #1 byte
-----------------------------------------
생성자 이름 = java.lang.String
매개 변수 #0 class [C
매개 변수 #1 int
매개 변수 #2 int
-----------------------------------------
생성자 이름 = java.lang.String
매개 변수 #0 class [C
-----------------------------------------
생성자 이름 = java.lang.String
매개 변수 #0 class java.lang.String
-----------------------------------------
생성자 이름 = java.lang.String
-----------------------------------------
생성자 이름 = java.lang.String
매개 변수 #0 class [B
매개 변수 #1 int
매개 변수 #2 int
매개 변수 #3 class java.lang.String
-----------------------------------------
생성자 이름 = java.lang.String
매개 변수 #0 class [B
매개 변수 #1 int
-----------------------------------------
생성자 이름 = java.lang.String
매개 변수 #0 class [B
매개 변수 #1 int
매개 변수 #2 int
매개 변수 #3 int
-----------------------------------------
생성자 이름 = java.lang.String
매개 변수 #0 class [I
매개 변수 #1 int
매개 변수 #2 int
-----------------------------------------

Process finished with exit code 0

 */