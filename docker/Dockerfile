#FROM 192.168.22.41:5000/nginx-alpine:1
FROM 064267045885.dkr.ecr.ap-south-1.amazonaws.com/qa:nginx-alpine

MAINTAINER durga.prasad@gaiansolutions.com

COPY docker/default.conf /etc/nginx/conf.d/
COPY ./dist/  /usr/share/nginx/html/
#COPY dist/assets  /usr/share/nginx/html/assets

EXPOSE 80
