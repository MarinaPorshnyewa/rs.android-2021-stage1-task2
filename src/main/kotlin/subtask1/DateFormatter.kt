package subtask1

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {

        var dayInt: Int = day.toInt()
        val myMonthInt: Int = month.toInt()
        var MyYearInt: Int = year.toInt()

        var monthInt: Int = myMonthInt
        var yearInt: Int = MyYearInt
        var monthOfYear: String? = null

        var dayWeek: Int? = null
        var result: String? = null

        var leapYear: Boolean = false

        if(myMonthInt < 3)
        {
            yearInt = yearInt - 1
            monthInt = monthInt + 10
        }
        else
        {
            monthInt = monthInt - 2
        }

        if((MyYearInt % 4 == 0 && (MyYearInt % 100 != 0)) || (MyYearInt % 4 == 0 && MyYearInt % 400 == 0))
        {
            leapYear = true
        }

        dayWeek = (dayInt + (31 * monthInt) / 12 + yearInt + yearInt / 4 - yearInt / 100 + yearInt / 400) % 7

        val dayWeekString: String = when {
            dayWeek == 1 -> "понедельник"
            dayWeek == 2 -> "вторник"
            dayWeek == 3 -> "среда"
            dayWeek == 4 -> "четверг"
            dayWeek == 5 -> "пятница"
            dayWeek == 6 -> "суббота"
            dayWeek == 0 -> "воскресенье"
            else -> "Такого дня не существует"
        }

        if(dayInt>0) {
            monthOfYear = when {
                myMonthInt == 1 && dayInt < 32 -> "января"
                myMonthInt == 2 && leapYear== false && dayInt < 29 -> "февраля"
                myMonthInt == 2 && leapYear== true && dayInt < 30 -> "февраля"
                myMonthInt == 3 && dayInt < 32 -> "марта"
                myMonthInt == 4 && dayInt < 31 -> "апреля"
                myMonthInt == 5 && dayInt < 32 -> "мая"
                myMonthInt == 6 && dayInt < 31 -> "июня"
                myMonthInt == 7 && dayInt < 32 -> "июля"
                myMonthInt == 8 && dayInt < 32 -> "августа"
                myMonthInt == 9 && dayInt < 31 -> "сентября"
                myMonthInt == 10 && dayInt < 32 -> "октября"
                myMonthInt == 11 && dayInt < 31 -> "ноября"
                myMonthInt == 12 && dayInt < 32 -> "декабря"
                else -> "Такого дня не существует"
            }
        }
        else{
            monthOfYear = "Такого дня не существует"
        }

        if(dayWeekString == "Такого дня не существует" || monthOfYear == "Такого дня не существует"){
            result = "Такого дня не существует"
        }
        else {
            result = dayInt.toString() + " " + monthOfYear + ", " + dayWeekString
        }

        return  result
    }
}
