package kotlin_learn

import java.io.Serializable

/**
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~         
 * Created by gaoyuxiang on 2019-09-06.
 * ==============================
 * 功能描述：
 *
 *
 */
class Teacher(name: String?, age: Int?, weight: Int?):Cloneable{


	var name: String? = name
	var age: Int? = age
	var weight: Int? = weight





	public override fun clone(): Any {
		return super.clone()
	}

}