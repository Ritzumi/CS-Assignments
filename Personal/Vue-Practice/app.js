Vue.component('greeting', {
    template: '<p> Hello world {{name}}. <button v-on:click="changeName">Change Name</button></p>',
    data: function(){
        return {
            name: 'Sherry'
        }
    },
    methods:{
        changeName: function(){
            this.name = 'Sake'
        }
    }
});

new Vue({
    el: '#vue-app-one',

    data:{

    },

    methods:{

    },

    computed:{

    }
});

new Vue({
    el: '#vue-app-two',

    data:{

    },

    methods:{

    },

    computed:{

    }
});