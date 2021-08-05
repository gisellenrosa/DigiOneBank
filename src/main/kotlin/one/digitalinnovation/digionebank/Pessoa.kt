package one.digitalinnovation.digionebank

class Pessoa {
    var nome:String = "Rodolfo"
    var cpf:String = "123.123.231.23"
    private set
    constructor()
    fun pessoaInfo() = "$nome e $cpf"
}

fun main() {
    var rodolfo = Pessoa()
    println(rodolfo.pessoaInfo())


}