DROP TABLE IF EXISTS counter;

CREATE TABLE counter (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  number INT NOT NULL
);

INSERT INTO counter (name, number) VALUES
  ('Duis', 11),
  ('Sed', 16),
  ('Donec', 8),
  ('Augue', 7),
  ('Pellentesque', 6),
  ('123', 0);