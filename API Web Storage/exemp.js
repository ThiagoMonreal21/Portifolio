function armazenaDado(){
    var valorStorage = document.formulario.dado.value;
    localStorage.setItem('dadoStorage', valorStorage);
    alert('O dado "' + localStorage.getItem('dadoStorage') + '" foi armazenado com a propriedade localStorage.');
}

function recuperaDado(){
    alert('O dado "' + localStorage.getItem('dadoStorage')+ '" foi recuperado com a propriadade localStorage.');
}

function excluiDado(){
    localStorage.removeItem('dadoStorage');
    alert('O dado com o nome "dadoStorage" foi excluído');
}