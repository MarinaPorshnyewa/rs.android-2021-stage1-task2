package subtask3

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {

        when(blockB){
            String::class -> return searchMyString(blockA.filterIsInstance<String>())
            Int::class -> return blockA.filterIsInstance<Int>().sum()
            LocalDate::class -> return blockA.filterIsInstance<LocalDate>().max()?.format(
                DateTimeFormatter.ofPattern("dd.MM.yyyy"))!!

            else -> return ""
        }

    }
    private fun searchMyString(myStr: List<String>):String
    {
        var str: String = ""
        for(i in myStr)
        {
            str = str + i
        }
        return str
    }
}
