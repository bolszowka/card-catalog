CREATE TABLE company
(
    id   BIGINT      NOT NULL,
    name VARCHAR(50) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE collection
(
    id         BIGINT NOT NULL,
    company_id BIGINT NOT NULL ,
    name       VARCHAR(100) NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (company_id) REFERENCES company (id)
);

CREATE TABLE card
(
    id            BIGINT       NOT NULL,
    collection_id BIGINT       NOT NULL,
    number        VARCHAR(10)  NOT NULL,
    title         VARCHAR(100) NOT NULL,
    section       VARCHAR(50)  NOT NULL,
    type          VARCHAR(50)  NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (collection_id) REFERENCES collection (id)
);