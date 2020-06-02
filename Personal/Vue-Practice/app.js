new Vue({
    el: '#vue-app',

    data:{
        a: 0,
        b: 0,
        age: 20
    },

    methods:{

    },

    computed:{
        addToA: function(){
            console.log('add to A')
            return this.a + this.age
        },
        addToB: function(){
            console.log('add to B')
            return this.b + this.age
        },
    }

});