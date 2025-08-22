package test

fun main(args: Array<String>) {
    //사용
    val user1 = User("Mario",20)
    val user2 = User("Luigi",20)

    //copy()
    val user3 = user1.copy() // User("Mario",20)
    val user4 = user1.copy(age = 25) // User("Mario",25)

    //자동생성된 equals()로 비교
    println("user1 == user2 : ${user1==user2}") //프로퍼티가 다름, false
    println("user1 == user3 : ${user1==user3}") //프로퍼티가 같음, true
    
    //참조 비교
    println("user1 === user3 : ${user1===user3}") //서로 다른 객체임, false
    
    //toString()
    println("user1 : $user1") // User(name=Mario, age=20)
    
    //hashCode()
    println("user1.hashCode() == user3.hashCode() : ${user1.hashCode()==user3.hashCode()}") //프로퍼티가 같으므로 해시도 같음, true
    println("user1.hashCode() == user4.hashCode() : ${user2.hashCode()==user4.hashCode()}") //프로퍼티가 다르므로 해시도 다름, false
    
    //componentN()
    println("user1.component1() : ${user1.component1()}") //Mario
    println("user1.component2() : ${user1.component2()}") //20
    
    //구조 분해 선언
    val (name, age) = user1 //내부적으로 componentN 호출
    println("$name, $age") //Mario, 20
}