$(function(){
    $('#register_button').click(function(){
        let data = {
            firstName: $('#firstName').val(),
            lastName: $('#firstName').val(),
            email: $('#email').val(),
            password: $('#password').val()
        }
        console.log(JSON.stringify(data));

        api.POST('register',
        data,
        function success(res){
            console.log(res);
            window.location.href = 'login.html';
        },function fail(res){
            console.log(res);
        });


    });


});