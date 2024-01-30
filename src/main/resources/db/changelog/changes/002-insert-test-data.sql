INSERT INTO company (id, name)
VALUES (1, 'Panini');

INSERT INTO collection (id, company_id, name)
VALUES (1, 1, 'Panini FIFA 365: 2023-2024. Adrenalyn XL');

INSERT INTO card (id, collection_id, number, title, section, type)
VALUES (1, 1, 'RAR1', 'Alisson', 'Liverpool', 'Rare'),
       (2, 1, 'RAR2', 'Erling Haaland', 'Manchester City', 'Rare'),
       (3, 1, 'RAR3', 'Pedri', 'FC Barcelona', 'Rare');