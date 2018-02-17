/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(".text-field").foucus(function(){
   $(this).parent().addClass("is-active is-completed"); 
});

$(".text-field").focusout(function(){
   if($(this).val()==="")
       $(this).parent().removeClass("is-completed");
       $(this).parent().removeClass("is-active");
});

