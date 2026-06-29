import { BrowserRouter, Routes, Route, NavLink } from "react-router-dom";

import Home from "./pages/Home";
import Tasks from "./pages/Tasks";
import Projects from "./pages/Projects";
import "./App.css";

function App() {
  return (
    <BrowserRouter>
      <div className="app-shell">
        <header className="site-header">
          <div className="header-inner">
            <NavLink to="/" className="brand">
              Waypoint
            </NavLink>
            <nav className="site-nav">
              <NavLink to="/" end>
                Home
              </NavLink>
              <NavLink to="/projects">Projects</NavLink>
              <NavLink to="/tasks">Tasks</NavLink>
            </nav>
          </div>
        </header>

        <main className="site-main">
          <Routes>
            <Route path="/" element={<Home />} />
            <Route path="/tasks" element={<Tasks />} />
            <Route path="/projects" element={<Projects />} />
          </Routes>
        </main>

        <footer className="site-footer">
          <p>&copy; {new Date().getFullYear()} Waypoint. Built with React.</p>
        </footer>
      </div>
    </BrowserRouter>
  );
}

export default App;
