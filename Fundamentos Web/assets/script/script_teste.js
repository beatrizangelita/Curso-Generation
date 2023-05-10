// tipos de declaração de variaveis
// var / let / const

// var x = 'x é meu nome' //var pode ser alterado e sempre vai ter o escopo global
// let y = 'meu nome é y' //let pode ser alterado, e tem o escopo local de onde foi criado
// const numero = 2 //const não pode ser alterado depois de declarado, e tem escopo local, assim como o let

// alert(y)

// Capturando elementos pela DOM
// ao usar o "document.", ganhamos acesso no HTML por inteiro, e podemos buscar os elementos por ID ou Classe, por exemplo

/*
//Exemplo 1: 
let x = "meu nome é Beatriz";
let numero = 2;
const imposto = 10;

numero = 15 + 15;

alert(numero + x)
*/

/*
//Exemplo 2
Date();
console.log(Date())
*/

const nome = document.getElementById("nome");

// .email trabalha com a class 
// #email trabalha com ID
// email trabalha com o nome da tag
const email = document.querySelector("#email");

//Traz a informação que está dentro do campo nome
alert(nome.value)

// Função para aparecer olhar mundo
function olaMundo(){
    alert("Você clicou aqui!")
}

// Função para validar nome
// innerHTML saida do elemento
let txtNome = document.querySelector("#txtNome");
function validaNome(){
    if(nome.value.length < 2){
        txtNome.innerHTML = "O nome deve ter mais de 2 caracteres!"    
        txtNome.style.color='red'
    }
    else{
        txtNome.innerHTML = "Campo preenchido corretamente!"
        txtNome.style.color='green'
    }
    console.log(nome.value)
    console.log(nome.value.length)
}
