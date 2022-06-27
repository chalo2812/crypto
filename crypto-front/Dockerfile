FROM node:lts-slim
WORKDIR /app
COPY package.json .
RUN chmod 777 /app
COPY . .
RUN apt-get update && apt-get install net-tools -y
RUN npm i
EXPOSE 80
EXPOSE 443
EXPOSE 3000
CMD [ "npm","run","start" ]

