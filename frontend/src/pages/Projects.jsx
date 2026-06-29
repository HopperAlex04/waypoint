import { useState, useEffect } from "react";

export default function Projects() {
  const [projects, setProjects] = useState([]);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    fetch("/api/projects")
      .then((res) => {
        if (!res.ok) {
          throw new Error("HTTP error " + res.status);
        }
        return res.json();
      })
      .then((data) => setProjects(data))
      .catch((err) => console.error("Fetch failed:", err))
      .finally(() => setLoading(false));
  }, []);

  return (
    <section>
      <h1>Projects</h1>
      <p>A selection of things I&apos;ve built.</p>

      {loading && <p className="state-message">Loading projects...</p>}

      {!loading && projects.length === 0 && (
        <p className="state-message">No projects to show yet.</p>
      )}

      {!loading && projects.length > 0 && (
        <div className="projects-grid">
          {projects.map((project) => (
            <article key={project.title} className="project-card">
              <h2>{project.title}</h2>
              <p>{project.description}</p>
              <div className="project-meta">
                {project.language && (
                  <span className="language-badge">{project.language}</span>
                )}
                {project.githubUrl && (
                  <a
                    className="project-link"
                    href={project.githubUrl}
                    target="_blank"
                    rel="noreferrer"
                  >
                    View on GitHub
                  </a>
                )}
              </div>
            </article>
          ))}
        </div>
      )}
    </section>
  );
}
