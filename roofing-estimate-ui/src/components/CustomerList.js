import React, {useEffect, useState} from 'react';
import axios from 'axios';

function CustomerList(){
    const [customers, setCustomers] = useState([]);

    useEffect(() => {
        axios.get('http://localhost:8080/customers')
            .then(response => {
                setCustomers(response.data);
            })
            .catch(error => {
                console.error('Error fetching customers:', error);
            });
    }, []);

    return (
        <div className="p-4">
            <h2 className="text-xl font-semibold mb-4">Customer List</h2>
            {customers.length === 0 ? (
                <p>No customers found.</p>
            ) : (
                <ul className="space-y-2">
                    {customers.map((customer, index) => (
                        <li key={index} className="p-2 border rounded shadow">
                            <p><strong>Name:</strong> {customer.name}</p>
                            <p><strong>Email:</strong> {customer.email}</p>
                            <p><strong>Address:</strong> {customer.address}</p>
                            {/* Add more fields as needed */}
                            <button className="mt-2 px-4 py-1 bg-blue-500 text-white rounded hover:bg-blue-600">
                                Select
                            </button>
                        </li>
                    ))}
                </ul>
            )}
        </div>
    );
}

export default CustomerList;