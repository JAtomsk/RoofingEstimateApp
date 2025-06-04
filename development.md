🛠️ RoofingEstimateApp – A Beginner’s Full-Stack Journey

✍️ Why I’m Building This

This development log documents my first full-stack application using Java and Spring Boot, aimed at creating a simple tool for roofing contractors. The app allows users to manage customer data and generate roofing estimates.

Core Features:

Store customer information (name, phone, address, email)

Input roof size (in squares)

Calculate estimates based on price per square

(Planned) Generate printable invoices

This is more than a project—it's how I’m relearning backend development through hands-on practice.

🧠 About Me

I earned a Computer Science degree while working full-time as a roofing foreman. My education was delivered through accelerated 8-week courses, which were ideal for my schedule but left little room for deep retention.

Now, I’m taking the time to revisit the core concepts. This project is how I’m applying what I missed the first time around—learning by doing, one step at a time.

🧰 Tools I’m Using

Most of these tools are new to me, and part of this project is learning how to use them effectively:

Java – Application logic

Spring Boot – Backend REST API

MySQL – Database

Postman – API testing

GitHub – Version control

React – Frontend

Axios – HTTP client to connect frontend and backend

I’m starting to understand how these pieces work together—from creating database models and building controllers in Spring Boot, to making HTTP requests from React.

🚀 What’s Been Built

Initialized Spring Boot project in IntelliJ

Created a Customer model and mapped it to a MySQL database

Built a repository and controller to save and retrieve customer data

Tested API endpoints in Postman

Pushed the backend to GitHub

Set up the frontend using create-react-app and chose WebStorm for React development

🔍 Reflections

Concepts like REST APIs, Java annotations, and full-stack workflows are becoming more familiar as I build. This blog is not a tutorial—it’s my raw, honest learning journal.

📌 Next Steps

Build a React UI to input customer information

Use Axios to send form data to the backend

Continue documenting progress and restructuring where needed

🧪 Development Log – Refactoring the Frontend Structure

📅 June 3, 2025

✅ Current State

The frontend currently contains two components:

CustomerForm: Collects customer data and sends it to the backend using Axios.

CustomerList: Fetches and displays all saved customers from the backend.

Both components are rendered on the same page (App.js). However, the customer list does not update in real time after submitting a new customer, and there’s no screen navigation or routing.

🔄 Why Refactor?

As I better understand frontend architecture, it’s clear this setup won’t scale well. Key issues include:

Customer creation and display are crammed on one screen

No screen-based navigation (no React Router)

Estimate calculation is unnecessarily mixed with customer creation

The estimate feature should be triggered only after a customer exists, and it should include logic for itemized materials and customizable profit margins in the future.

🧭 Planned Structure

### 🧭 Planned Redesign

The new plan is to restructure the app using proper **React routing** and **screen-based navigation**. Here's the updated flow:

```plaintext
 Login Screen (stub for now) ]
        ↓
[ Customer Dashboard ]
    - View saved customers
    - Button to add a new customer (navigates to form page)
        ↓
[ Add Customer Page ]
    - Submit customer info
    - Redirect to dashboard
        ↓
[ Customer Detail Page (Future) ]
    - View/edit customer data
    - Button to generate estimate (separate logic)

```
Why This Works Better

Clear screen-based navigation

Clean separation of concerns (no mixed logic)

Modular and scalable for future features

Opens path for estimate logic, editing, deleting, and selecting customers

🤔 Final Thoughts

I dove into this project without fully thinking through the frontend design. That’s okay—it’s how you learn. I now realize the estimate logic should not be bundled with customer creation. Instead, estimates should be their own process, possibly including itemized material breakdowns and dynamic pricing logic for profit calculation.

I'm still new to React, JavaScript syntax, and Axios. Only Java is familiar territory. But I’m making progress, learning as I go, and building a tool that could realistically help small roofing contractors.

Thanks for following along.

