package kotlin_learn

import java.util.regex.Pattern

/**
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~         
 * Created by gaoyuxiang on 2020-02-14.
 * ==============================
 * 功能描述：
 *
 *
 */
class RegularExpression {


}

fun main() {
	println("---------------正则表达式----------------")
	/*val str = "12a6B985Ccv65"
	val regex = "[a-zA-Z]+"
	val regex2 = "\\d+"

	println(str.replace(Regex(regex),"#"))
	println(str.replace(Regex(regex2), "0"))*/

	val str = "833"


	println(str.matches(Regex("[8-9][0-9]*")))   //*，表示*号之前的表达式 0个 或 多个 ，这里表示[0-9] 0到9可以有多个
	println(str.matches(Regex("[1-9][0-9]?")))   //?，表示？号之前的表达式 只有一个或者0个，这里表示 [0-9] 0到9要么有，要么没有

	println(str.matches(Regex("[0-9]{1,2}")))   // 表示 [0-9] 0到9 只能有1到2次 等价于 “[1-9][0-9]{0,1}”
	/**
	 *    *、+ 限定符都是贪婪的，因为它们会尽可能多的匹配文字，只有在它们的后面加上一个? 就可以实现非贪婪或最小匹配。
	 */
	println("<h1>RUNOOB-菜鸟教程</h1>".matches(Regex("<.*>")))  //匹配从 小于符号开始< 到 大于符号>  之间的所有内容  ，匹配整个字符串
	println("<h1>RUNOOB-菜鸟教程</h1>".replace(Regex("<.*>"),"#"))


	println("<h1>RUNOOB-菜鸟教程</h1>".replace(Regex("<.*?>"),"#"))  //通过在 *、+ 或 ? 限定符之后放置 ?，该表达式从"贪婪"表达式转换为"非贪婪"表达式或者最小匹配。最小匹配 <h1>


	/**
	 * 若要在搜索章节标题时使用定位点，下面的正则表达式匹配一个章节标题，该标题只包含两个尾随数字，并且出现在行首：
	 */
	println("Chapter 10".matches(Regex("^Chapter [1-9][0-9]{0,1}")))
	println("Chapter 10 111".replace(Regex("^Chapter [1-9][0-9]{0,1}"),"#"))






	/**
	 * 真正的章节标题不仅出现行的开始处，而且它还是该行中仅有的文本。它即出现在行首又出现在同一行的结尾。
	 * 下面的表达式能确保指定的匹配只匹配章节而不匹配交叉引用。通过创建只匹配一行文本的开始和结尾的正则表达式，就可做到这一点。
	 */

	println("Chapter 10".matches(Regex("^Chapter [1-9][0-9]{0,1}$")))
	println("Chapter 10".replace(Regex("^Chapter [1-9][0-9]{0,1}$"),"#"))
	println("Chapter 10 发发发".replace(Regex("^Chapter [1-9][0-9]{0,1}$"),"#"))

	/**
	 * 匹配单词边界稍有不同，但向正则表达式添加了很重要的能力。
	 * 单词边界是单词和空格之间的位置。非单词边界是任何其他位置。下面的表达式匹配单词 Chapter 的开头三个字符，因为这三个字符出现在单词边界后面：也即是开头的后面
	 *
	 */
	println("Cha aaa".matches(Regex("\\bCha")))
	println("Cha aaa Cha".replace(Regex("\\b"),"#"))            //#Cha# #aaa# #Cha#
	println("Cha aaa Cha".replace(Regex("\\bCha"),"#"))         //# aaa #
	println("Chsa aaa Chsa".replace(Regex("\\bCh.*a\\b"),"#"))  //#
	println("Chsa aaa Chsa".replace(Regex(".*s"),"#"))          //#a
	/**
	 *   \b 字符的位置是非常重要的。如果它位于要匹配的字符串的开始，它在单词的开始处查找匹配项。
	 *   如果它位于字符串的结尾，它在单词的结尾处查找匹配项。例如，下面的表达式匹配单词 Chsa 中的字符串 a，因为它出现在单词边界的前面：
	 */

	println("Chsa aaa Chsa".replace(Regex("\\bCh|a\\b"),"#"))   //#s# aa# #s#
	println(" 2 2".replace(Regex("\\b2"),"#"))                  // # #





	println("ChApter".replace(Regex("\\Baptg"),"#"))             //Ch#er
	println("aptitude".replace(Regex("\\Bapt"),"#"))            //aptitude
	println("123456我是JAVA{，、；‘asd".replace(Regex("\\B"),"#"))            //1#2#3#4#5#6#我#是#J#A#V#A{#，#、#；#‘a#s#d



	println("---------------反向引用----------------")



	//var patt1 = "\\b([a-z]+)\\1\\big"


	println("---------------查找重复的单词----------------")
	var str1 = "Is is the cost of of gasoline going up up"

	var patt1 = "(?i)\\b([a-z]+) \\1\\b"
	var pattern = Pattern.compile(patt1)
	var matcher = pattern.matcher(str1)

	while (matcher.find()) {
		println(matcher.group()+"   位置：["+matcher.start()+","+matcher.end()+"]")
	}

	println("---------------普通捕获组----------------")

	var time = "2017-04-25"
	var pattern1  = "(\\d{4})-((\\d{2})-(\\d{2}))"
	var p = Pattern.compile(pattern1)
	var matcher1 = p.matcher(time)

	matcher1.find()

	println("matcher.group(0) value:"+ matcher1.group(0))
	println("matcher.group(1) value:"+ matcher1.group(1))
	println("matcher.group(2) value:"+ matcher1.group(2))
	println("matcher.group(3) value:"+ matcher1.group(3))
	println("matcher.group(4) value:"+ matcher1.group(4))




	/**
	 * 命名捕获组
	 * 每个以左括号开始的捕获组，都紧跟着 ?，而后才是正则表达式。
	 */

	println("---------------命名捕获组----------------")

	var pattern2 = "(?<year>\\d{4})-(?<md>(?<month>\\d{2})-(?<date>\\d{2}))"
	var time1 = "dsfsf 2097-10-20 dsfsf"
	var pattern3 = Pattern.compile(pattern2)
	var matcher2 = pattern3.matcher(time1)

	matcher2.find()

	System.out.printf("\n===========使用名称获取=============");
	System.out.printf("\nmatcher.group(0) value:%s", matcher2.group(0))
	System.out.printf("\nmatcher.group('year') value:%s", matcher2.group("year"))
	System.out.printf("\nmatcher.group('md') value:%s", matcher2.group("md"))
	System.out.printf("\nmatcher.group('month') value:%s", matcher2.group("month"))
	System.out.printf("\nmatcher.group('date') value:%s", matcher2.group("date"))
	matcher2.reset()

	System.out.printf("\n===========使用编号获取=============");
	matcher2.find()
	System.out.printf("\nmatcher.group(0) value:%s", matcher2.group(0))
	System.out.printf("\nmatcher.group(1) value:%s", matcher2.group(1))
	System.out.printf("\nmatcher.group(2) value:%s", matcher2.group(2))
	System.out.printf("\nmatcher.group(3) value:%s", matcher2.group(3))
	System.out.printf("\nmatcher.group(4) value:%s", matcher2.group(4))
	/**
	 * 非捕获组
	 * 在左括号后紧跟 ?:，而后再加上正则表达式，构成非捕获组 (?:Expression)。
	 * 对于时间字符串：2017-04-25，表达式如下:
	 */

	println("\n---------------非捕获组----------------")



	var regex = "(?:\\d{4})-((\\d{2})-(\\d{2}))"
	var data = "2027-09-29"
	var pattern_4 = Pattern.compile(regex)
	var matcher3 = pattern_4.matcher(data)

	matcher3.find()


	println("matcher.group(0) value:${matcher3.group(0)}")
	println("matcher.group(1) value:${matcher3.group(1)}")
	println("matcher.group(2) value:${matcher3.group(2)}")
	println("matcher.group(3) value:${matcher3.group(3)}")
	println("matcher.group(4) value:${matcher3.group(4)}")


}