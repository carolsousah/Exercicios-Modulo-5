package com.example.exercciosm5

class Ex01 {
}

fun main() {

        var veiculo = veiculo ("Fusca")
        veiculo.rapido(10)
        veiculo.print()

        veiculo.devagar(0)
        veiculo.print()

        veiculo.devagar(6)
        veiculo.print()



    }

    class veiculo(name: String) {
        var velocity: Int
        var acceleration: Int
        var model: String

        init {
            this.velocity = 0
            this.acceleration = 10
            this.model = "Fusca"
        }

        fun rapido(acceleration: Int) {
            velocity = velocity + acceleration
        }

        fun devagar(acceleration: Int): Int {
            velocity = velocity - acceleration

            if (velocity < 0)
                velocity = 0

            return velocity

        }


        fun print() {
            println("velocidade atual: $velocity, model: $model")
        }


    }