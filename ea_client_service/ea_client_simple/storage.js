let storage = (function () {
    function getToken() {
        return window.localStorage.getItem("token");
    };
    
    function getEmail() {
        return window.localStorage.getItem("email");
    };

    function getRole(){
        return window.localStorage.getItem("role");
    }

    function save(data){
        window.localStorage.setItem("email", data.email)
        window.localStorage.setItem("token", data.token)
        window.localStorage.setItem("role", data.role)
    }

    return {
        save: save,
        getEmail: getEmail,
        getRole: getRole,
        getToken: getToken
    }
})();