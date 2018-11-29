--liquibase formatted sql

--changeset marianavototniak:insertdata

INSERT INTO mixes(name, ingredients, description, mark) VALUES
('Lemon', 'Lemon+Cactus', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum nec varius dui.', 4),
('Orange', 'Orange+Grape+Ginger', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum nec varius dui.', 5),
('Peach', 'Peach+Chocolate+Coco', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum nec varius dui.', 4),
('Arabian night', 'Arabian night+Lemon', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum nec varius dui.', 4),
('Tangerine', 'Tangerine+Mint+Amdrosia', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum nec varius dui.', 4);