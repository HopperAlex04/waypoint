import { Link } from "react-router-dom";
import avatarPlaceholder from "../assets/avatar-placeholder.svg";

export default function Home() {
  return (
    <section className="intro">
      <img
        className="intro-photo"
        src={avatarPlaceholder}
        alt="Profile photo placeholder"
      />

      <div className="intro-content">
        <p className="eyebrow">About me</p>
        <h1>Hi, I&apos;m Your Name</h1>
        <p>
          I&apos;m a software developer who enjoys building clean, reliable, and
          user-focused applications. This is placeholder text you can replace
          with a short introduction about your background, interests, and what
          you&apos;re currently working on.
        </p>
        <div className="intro-actions">
          <Link to="/projects" className="btn btn-primary">
            View my projects
          </Link>
          <a
            className="btn btn-secondary"
            href="https://github.com/HopperAlex04"
            target="_blank"
            rel="noreferrer"
          >
            GitHub
          </a>
        </div>
      </div>
    </section>
  );
}
