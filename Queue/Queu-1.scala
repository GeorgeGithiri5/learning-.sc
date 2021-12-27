import scala.collection.mutable._

object GfG{
    // Main Method
    def main(args:Array[String]){
        // Initialize a Queue
        var q1 = Queue(1, 2, 3, 4, 5)

        // print the elements of Queue
        print("Queue Elements")
        q1.foreach((element:Int)=>print(element+" "))

        // Print the first element of the queue
        var firstElement = q1.front
        println("\nFirst element in the queue: " + firstElement)

        // Enqueue 10 in the queue
        q1.enqueue(10)

        // Print the elements of queue
        print("Queue Elements after enqueue: ")
        q1.foreach((element:Int)=>print(element + " "))

        // Dequeue first element from the queue
        var dep = q1.dequeue

        // Print the elements of queue
        print("\nQueue Elements after dequeue: ")
        q1.foreach((element:Int)=>print(element + " "))

        
    }
}