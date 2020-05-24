import {http} from './configuracoes.js'

export default {
    usuarios: () => { return http.get('/usuario/listar') }
}