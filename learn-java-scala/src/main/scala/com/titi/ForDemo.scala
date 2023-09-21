package com.titi

/**
 * @description
 * @author bianyulong
 * @date 2023/09/21
 */
object ForDemo {
  def main(args: Array[String]): Unit = {

    // 数组
    val array1 = Array(1, 2, 3, 4, 5, 6, 7)
    for (i <- array1) {
      println(i)
    }

    // 倒序打印
    for (i <- array1.reverse) {
      println(i)
    }

    // 使用数组下标打印
    for (i <- 0 to array1.length - 1) {
      println(array1(i))
    }

    //表达式1 to 10 返回一个Range区间，每次循环将区间的值赋值给i
    for (i <- 0 to 5) {
      println(array1(i))
    }

    // 间隔打印
    val stepArr = 1 to(10, 2)
    for (i <- stepArr) {
      println(i)
    }

    println("-" * 10)

    for (i <- "abc"; y <- "xbz") {
      println(i + "\t" + y)
    }

    println("-" * 10)
    // 高级循环， 每个生成器都可以带一个条件，注意：if前没有分号
    // 守卫条件：if i != y
    for (i <- "abc"; y <- "xbz"; if i != y) {
      println(i + "\t" + y)
    }

    println("-" * 10)
    // 推导式： 如果for循环的循环体以yield开始，则该循环会构建出一个集合，每次迭代都生成新集合的一个值
    val array2 = for (i <- 1 to(10, 2)) yield i+1
    for (i <- 0 to array2.length - 1) {
      println(array2(i))
    }

  }

}
