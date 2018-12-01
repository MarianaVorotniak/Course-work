--liquibase formatted sql

--changeset marianavototniak:insertdata

INSERT INTO mixes(name, ingredients, description, mark) VALUES
('Adalya Lemon', 'Lemon+Cactus',
'   Тютюн вважається німецьким, але робиться в Туреччині, як часто буває в звязку з великою кількістю турецьких мігрантів в Німеччині.', 4),
('Afzal Orange', 'Orange + Grape + Ginger',
'   Димність середня. Ця проблема вирішується додаванням гліцерину, гелю або поєднанням з більш димними марками.', 5),
('Al Fakher Peach', 'Peach + Chocolate + Coco', '
    Альфакер - один з найперших і найвідоміших тютюнів для кальяну. Відрізняється своєю невисокою вартістю, непоганою жаростойкістю і різноманітністю смаків. Тютюн родом з ОАЕ (Обєднані Арабські Емірати).', 4),
('Al Mawardi Arabian night', 'Arabian night + Lemon', '
Al-Mawardi можна вважати першим тютюном російського виробництва, якому вдалося з гідністю витримати перевірку на якість і зайняти гідне місце на ринку тютюнової продукції.', 4),
('  Fumari Tangerine', 'Tangerine + Mint + Amdrosia', 'Fumari - американский табак для кальяна', 5);