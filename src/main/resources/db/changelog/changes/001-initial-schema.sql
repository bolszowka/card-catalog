CREATE TABLE company
(
    id   BIGINT PRIMARY KEY,
    name VARCHAR(50)
);

CREATE TABLE collection
(
    id         BIGINT PRIMARY KEY,
    company_id BIGINT,
    name       VARCHAR(100),
    FOREIGN KEY (company_id) REFERENCES company (id)
);

CREATE TABLE card
(
    id            BIGINT PRIMARY KEY,
    collection_id BIGINT,
    number        VARCHAR(10),
    title         VARCHAR(100),
    section       VARCHAR(50),
    type          VARCHAR(50),
    FOREIGN KEY (collection_id) REFERENCES collection (id)
);