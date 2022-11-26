
$(document).ready(function(){
    $("#sendMail").on("submit",function(event){
        event.preventDefault();
        var f = $(this).serialize();
        $.ajax({
            url: "/sendMail",
            data: f,
            method: "post",
            success: function(data){
                if(data.trim()==="done") {
                    $("#status").show();
                    $("#status").removeClass("text-danger");
                    $("#status").addClass("text-success");
                    $("#status").html("Mail-ul a fost trimis cu succes!");
                } else {
                    $("#status").show();
                    $("#status").removeClass("text-success");
                    $("#status").addClass("text-danger");
                    $("#status").html("Ceva nu a mers bine!");
                }
            },
            error: function(){
                alert("Ceva nu a mers bine! Încearcă mai târziu!");
            }
        });
    });
});