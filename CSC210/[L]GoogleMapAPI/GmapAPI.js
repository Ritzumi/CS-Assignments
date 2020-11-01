var myMap;
var mapOptions;

function mapInit() {
    var a = 5;
    var b = 10;
    //alert(a+b);
    document.getElementById('abc').value = a + b;
    var SIT = { lat: 13.652648, lng: 100.493578 };
    mapOptions = { zoom: 10, center: SIT };
    myMap = new google.maps.Map(
        document.getElementById('mapDisplay'), mapOptions
    );
    shop = {
        position: { lat: 13.746082, lng: 100.534164 },
        title: "Best Gold Fish @ Siam Paragon"
    }

    myMarker = new google.maps.Marker(shop);
    myMarker.setMap(myMap);

    var shopList = [
        {
            position: { lat: 13.698084, lng: 100.538132 },
            title: "Gold Fish @ Central Rama III",
            draggable: true
        },
        {
            position: { lat: 13.646656, lng: 100.680087 },
            title: "Gold Fish @ Mega Bangna",
            icon: { url: "http://maps.google.com/mapfiles/ms/icons/blue-dot.png" }
        },
        {
            position: { lat: 18.793268, lng: 98.984972 },
            title: "Gold Fish @ Chiang Mai",
            //icon: { url: "http://maps.google.com/mapfiles/ms/icons/black-dot.png" },
            //scaledSize: new google.maps.Size(10, 10)
        },
        {
            position: { lat: 35.681077, lng: 139.768792 },
            title: "Gold Fish @ Tokyo"
        }
    ]
    for (let index = 0; index < shopList.length; index++) {
        myMarker = new google.maps.Marker(shopList[index]);
        myMarker.setMap(myMap);
    }
    customer = {
        position: SIT,
        title: "Drag to your home",
        draggable: true,
        icon: { url: "http://maps.google.com/mapfiles/ms/icons/purple-dot.png" }
    }

    var customerMarker = new google.maps.Marker(customer);
    customerMarker.setMap(myMap);
    
    google.maps.event.addListener(customerMarker, "click", function(event){
        alert("Should your home");
    });
    google.maps.event.addListener(customerMarker, "dragend", function(event){
        var latCus = this.position.lat();
        var lngCus = this.position.lng();
        document.getElementById('latitude').value = latCus;
        document.getElementById('longtitude').value = lngCus;
    });
}