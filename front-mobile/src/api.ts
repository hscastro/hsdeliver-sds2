import axios from "axios";

const API_URL = 'http://10.0.0.9:8080';
//const API_URL = 'https://halyson-hsdeliver.herokuapp.com';

export function fetchOrders(){
    return axios(`${API_URL}/orders`);
}


export function confirmDelivery(orderId: number){
    return axios.put(`${API_URL}/orders/${orderId}/delivered`);
}

