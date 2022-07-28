FROM node:lts-slim
WORKDIR /app
COPY package.json .
RUN chmod 777 /app
COPY . .
RUN npm i
EXPOSE 3000
CMD [ "npm","run","start" ]

