package kotlin_learn

import java.Student
import java.io.Serializable

/**
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~         
 * Created by gaoyuxiang on 2019-09-05.
 * ==============================
 * 功能描述：
 *
 *
 */
class Person(name: String?, age: Int?, weight: Int?,teacher: Teacher?,list: MutableList<Teacher>?,listString:MutableList<String>? ) :Cloneable{
	var name: String? = name




	var age: Int? = age
	var weight: Int? = weight


	var teacher: Teacher? = teacher
		set(value) {
		field = value
		weight = age?.plus(10)
		name = "Name:"+weight
	}





	var list: MutableList<Teacher>? = list
	var listString: MutableList<String>? = listString


	public override fun clone(): Any {
		return try {
			var person = super.clone() as Person
			var teacher1 = this.teacher?.clone() as Teacher


			var temp = Person(person.name, person.age, person.weight, null, null,null)

			person.teacher = teacher1

			person.name = temp.name
			person.age = temp.age
			person.weight = temp.weight



			var mutableList = mutableListOf<Teacher>()

			this.list?.forEach {
				mutableList.add(it.clone() as Teacher)
			}

			person.list = mutableList



			var listString = mutableListOf<String>()

			//this.listString?.forEach {
			//	listString.add(it)
			//}
			this.listString?.let { listString.addAll(it) }

			person.listString = listString









			return person
		} catch (e: CloneNotSupportedException) {
			e.printStackTrace()
		}

	}

	override fun toString(): String {
		return "Person(name=$name, age=$age, weight=$weight, teacher=$teacher, list=$list, listString=$listString)"
	}
}

