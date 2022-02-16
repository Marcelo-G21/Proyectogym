function calculaIMC(){

  var peso, estatura, imc, estado;

  peso=document.getElementById("peso").value;
  estatura=document.getElementById("estatura").value;

  if(peso!="" && estatura!=""){

    estatura = parseInt(estatura)/100;
    imc = peso/(estatura*estatura);
    document.getElementById("imc").value= (imc).toFixed(1);
  }
  
        if(imc<16){
          estado="Delgadez Severa";
        }
        else if(imc>=16 && imc<17){
          estado="Delgadez Moderada";
        }
        else if(imc>=17 && imc<18.5){
          estado="Delgadez Aceptable";
        }
        else if(imc>=18.5 && imc<25){
          estado="Peso Normal";
        }
        else if(imc>=25 && imc<30){
          estado="Sobrepeso";
        }
        else if(imc>=30 && imc<35){
          estado="Obesidad: Tipo I";
        }
        else if(imc>=35 && imc<40){
          estado="Obesidad: Tipo II";
        }
        else if(imc>=40){
          estado="Obesidad: Tipo III";
        }
        document.getElementById("estado").value = estado;
}