<template>
  <div id="principal">
    <ul>
      <li v-for="usuario in usuarios">    
        {{ usuario.pessoa.nome }} 
      </li> 
    </ul>
  </div>
</template>

<script>

import UsuariosServicos from '../servicos/usuario.js'

export default {
  name: 'Principal',
  data () {
    return {
      usuarios: {},
    }
  },
  mounted() {
    UsuariosServicos.usuarios()
      .then(response => this.usuarios = response.data
      )
  },
  methods: {
    
  }
}
</script>

<style scoped>
</style>
