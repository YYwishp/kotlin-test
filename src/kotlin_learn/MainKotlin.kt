package kotlin_learn

import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.ObjectInputStream
import java.io.ObjectOutputStream
import java.util.regex.Pattern
import kotlin.concurrent.thread







/**
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~         
 * Created by gaoyuxiang on 2019-09-03.
 * ==============================
 * 功能描述：
 *
 *
 */
class Main {


}




fun main() {
	println("33333334")


	println(3.0.isNaN())
	var split = "1000000000000000254B".split(",")


	println(split)

	if (" d ".isNullOrBlank()) {
		println("null")
	} else {
		println("not--null")
	}
	println("-------------------------------")
	if ("".isNullOrEmpty()) {
		println("null")
	} else {
		println("not--null")
	}

	println("-------------------------------")
	var list = mutableListOf<Teacher>()

	list.add(Teacher("list----teacher", 100, 199))


	var person = Person("aaa", 10, 100, teacher = Teacher("java.Student", 99, 19), list = list,listString = mutableListOf("aaa","bbb"))


	println(person.toString())
	println("${person.hashCode().toString(16)}-----${person}")
	println("${person.teacher.hashCode().toString(16)}-----${person}")
	println("${person.list.hashCode().toString(16)}-----${person}---list,teacherName--${person.list?.get(0)?.name}")




	var clone = person.clone() as Person


	println("${clone.hashCode().toString(16)}-----${clone}")

	clone.list?.get(0)?.name ="qwqwqwqwqw"
	clone.listString?.set(0, "bbbbbbbbbbbbbbbb")



	//person.teacher?.name = "qqqqq"

	println("源体：${person.toString()+ person.list?.get(0)?.name}")
	println("克隆体：${clone.toString()}"+ clone.list?.get(0)?.name)





	println("-------------------------------")







	/*var src = mutableListOf<kotlin.Person>()

	repeat(10) {
		src.add(kotlin.Person("aaa", it, 100, student = java.Student("S$it", it, "address$it")))

	}

	println("==${src.hashCode()}-----${src}")
	println("==${src.hashCode().toString(16)}-----${src}")



	var clone1 = kotlin.deepClone(src)
	println("==${clone1.hashCode()}-----${clone1}")
	println("==${clone1.hashCode().toString(16)}-----${clone1}")

	var clone2 = kotlin.deepClone(src)
	println("==${clone2.hashCode()}-----${clone2}")
	println("==${clone2.hashCode().toString(16)}-----${clone2}")*/


	println("-------------------------------")

	/*Utils.EXECUTOR_LOAD_ALL_MENU_DATA.execute {


	}*/
	/*fun test(num1 : Int, bool : (Int) -> Boolean) : Int{
		return if (bool(num1)){ num1 } else 0
	}

	println(test(10,{it > 5}))
	println(test(4,{it > 5}))

	val map = mapOf("key1" to "value1","key2" to "value2","key3" to "value3")

	map.forEach { key , value ->




	}

	val test3 = fun(x : Int , y : Int) : Int{
		return x + y
	}*/





	//var test1 = test1(1, test3)
	//
	//println("===========$test1")
	//
	//test3(1,1)

	println("-------------------------------")

	//fun aaa(x: Int, y: Int) :Int{
	//	return x+y
	//}

	//var i = test1(3,fun1 = ::invokedMethod)
	//println(i)

	println("-------------------------------")
	//var aaa = test2(23) { x, y ->
	//	2
	//}
	//println(aaa)
	println("-------------------------------")
	//var bbb = test2(23, method = ::invokedMethod )
	////var bbb = test2(23, ::invokedMethod)
	////var bbb = test2(23) {x, y ->
	////	22
	////}
	//println(bbb)
	println("-------------------------------")
	/*var ccc = test3(23, method = {
		//invoke3Method(1)
		1
	})
	var ddd = test3(23, method = {
		invokedMethod(1,2)
	})
	var eee = test3(23, method = ::aaaa)
	//println(ccc)
	//println(ddd)
	println(eee)*/

	println("-------------------------------")
	/*var test4 = test4(1000, method = {
		1
	})

	println(test4(5))
	println(test4)*/

	println("-------------------------------")
	/*var mutableList = mutableListOf<Person>()
	repeat(5){
		mutableList.add(Person("p$it", it, it + 1, Teacher("T$it", it, it + 2)))

	}

	//println("初始化Hashcode==${mutableList.hashCode().toString(16)}")
	println("初始化 Hashcode==${mutableList.hashCode()}")
	println("初始化 第一个对象==${mutableList[0].hashCode()}")


	var cloneList = deepClone(mutableList) as MutableList<Person>
	println("clone 后 Hashcode==${cloneList.hashCode()}")
	println("clone 后 第一个对象==${cloneList[0].hashCode()}")

	//改变克隆数据
	cloneList[0].age = 100

	println("改变之后 克隆 Hashcode==${cloneList.hashCode()}")
	println("改变之后 克隆 第一个对象==${cloneList[0].hashCode()}  age:${cloneList[0].age} ")

	println("改变之后 源 Hashcode==${mutableList.hashCode()}")
	println("改变之后 源 第一个对象==${mutableList[0].hashCode()}  age:${mutableList[0].age}  ")*/



	println("-------------------------------")
	var apple_1 = Apple().also {
		it.IsVoided = false
		it.RecCentralManaged = true
		it.RowTS = "11111"
	}



	var apple_2 = Apple().also {
		it.IsVoided = false
		it.RecCentralManaged = true
		it.RowTS = "22222"
	}

	println("apple_1 hashCode = ${apple_1.hashCode()}   IsVoided =${apple_1.IsVoided.hashCode()}  RecCentralManaged =${apple_1.RecCentralManaged.hashCode()}  RowTS =${apple_1.RowTS.hashCode()}")
	println("apple_2 hashCode = ${apple_2.hashCode()}   IsVoided =${apple_2.IsVoided.hashCode()}  RecCentralManaged =${apple_2.RecCentralManaged.hashCode()}  RowTS =${apple_2.RowTS.hashCode()}")



	println("-------------------------------")
	/*var list1 = mutableListOf<String>("a", "b", "c", "d")

	*//*list1.forEachIndexed { index, s ->
		println("====$s")
		if (s == "b") {
			println("***** $s")
			return@forEachIndexed

		}
	}*//*

	for (index in list1.indices) {
		println("====${list1[index]}")
		if (list1[index] == "b") {
			println("***** ${list1[index]}")
			return

		}
	}*/

	println("------------------------------------------------------------")
	/*var str = "123abc"
	var patt1 = ".*abc.*"
	var matches = Pattern.matches(patt1, str)
	println("是否包含 abc 子字符串 ${matches}")*/


	/*val str = "12a6B985Ccv65"
	val regex = "[a-zA-Z]+"
	val regex2 = "\\d+"

	println(str.replace(Regex(regex),"#"))
	println(str.replace(Regex(regex2), "0"))*/

	val str = "8"


	println(str.matches(Regex("[8-9][0-9]*")))
	println(str.matches(Regex("[1-9][0-9]?")))   //?问号，限定 只有一个或者0个


	println("------------------------------------------------------------")
	var array = arrayOf(arrayOf(1, 2), arrayOf(3, 4))
	var a = array[1][0]
	println(a)

	println("------------------------------------------------------------")
	//===自定义长度 3
	var n = 3
	var m =3
	var array1 = Array(n) {
		Array(m){
			it*2
		}
	}




}
///////////////////////////////////////////////////////////////////////////
// 定义方法
///////////////////////////////////////////////////////////////////////////

fun test1(i: Int, fun1: (x: Int, y: Int) -> Int) :Int{
	return i + fun1.invoke(1, 3)

}

fun invokedMethod(x : Int , y : Int) : Int{
	println("x = $x    y=$y")
	return x + y
}

//fun test2(number: Int, method: (x: Int, y: Int) -> Int): Int {
//	var a = number + method.invoke(100, 100)
//
//	return a
//
//}





fun test3(number: Int, method: (int: Int) -> Int): Int {
	var a = number + method.invoke(111)
	return a

}

fun invoke3Method(int: Int): Int {
	return int
}
fun aaaa(int: Int): Int {
	return int+1000
}





fun test4(number: Int, method: (int: Int) -> Int): (int:Int)->Int{
	var a = number + method.invoke(111)


	var f1 = fun(int:Int):Int{
		return a + int
	}
	return f1
}

fun aaa() {
	thread {

		return@thread
	}

}




public fun deepClone(any: Any): Any {
	val bos = ByteArrayOutputStream()
	val oos = ObjectOutputStream(bos)
	oos.writeObject(any)//写出序列化后的对象
	val bis = ByteArrayInputStream(bos.toByteArray())
	val ois = ObjectInputStream(bis)
	return ois.readObject()//读入反序列化后的对象，并返回
}































