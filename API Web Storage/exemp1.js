function iniciaAjax(){
    var objAjax = false;
    if(window.XMLHttpRequest)
        objAjax = new XMLHttpRequest();
    return objAjax;
}

function requisita(){
    var reqAjax = iniciaAjax();
    if (reqAjax){
        reqAjax.onreadystatechange = function(){
            if (reqAjax.readyState == 4){
                if (reqAjax.status == 200)
                    alert(reqAjax.status + " - " + reqAjax.statusText + "\n" +reqAjax.responseText);
                else
                    alert(reqAjax.status + " - " + reqAjax.statusText + "\nErro na comunicação com o servidor");
            }
        };
        reqAjax.open("GET", arquivo);
        reqAjax.send();
    }
}