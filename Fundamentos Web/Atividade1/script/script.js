
let nome= window.document.getElementById('nome')
let email= document.guerySelector('#email')
let assunto=document.querySelector('#assunto')

nome.style.width='100%'
email.style.width='100%'

function validarNome(){
    if(nome.value.length < 3){
        alert('nome inválido')
    }
}