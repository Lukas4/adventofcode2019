package cz.kolek.advent.of.code

import java.nio.file.Files
import java.nio.file.Path

object Utils {
    fun readAllLines(fileName: String): List<String> {
        val resource = this.javaClass.getResource(fileName).toURI()
        return Files.readAllLines(Path.of(resource))
    }
}