package subtask2

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        var i: Int = 0
        var j: Int = 0
        var c: String = ""

        do {
            if(a[i].equals(b[j], ignoreCase = true))
            {
                c = c + b[j]
                i++
                j++
            }
            else
            {
                i++
            }
        } while(i<a.length && j < b.length)

        if(c == b)
        {
            return "YES"
        }
        else
        {
            return "NO"
        }
    }
}
