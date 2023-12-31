package com.igorwojda.integer.power

private object Solution {
    private fun power(base: Int, exponent: Int): Int {
        if (exponent == 1) {
            return base
        }

        return base * power(base, exponent - 1)
    }
}

private object KtLintWillNotComplain