
class Avto constructor(var Num:String, var horsepower: Int, var rubl: Int)
{


    fun GetAvto ()
    {
      println("Введите название машины")
        Num = readLine()!!.toString()
        println("Введите мощность(л.c)")
        horsepower = readLine()!!.toInt()
        println("Введите стоимость")
        rubl = readLine()!!.toInt()
    }

    fun PrintAvto ()
    {
      println("Название машины : ${Num}")
      println("Мощность в л.с : ${horsepower}")
      println("Стоимость : ${rubl}")
        println("Рекомендуем оформить ОСАГО и получить скидку 10% на ${Num}")
    }
}