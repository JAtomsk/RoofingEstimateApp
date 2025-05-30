// Import React and useState hook from the React Library
import axios from 'axios';
import React, {useState} from 'react';

function CustomerForm(){

    const [formData, setFormData] = useState({
        name: '',
        phoneNumber: '',
        address: '',
        email: '',
        roofSizeInSquares: '',
        pricePerSquares: ''
    });
    const handleChange = (e) => {
        setFormData({
            ...formData,
            [e.target.name]: e.target.value
        });
    };

    const handleSubmit = (e) => {
        e.preventDefault(); // prevents form from refreshing the page
        
        const totalEstimate = formData.roofSizeInSquares * formData.pricePerSquares;
        console.log('Form Data', {...formData, totalEstimate});
        // TODO: Send this to backend using Axios?
    };
    return (
        <form onSubmit={handleSubmit}>
            <h2> Customer Estimate Form</h2>

            <input name="name" placeholder="Name" onChange={handleChange} required />
            <input name="phoneNumber" placeholder="Phone" onChange={handleChange} required />
            <input name="address" placeholder="Address" onChange={handleChange} required />
            <input name="email" type="email" placeholder="Email" onChange={handleChange} required />
            <input name="roofSizeInSquares" type="number" placeholder="Roof Size (squares)" onChange={handleChange} required />
            <input name="pricePerSquare" type="number" placeholder="Price per Square" onChange={handleChange} required />

            <button type="submit">Generate Estimate</button>
        </form>
    );
}
export default CustomerForm;