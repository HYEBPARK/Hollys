DROP TABLE IF EXISTS member;
DROP TABLE IF EXISTS item;
DROP TABLE IF EXISTS orders;
DROP TABLE IF EXISTS order_item;

CREATE TABLE member
(
    id       BIGINT       NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name     VARCHAR(255) NOT NULL,
    user_id  VARCHAR(255) UNIQUE,
    password VARCHAR(255) NOT NULL
);

CREATE TABLE orders
(
    id        BIGINT       NOT NULL PRIMARY KEY AUTO_INCREMENT,
    status    VARCHAR(255) NOT NULL,
    member_id BIGINT       NOT NULL,
    FOREIGN KEY (member_id) REFERENCES member (id)
);

CREATE TABLE item
(
    id             BIGINT       NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name           VARCHAR(255) NOT NULL,
    price          INT          NOT NULL UNIQUE,
    stock_quantity INT          NOT NULL
);

CREATE TABLE order_item
(
    id       BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    count    INT,
    price    INT,
    item_id  BIGINT NOT NULL,
    order_id BIGINT NOT NULL,
    FOREIGN KEY (item_id) REFERENCES item (id),
    FOREIGN KEY (order_id) REFERENCES orders (id)
);