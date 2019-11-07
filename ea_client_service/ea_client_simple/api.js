let api = (function () {
    let apis = {
        login: "api/user/login",
        register: "api/user/register",
        ping: "api/test/hello",
        publish: "api/product/publish",
        all_products: "api/product/all"
    }
    

    function getApiByName(apiName){
        if(apis[apiName]){
            return apis[apiName];
        }
    }

    function GET(apiName,success,fail){
        apiName = getApiByName(apiName)?getApiByName(apiName):apiName;
        $.ajax({
            method: 'GET',
            url: apiName,
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