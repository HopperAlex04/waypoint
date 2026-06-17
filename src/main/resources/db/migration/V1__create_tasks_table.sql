CREATE TABLE tasks (
    id BIGSERIAL PRIMARY KEY,
    title TEXT NOT NULL,
    start_time TIMESTAMP,
    end_time TIMESTAMP
);
