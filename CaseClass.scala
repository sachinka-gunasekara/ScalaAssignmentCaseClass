

object my extends App{
  val p1=Point(8,10)
  val p2=Point(2,3)
  val p3=p1.move(5,8)
  val p4=p1.invert()
  
  
  println("Point class is : " +p1)
  println("Addition : " +(p1+p2))
  println("Move by a given distance : " +p3)
  println("Distance : " +(p1-p2))
  println("Invert of X :" + p4)

  
}


case class Point(a:Int,b:Int){
  def x:Int=a
  def y:Int=b
  
  def +(that:Point)=Point(this.x+that.x,this.y+that.y)
  
  def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy)
  
  def -(that:Point)=Point(this.x-that.x,this.y-that.y)
  
  def invert()  = Point(this.y , this.x)
  
  
}