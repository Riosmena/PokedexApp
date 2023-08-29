package com.igorwojda.integer.pyramidgenerator

private object Solution {
    private fun generatePyramid(n: Int): List<String> {
        val list = mutableListOf<String>()
        val midpoint = ((2 * n) - 1) / 2
        val numColumns = (n * 2) - 1

        (0 until n).forEach { row ->
            var rowStr = ""
            (0 until numColumns).forEach { column ->
                rowStr += if (midpoint - row <= column && midpoint + row >= column) {
                    "#"
                } else {
                    " "
                }
            }
            list.add(rowStr)
        }

        return list
    }
}