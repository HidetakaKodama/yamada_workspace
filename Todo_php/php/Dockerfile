FROM php:7.3-alpine

RUN apk --update add tzdata && \
    cp /usr/share/zoneinfo/Asia/Tokyo /etc/localtime && \
    apk del tzdata && \
    rm -rf /var/cache/apk/*

RUN docker-php-ext-install pdo pdo_mysql mysqli mbstring

COPY php.ini-development /usr/local/etc/php/php.ini

WORKDIR /work

CMD ["php", "-S", "0.0.0.0:8000", "-t", "/work/public"]