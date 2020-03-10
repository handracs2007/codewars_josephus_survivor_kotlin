fun josephusSurvivor(n: Int, k: Int): Int {
    return if (n == 1) 1
    else (josephusSurvivor(n - 1, k) + k - 1) % n + 1
}

fun main() {
    println(josephusSurvivor(300, 300))
}