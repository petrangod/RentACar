/* Populate one Admin User which will further create other users for the application using GUI */
INSERT INTO APP_USER(sso_id, password, first_name, last_name, email)
VALUES ('admin','$2a$10$4eqIF5s/ewJwHK1p8lqlFOEm2QIA0S8g6./Lok.pQxqcxaBZYChRm', 'admin','admin','admin@gmail.com');