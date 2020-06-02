new Vue({
    el: '#vue-app',

    data:{
        output: 'F'
    },

    methods:{
        readRef: function(){
            console.log(this.$refs.input.value)
            this.output  = this.$refs.input.value
        }
    },

    computed:{

    }
});
