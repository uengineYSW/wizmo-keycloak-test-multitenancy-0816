<template>
    <div>
        <div class="label-title">Stock</div>
        <Number label="Stock" v-model="value.stock" :editMode="editMode"/>
        <div class="label-title">Name</div>
        <String label="Name" v-model="value.name" :editMode="editMode"/>

        <v-divider class="border-opacity-100 my-divider"></v-divider>
        <v-layout row justify-end>
            <v-btn
                width="64px"
                color="primary"
                @click="save"
            >
                저장
            </v-btn>
        </v-layout>
    </div>
</template>


<script>
import BaseEntity from './base-ui/BaseEntity'

export default {
    name: 'Product',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "products"
    }),
    created(){
    },
    computed:{
    },
    methods: {
    },
}
</script>

