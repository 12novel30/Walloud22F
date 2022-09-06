import axios from "axios";

const API = axios.create({
    baseURL: "http://localhost:8001",
    headers: {
        'Content-type': 'application/json', //ottz
      },
});

export default API;