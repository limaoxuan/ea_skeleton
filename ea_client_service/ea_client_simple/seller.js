$(function () {
    $("#productImgUrlInput").change(function () {
        $("#productImgUrl").attr('src',$("#productImgUrlInput").val());
    })
    $("#makeproduct").click(function () {
        let name = $("#name").val();
        let price = $("#price").val();
        let category = $("#category").val();
        let pic = $("#productImgUrl").attr('src');
        let quantity = $("#quantity").val();
        let data = {
            name: name,
            pic: pic,
            price: price,
            category: category,
            quantity: quantity,
            vendorId: storage.getUID()
        }

        console.log(JSON.stringify(data));

        api.POST('publish',
        data,
        function success(res){
            console.log(res);
            productions.addFromFront(res);
        },function fail(res){
            console.log(res);
        });
    })

    function init() {
        productions.init_seller();
    }
    init();
});

