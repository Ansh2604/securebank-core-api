CREATE TABLE customers (
    id          VARCHAR(36)  PRIMARY KEY,
    first_name  VARCHAR(100) NOT NULL,
    last_name   VARCHAR(100) NOT NULL,
    email       VARCHAR(255) NOT NULL UNIQUE,
    created_at  TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE accounts (
    id          VARCHAR(36)  PRIMARY KEY,
    customer_id VARCHAR(36)  NOT NULL,
    type        VARCHAR(20)  NOT NULL,
    balance     BIGINT       NOT NULL DEFAULT 0,
    currency    VARCHAR(3)   NOT NULL DEFAULT 'USD',
    created_at  TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_accounts_customer FOREIGN KEY (customer_id) REFERENCES customers (id)
);

CREATE TABLE transactions (
    id          VARCHAR(36)  PRIMARY KEY,
    account_id  VARCHAR(36)  NOT NULL,
    type        VARCHAR(20)  NOT NULL,
    amount      BIGINT       NOT NULL,
    currency    VARCHAR(3)   NOT NULL DEFAULT 'USD',
    description VARCHAR(500),
    created_at  TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_transactions_account FOREIGN KEY (account_id) REFERENCES accounts (id)
);

CREATE TABLE transfers (
    id                 VARCHAR(36)  PRIMARY KEY,
    source_account_id  VARCHAR(36)  NOT NULL,
    target_account_id  VARCHAR(36)  NOT NULL,
    amount             BIGINT       NOT NULL,
    currency           VARCHAR(3)   NOT NULL DEFAULT 'USD',
    status             VARCHAR(20)  NOT NULL,
    created_at         TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_transfers_source FOREIGN KEY (source_account_id) REFERENCES accounts (id),
    CONSTRAINT fk_transfers_target FOREIGN KEY (target_account_id) REFERENCES accounts (id)
);

CREATE TABLE compliance_holds (
    id          VARCHAR(36)  PRIMARY KEY,
    account_id  VARCHAR(36)  NOT NULL,
    reason      VARCHAR(500) NOT NULL,
    amount      BIGINT       NOT NULL,
    status      VARCHAR(20)  NOT NULL,
    created_at  TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_holds_account FOREIGN KEY (account_id) REFERENCES accounts (id)
);
