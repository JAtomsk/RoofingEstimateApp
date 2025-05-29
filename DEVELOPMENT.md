# 🛠️ RoofingEstimateApp – A Beginner’s Journey Into Java and Spring Boot

## ✍️ Why I’m Building This

This blog is my personal journal as I work on my first full-stack application using Java and Spring Boot. The goal is to create a simple, practical tool for roofing contractors—an app that allows users to store customer details and generate basic roofing estimates.

The core features include:
- Storing customer information (name, phone, address, email)
- Tracking roof size (in squares)
- Calculating estimates based on a price per square
- Eventually, exporting a printable estimate or invoice

This app isn’t just a project—it's a learning tool. I'm building it to apply what I’ve learned (and forgotten) and to really understand backend development from the ground up.

---

## 🧠 A Little About Me

I have a degree in Computer Science, but I earned it while working full-time as a roofing foreman. My school offered accelerated 8-week courses, which were perfect for my schedule but didn’t leave much time for deep learning or long-term retention.

Now, I’m revisiting the fundamentals. This project is how I plan to learn by doing—with plenty of mistakes, research, and reflection along the way.

---

## 🧰 Tools I’m Learning to Use

While I’ve worked with some tools before, many are brand new to me. For this app, I’m exploring:

- **Java** – for the main application logic
- **Spring Boot** – to build the backend and REST API
- **MySQL** – to store customer and estimate data
- **Postman** – to test API routes
- **GitHub** – to share and track my code
- **React** – for the frontend (this was a tough decision over JavaFX)

Each of these tools serves a unique purpose. I'm slowly understanding how they fit together—from data models and controllers in Spring Boot to sending requests from the frontend using HTTP.

---

## 🚀 What’s Built So Far

- Set up a Spring Boot project in IntelliJ
- Created a basic `Customer` model with fields like name, phone number, and estimate
- Connected to a local MySQL database (after a lot of trial and error)
- Built a repository and controller to save and retrieve customers
- Tested the API using Postman
- Pushed the backend to GitHub and linked it to my portfolio
- Chose React for the UI and began setup using `create-react-app`

---

## 🔍 Reflecting on the Journey

There’s a lot I’m still learning. Concepts like REST APIs, annotations in Spring Boot, and full-stack development workflows are new to me in practice, even if I’ve seen them before in class. This blog isn’t meant to be a guide—it’s a reflection of real, hands-on learning from someone determined to improve.

My plan is to keep updating this log as I work through each phase—frontend forms, sending data with Axios, maybe even deploying to AWS.

---

## 📌 Up Next

- Build the React UI to input customer info
- Use Axios to connect the frontend to the Spring Boot backend
- Continue documenting what I learn as I go

Thanks for following along—this is a first for me, and I’m learning out loud.








## 📅 Date: May 29, 2025

## 🧠 What Was Achieved Today

Today marks the first major step in building the user interface (UI) for the RoofingEstimateApp — my first ever React project.

As someone completely new to frontend development with React, this was a huge milestone. Here’s a breakdown of what I accomplished:

---

### ✅ Installed and Set Up React
- Resolved some system-level issues with `npm` and created the missing folder manually.
- Installed **Create React App** using `npx` to scaffold a brand-new React project called `roofing-estimate-ui`.
- Launched the React development server and verified everything was working by opening the default webpage.

---

### ✅ Decided to Use WebStorm for Frontend
- Made a clear decision to use **WebStorm** for building the frontend UI due to its optimized support for React and JavaScript, while keeping backend work in IntelliJ.

---

### ✅ Created the First React Component: `CustomerForm`
- Learned that React components are like reusable building blocks of the UI.
- Built a basic HTML form in React with fields for:
    - Name
    - Phone Number
    - Address
    - Email
    - Roof Size (in squares)
    - Price Per Square
- Implemented state management using the `useState` hook to track user input.
- Calculated the total estimate when the form is submitted.
- Learned how React handles data changes using event listeners like `onChange` and `onSubmit`.
- Displayed the submitted form data and calculated estimate in the browser console.

---

### 📡 Preparing to Connect UI to Backend

While the UI is now taking shape, the next major step is connecting the frontend to the backend. This is where **Axios** comes into play.

Axios is a promise-based HTTP client for the browser. It's lightweight, widely used in the React ecosystem, and simplifies sending data to (and receiving data from) a backend API. In this case, Axios will allow the React app to send form data to the Spring Boot backend and receive stored customer data in return.

---

### 🏗️ What’s Coming Next
- Deeper understanding of React syntax: `useState`, `e.target`, `formData`, etc.
- Learn how to **use Axios** to send customer data to the backend API.
- Add basic **form validation** to ensure input is correct before submission.
- Learn styling options with **TailwindCSS** or **CSS Modules**.
- Build a **customer list** table to display existing estimates.