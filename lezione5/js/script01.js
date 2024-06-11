
class Utente{
    constructor(name,lastName){
        this.name=name;
        this.lastName=lastName;
    }
}
//////////////////////////////////////////////////////////////

let elListaUtenti=document.querySelector("#eListaUtenti");
let btnInvia=document.querySelector("#btnInvia");
let btnModifica=document.querySelector("#btnModifica");

let idSelezionato=0;

const URLEndpoint="https://666814a2f53957909ff66e01.mockapi.io/utenti";

/////////////////////////////////////////////////////////////
function salvaUtente(){
    let userName=document.querySelector("#nomeUser").value;
    let lastName=document.querySelector("#cognomeUser").value;

    if(userName==""||lastName==""){
        event.preventDefault();
    }else{
        //eseguo una fetch con metodo POST andando a registrare un nuovo utente    
        let utente=new Utente(userName,lastName);

        fetch(URLEndpoint, {
            method:"POST",
            headers:{
                "Content-Type": "application/json"
            },
            body:JSON.stringify(utente)
        }).then(data=>{
            return data.json();
        }).then(()=>{
            location.reload();
        })
    }
}

btnInvia.addEventListener("click", salvaUtente);
/////////////////////////////////////////////////////////////////
function recuperaDati(){
    fetch(URLEndpoint)
    .then(data=>{
        return data.json();
    })
    .then(response=>{
        //response è un array di oggetti
        response.forEach(user => {
            //elListaUtenti.innerHTML+=`<li> ${user.name} ${user.lastName} </li>`;
            elListaUtenti.appendChild(stampaUser(user));
        });
    })
}
function stampaUser(user){

    let rigaUser=document.createElement("li");//<li></li>
    rigaUser.innerHTML=`${user.name} ${user.lastName}`;//<li>Nome,cognome</li>

    let btnElimina=document.createElement("button");//<li>Nome,cognome <button>X</button> </li>
    btnElimina.innerHTML="X";
    let btnModifica=document.createElement("button");//<li>Nome,cognome <button>X</button> <button>M</button></li>
    btnModifica.innerHTML="Modifica";

    btnElimina.addEventListener("click",function(){
        eliminaUserById(user.id);
    })
    rigaUser.appendChild(btnElimina);
    btnModifica.addEventListener("click", function(){
        preparaModifica(user.id);
    })
    rigaUser.appendChild(btnModifica);

    return rigaUser;
}
window.addEventListener("DOMContentLoaded", recuperaDati);
//////////////////////////////////////////////////////////////////
function eliminaUserById(id){
    console.log("Sto eliminando "+id);
    let URLDel=URLEndpoint+"/"+id;

    fetch(URLDel,{
        method:"DELETE"
    })
    .then(data=>{
        return data.json();
    })
    .then(userEliminato=>{
        console.log("Hai eliminato "+userEliminato);
        location.reload();
    })
    .catch(error=>{
        console.log(error);
    })
}
/////////////////////////////////////////////////////////////////
function preparaModifica(id){
    let urlPrepMod=URLEndpoint+"/"+id;

    let nomeMod=document.querySelector("#nomeUserMod");
    let cognomeMod=document.querySelector("#cognomeUserMod");

    fetch(urlPrepMod)
    .then(data=>{
        return data.json();
    })
    .then(response=>{
        nomeMod.value=response.name;
        cognomeMod.value=response.lastName;
        idSelezionato=response.id;
    })
}
function modificaUser(){

    let URLMod=URLEndpoint+"/"+idSelezionato;

    let modName=document.querySelector("#nomeUserMod").value;
    let modLastName=document.querySelector("#cognomeUserMod").value;

    if(modName==""||modLastName==""){
        event.preventDefault();
    }else{
        let utente=new Utente(modName,modLastName);

        fetch(URLMod, {
            method:"PUT",
            headers:{
                "Content-Type": "application/json"
            }, body:JSON.stringify(utente)
        }).then(data=>{
            return data.json();
        }).then(()=>{
            location.reload();
        })
    }
}

btnModifica.addEventListener("click", modificaUser);