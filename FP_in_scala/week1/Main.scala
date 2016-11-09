object ex1 {
	def pascal(c: Int, r: Int): Int = {
		if (c == 0) 1
		else if (r == c ) 1
		else pascal(c,  r-1) + pascal(c - 1, r - 1)
	}

	def main(args: Array[String]) : Unit = {
		println(pascal(0, 2))
		println(pascal(1, 2))
		println(pascal(1, 3))
	}
}

object ex2 {
	def check_balance(chars: List[Char], count: Int) : Boolean = {
		if (chars.isEmpty && count == 0)  true
		else if (chars.isEmpty && count != 0) false
		else if (count < 0) false
		else if (chars.head != '(' && chars.head != ')') check_balance(chars.tail, count)
		else if (chars.head == '(') check_balance(chars.tail, count + 1)
		else check_balance(chars.tail, count - 1)

	}

	def balance(chars: List[Char]) : Boolean = {
		if (chars.isEmpty) return true

		if (check_balance(chars, 0)) true
		else false
	}

	def main(args: Array[String]) : Unit = {
		if (ex2.balance("(just an) example".toList)) println("yes")
		else println("no")

		if (ex2.balance("())(".toList)) println("yes")
		else println("no")

		if (ex2.balance("(if (zero? x) max (/ 1 x))".toList)) println("yes")
		else println("no")
	}
}