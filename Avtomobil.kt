fun main()
{
 try {
     val avto1:Avto=Avto("Audi rs7", 355, 3500000)
     avto1.GetAvto()
     avto1.PrintAvto()

     val avto2:Avto=Avto("BMW M5", 350, 5000000)
     avto2.GetAvto()
     avto2.PrintAvto()
     
 }catch (e:Exception){
     println("Некоректный ввод данных")
 }
}