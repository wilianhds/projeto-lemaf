import axios from 'axios';

export const http = axios.create({
    baseURL: 'http://localhost:9080/',
    timeout: 10000,
});