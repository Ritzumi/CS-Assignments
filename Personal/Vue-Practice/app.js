new Vue({
    el: '#vue-app',

    data:{
        name: "Meow",
        website: "https://www.facebook.com/",
        tag: "<a href=\"https://www.facebook.com/\">Facebook Link</a>",
        year: 2020,
        x: 0,
        y: 0
    },

    methods:{
        greet: function(params){
            if(params == undefined)
                params = "";
            return "Hello there " + params + " " + this.name
        },
        add: function(num){
            this.year+= num;
        },
        substract: function(num){
            this.year-= num;
        },
        updateXY: function(event){
            this.x = event.offsetX;
            this.y = event.offsetY;
        },
        click: function(){
            alert('Hi');
        }
    }
});