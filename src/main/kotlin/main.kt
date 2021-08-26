fun main() {
    println("Seja Bem-vindo ao Bytebank\n")

    val conta1 = Conta()
    conta1.titular = "Orlando Vilar"
    conta1.numero = 1000
    conta1.saldo = 200.0
    println(conta1.titular)
    println(conta1.numero)
    println(conta1.saldo)
    println()

    val conta2 = Conta()
    conta2.titular = "Patrícia Vieira"
    conta2.numero = 1001
    conta2.saldo = 300.0
    println(conta2.titular)
    println(conta2.numero)
    println(conta2.saldo)

    println("\nDepositando na conta do ${conta1.titular}")
    conta1.deposita(50.0)
    println(conta1.saldo)

    println("\nDepositando na conta da ${conta2.titular}")
    conta2.deposita(50.0)
    println(conta2.saldo)

    conta1.saca(300.0)
    println("\nNovo saldo do ${conta1.titular}: ${conta1.saldo}")

    conta2.saca(400.0)
    println("\nNovo saldo do ${conta2.titular}: ${conta2.saldo}")


}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0


    fun deposita(valor : Double){
        saldo += valor
    }

    fun saca(valor : Double){
        if(saldo >= valor){
            saldo -= valor
        }
    }
}

fun testaCopiasEReferencias(){
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("\nnumeroX: $numeroX")
    println("numeroY: $numeroY")

    val contaJoao = Conta()
    contaJoao.titular = "João"

    var contaMaria = Conta()
    contaMaria.titular = "Maria"

    contaJoao.titular = "João"

    println("\nConta de João: ${contaJoao.titular}")
    println("Conta de Maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}

fun testaLacos(){
    var i = 0

    //laço while
    while(i < 5) {
        val titular = "Orlando Vilar $i"
        val numeroConta = 1000 + i
        var saldo = i + 10.0
        saldo = 100 * 2.0
        saldo -= 300

        println("titular: $titular")
        println("número da conta: $numeroConta")
        println("saldo da conta: $saldo")
        println()
        i++
    }

    // laço for
    for (i in 6 downTo 0) {

        if(i == 0) {
            break
        }

        val titular = "Orlando Vilar $i"
        val numeroConta = 1000 + i
        var saldo = i + 10.0
        saldo = 100 * 2.0
        saldo -= 300

        println("titular: $titular")
        println("número da conta: $numeroConta")
        println("saldo da conta: $saldo")
        println()
    }
}

fun testCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("a conta está positiva")
        saldo == 0.0 -> println("a conta está zerada!")
        else -> println("a conta está negativa!!")
    }
}