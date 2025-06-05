import React from 'react';
import{BrowserRouter as Router, Routes, Route, Link} from "react-router-dom";
import CustomerForm from './components/CustomerForm';
import CustomerList from './components/CustomerList';


function App() {
    return (
        <Router>
            <div className="p-4">
                <nav className="mb-4">
                    <Link to="/customers" className="mr-4 text-blue-500">Customer List</Link>
                    <Link to="/add-customer" className="text-blue-500">Add Customer</Link>
                </nav>

                <Routes>
                    <Route path="/customers" element={<CustomerList/>}/>
                    <Route path="/add-customer" element={<CustomerForm/>}/>
                    <Route path="*" element={<p>Welcome to the Roofing Estimate App!</p>}/>
                </Routes>
            </div>
        </Router>
    );
}


export default App;

