<template>
  <div id="principal">
      
      <div class="inserir_cargo">
        <h2>Gerenciamento de cargos</h2>

        <form >
          <h3>Cadastrar Cargo</h3>
          <input type="text" placeholder="Nome do Cargo" required />
          <h1>NovoUsuario</h1>
          <button	v-on:click="cadastrarCargo">CadastrarCargo</button>        
        </form>

        <table>
          <thead>
            <th>Nome Cargo</th>
          </thead>
          <tbody v-for="cargo in cargos">
            <td>{{ cargo.nome}}</td>
          </tbody>
        </table><!--inserir_cargo-->
      </div>

    <div class="inserir_usuario">
    <h2>Inserir novo usuario </h2>
      <form>
      
        <input type="text" placeholder="Nome" name="nome" requiredv/>
        <input type="text" placeholder="CPF" name="cpf" />
        <input type="text" placeholder="Data de nacimento" name="nascimento" />
        <input type="text" placeholder="Sexo 'M' ou 'F'" name="sexo" />
        <input type="submit" value="Inserir" name="acao" />

      </form>
    </div>

    <table>
      <thead>
        <th>Nome</th>
        <th>Cpf</th>
        <th>Data Nascimento</th>
        <th>Sexo</th>
      </thead>
      <tbody v-for="usuario in usuarios">
        <td>{{ usuario.pessoa.nome}}</td>
        <td>{{ usuario.pessoa.cpf}}</td>
        <td v-if="usuario.pessoa.data_nascimento !== null">{{usuario.pessoa.data_nascimento}}</td>
        <td v-if="usuario.pessoa.data_nascimento === null">Sem data de Nascimento</td>
        <td>{{ usuario.pessoa.sexo}}</td>
      </tbody>
    </table>
  </div>
</template>

<script>

import UsuariosServicos from '../servicos/usuario.js'
import CargoServicos from '../servicos/cargo.js'

export default {
  name: 'Principal',
  data () {
    return {
      usuarios: {}
    }
  },
  mounted() {
    UsuariosServicos.usuarios()
      .then(response => this.usuarios = response.data
      )
    CargoServicos.cargos()
      .then(response => this.cargos = response.data
      )
  },
  methods: {
    
    

  }
}
</script>

<style scoped>

table {
  text-align: left;
  margin-top: 20px;
}

th {
  width: 30%;
  padding: 0 1%;
}

td {
  padding: 0 1%;
}

</style>