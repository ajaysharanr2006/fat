FROM nginx:alpine
RUN sed -i 's/listen\(.*\)80;/listen 9000;/' /etc/nginx/conf.d/default.conf
COPY . /usr/share/nginx/html
EXPOSE 9000
