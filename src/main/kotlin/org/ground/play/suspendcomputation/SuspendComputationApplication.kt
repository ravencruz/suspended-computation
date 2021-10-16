package org.ground.play.suspendcomputation

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SuspendComputationApplication

fun main(args: Array<String>) {
	runApplication<SuspendComputationApplication>(*args)
}
