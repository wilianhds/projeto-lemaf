import {http} from './configuracoes.js'

export default {
    cargos: () => { 
        return http.get('/cargo/listar')
    }
}