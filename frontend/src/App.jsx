import { useState, useEffect } from "react";

function App() {
  const [projects, setProjects] = useState([]);

  useEffect(() => {
    fetch("http://localhost:8081/api/projects")
      .then((res) => {
        if (!res.ok) {
          throw new Error("HTTP error " + res.status);
        }
        return res.json();
      })
      .then((data) => setProjects(data))
      .catch((err) => console.error("Fetch failed:", err));
  }, []);

  return (
    <div>
      <h1>Projects</h1>

      {projects.map((project) => (
        <div key={project.title}>
          <h2>{project.title}</h2>
          <p>{project.description}</p>
        </div>
      ))}
    </div>
  );
}

export default App;
