import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

fun main() {
   println("Main Program starts ${Thread.currentThread().name}")
   GlobalScope.launch {
       //all async task
       println("Background threads starts ${Thread.currentThread().name}")

   }
    println("Main Program ends ${Thread.currentThread().name}")
  Thread.sleep(5000)
}