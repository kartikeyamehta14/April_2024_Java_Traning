let counter = 0;
function increament(){
    counter++;
    displayCounterToUI();
}  function decerement(){
    counter--;
    displayCounterToUI();
} function displayCounterToUI(){
   let ele = document.getElementById('a');

   ele.innerHTML='Counter='+counter;
}