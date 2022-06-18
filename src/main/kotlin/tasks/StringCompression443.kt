package tasks

import java.lang.StringBuilder

class StringCompression443 {
    fun compress(chars: CharArray): Int {
        var handle = 0
        val result = StringBuilder()
        while (chars.size > handle) {
            val char = chars[handle]
            var count = 1
            while (chars.size > ++handle && chars[handle] == char) {
                count++
            }
            if(count == 1) {
                result.append(char)
            } else {
                result.append(char)
                result.append(count)
            }
        }
        //val arr  = result.toString().toCharArray()
        result.toString().toCharArray(chars, 0, 0, result.length)
        return result.length
    }
}