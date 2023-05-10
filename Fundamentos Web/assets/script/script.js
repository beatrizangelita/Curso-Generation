
let nome = document.querySelector('#nome')
let email = document.querySelector('#email')

nome.style.width = '100%'
email.style.width = '100%'

// Validar nome
function validaNome(){
    let txtNome = document.querySelector('#txtNome');

    if(nome.value.length < 2){
        txtNome.innerHTML = 'O nome deve ter mais de 2 caracteres!'  
        txtNome.style.color='red'
    }
    else{
        txtNome.innerHTML = 'Campo preenchido corretamente!'
        txtNome.style.color='green'
        nomeOk = true
    }
    console.log(nome.value)
    console.log(nome.value.length)
}

// Validar E-mail
function validaEmail(){
    let txtEmail = document.querySelector('txtEmail')
    
    if(email.value.indexOf('@') == -1 || email.value.indexOf('.') == -1){
        txtEmail.innerHTML = 'E-mail inválido!'
        txtEmail.style.color='red'
    }
    else{
        txtEmail.innerHTML = 'E-mail válido!'
        txtEmail.style.color='green'
        emailOk = true
    }
    console.log(email.value)
    console.log(email.value.length)
}

// Validar Assunto
function validaAssunto(){
    let txtAssunto = document.querySelector('#txtAssunto')

    if(txtAssunto.value.length >= 100){
        txtAssunto.innerHTML = 'Texto é muito grande, digite no máximo 100 caracteres!'
        txtAssunto.sytle.color='red'
    }
    else{
        //txtAssunto.style.display = 'none'
        txtAssunto.innerHTML = 'Texto Ok'
        txtAssunto.sytle.color='green'
        assuntoOk = true
    }

// validar envio
let nomeOk = false
let emailOk = false
let assuntoOk = false

function enviar(){
    if (nomeOk == true && emailOk == true && assuntoOk == true){
        alert('Formulário enviado com sucesso!')
    }
    else{
        alert('Preencha todos os campos corretamente!')
    }
}

}
