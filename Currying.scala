package Test2

object Currying extends App{

  def Sum(a:Int,b:Int,c:Int,d:Int,e:Int): Int ={

     var result = a+b+c+d+e
       result
  }

  var sum1 = Sum _
  var sum2 = sum1.curried
  var sum3 = sum2(1)(3)
  var sum4 = sum3(4)(2)(1)

   println("The sum is "+ sum4)


}
