$(function(){
        api.GET('ping',
        function success(res){
            console.log(res);
        },function fail(res){
            console.log("fail",res);
            // window.location.href = 'login.html';
        });

        productions.init_buyer();
});
