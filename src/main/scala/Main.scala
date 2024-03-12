

object Main {
  /*def main(args: Array[String]): Unit = {
    def merge(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Unit = {
      def f(nums11: Array[Int], nums22: Array[Int]): Array[Int] = {
        if (nums11.nonEmpty && nums22.nonEmpty)
          if (nums11.head < nums22.head)
            nums11.head +: f(nums11.tail, nums22)
          else
            nums22.head +: f(nums11, nums22.tail)

        else if (nums11.nonEmpty) nums11
        else if (nums22.nonEmpty) nums22
        else Array[Int]()
      }

      val nums11 = new Array[Int](m)
      for (i <- 0 until m) nums11(i) = nums1(i)

      val nums = f(nums11, nums2)
      for (i <- nums1.indices) nums1(i) = nums(i)
    }
  }*/

  def main(args: Array[String]): Unit = {
    var v = 10.0
    for (i <- 1 to 12) {
      v *= 0.781
      println(v)
    }
  }

}