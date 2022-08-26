function iniciaAjax(){
    var objAjax = false;
    if (window.XMLHttpRequest)
        objAjax = new XMLHttpRequest ();
    return objAjax;
}

function requisita(arquivo){
    var reqAjax = iniciaAjax ();
    if(reqAjax){
        reqAjax.onreadystatechange = function (){
            exibeResposta(reqAjax);
        };
        reqAjax.open("GET", arquivo);
        reqAjax.send();
    }
}

function exibeResposta(reqAjax){
    if(reqAjax.readyState == 4){
        if(reqAjax.status == 200){
            var dados = eval("(" + reqAjax.responseText + ")");
            var siglaDado = dados.disciplina.sigla;
            var nomeDado = dados.disciplina.nome;

            var sigla = document.createElement("h3");
            var textoSigla = document.createTextNode(siglaDado);
            sigla.appendChild(textoSigla);

            var nome = document.createElement("p");
            var textoNome = document.createTextNode(nomeDado);
            nome.appendChild(textoNome);

            var conteudo = document.getElementById("conteudo_arquivo");
            while (conteudo.hasChildNodes())
                conteudo.removeChild(conteudo.lastChild);

                conteudo.appendChild(sigla);
                conteudo.appendChild(nome);
            } else
                alert("Erro na comunicação com o servidor");
    }
}