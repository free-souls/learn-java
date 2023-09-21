package com.titi

/**
 * @description
 * @author bianyulong
 * @date 2023/09/21
 */
object WhileDemo {
  def main(args: Array[String]): Unit = {

    // 定义开始条件
    var n = 0

    // 定义终止条件
    while (n < 10) {
      println(n)

      // 定义迭代条件
      n += 1
    }
  }

}
