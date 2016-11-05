object ex1 {
	def pascal(c: Int, r: Int): Int = {
		if (c == 1) 1
		else if (r == c ) 1
		else (pascal(r - 1,  c) + pascal(r - 1, c - 1)) 
	}

	def main(args: Array[String]) : Unit = println(pascal(1, 3))
}
