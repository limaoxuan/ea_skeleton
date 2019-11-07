$(function(){
        api.GET('ping',
        function success(res){
            console.log(res);
        },function fail(res){
            console.log(res);
        });


});
