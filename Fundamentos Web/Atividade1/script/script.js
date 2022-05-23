
let name= window.document.getElementById('name')
let email= window.document.getElementById('email')
let assunto=window.document.querySelector('#assunto')

let nameOk= false;
let assuntoOk= false;
let emailOk= false;

let mapa = document.querySelector('#map')

name.style.width='100%'
email.style.width='100%'

function validarNome(){
    let txt = document.querySelector('#txtName');

    if(name.value.length < 3){
        txt.innerHTML='Nome inválido! Mínimo de 3 caracteres necessários';
        txt.style.color = 'red';
    } else{
        txt.innerHTML='Nome válido!';
        txt.style.color = 'green';
        nameOk=true;
    }
}

function validarEmail(){
    let txtEmail = document.querySelector('#txtEmail');
    let regexEmail = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;

    if(email.value.match(regexEmail)){
        txtEmail.style.color = 'green';
        txtEmail.innerHTML='Email válido!';
        emailOk=true;
    }else{
        txtEmail.innerHTML='Email inválido!';
        txtEmail.style.color='red'
    }
}

function validarAssunto(){
    let txtAssunto = document.querySelector('#txtAssunto');

    if(assunto.value.length > 100){
        txtAssunto.innerHTML = 'Inválido! O texto precisa ter de 1-100 caracteres.';
        txtAssunto.style.color = 'red';
        txtAssunto.style.display = 'block';
    } else{
        txtAssunto.style.display = 'none';
        assuntoOk=true;
    }
}

function enviar(){
    if(nameOk==true && emailOk==true && assuntoOk==true){
        alert("Requisição enviada com sucesso!");
     } else{
            alert("Requisição não enviada! Preencha os campos do formulário corretamente.");
      }
}

function zoomMap(){
    mapa.style.width='700px'
    mapa.style.height='500px'
}

function normalMap(){
    mapa.style.width='400px'
    mapa.style.height='250px'
}