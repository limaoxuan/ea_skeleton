let api = (function () {
    let apis = {
        login: "api/user/login",
        register: "api/user/register",
        ping: "api/test/hello"
    }
    

    function getApiByName(apiName){
        if(apis[apiName]){
            return apis[apiName];
        }else{
            alert("this api not available");
        }
    }

    function GET(apiName,success,fail){
        $.ajax({
            method: 'GET',
            url: getApiByName(apiName),
            dataType: 'json',
            contentType: 'application/json',
            beforeSend: function (xhr){ 
                xhr.setRequestHeader('Authorization', storage.getToken()); 
            },
            success: function (res) {
                success(res);
            },
            error: function (res) {
                fail(res);
            }
        });
    }

    function POST(apiName,jsonData,success,fail){
        $.ajax({
            method: 'POST',
            url: getApiByName(apiName),
            dataType: 'json',
            data: JSON.stringify(jsonData),
            contentType: 'application/json',
            beforeSend: function (xhr){ 
                xhr.setRequestHeader('Authorization', storage.getToken()); 
            },
            success: function (res) {
                success(res);
            },
            error: function (res) {
                fail(res);
            }
        });
    }

    return {
        GET: GET,
        POST: POST
    }
})();