fun main(args: Array<String>) {

    var nome = ""
    var idade = 0
    var anoAtual = 2021
    var emprego = ""
    var nacionalidade = ""
    var tipoSangue = ""


    print("Digite seu nome: ")
    nome = readLine()!!
    print("Digite a sua idade: ")
    idade = readLine()!!.toInt()
    print("Digite sua preferência de emprego: ")
    emprego = readLine()!!
    print("Digite a sua nacionalidade: ")
    nacionalidade = readLine()!!
    print("Digite o seu tipo sanguíneo: ")
    tipoSangue = readLine()!!

    println("Meu nome é $nome tenho $idade anos de idade " +
            "nasci em ${anoAtual - idade}, gostaria de me tornar $emprego, " +
            "sou $nacionalidade e meu tipo sanguíneo é $tipoSangue")
}