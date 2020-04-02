package kotlin_learn

import java.util.concurrent.Executors

/**
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~         
 * Created by gaoyuxiang on 2019-09-06.
 * ==============================
 * 功能描述：
 *
 *
 */
object Utils {

	var time = 100000
	val EXECUTOR_LOAD_ALL_MENU_DATA = Executors.newSingleThreadExecutor()//独立线程，用于加载右边菜单

}