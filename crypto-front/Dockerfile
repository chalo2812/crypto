FROM node:14.17.6
WORKDIR /app
COPY package.json ./app
USER node
COPY . .
RUN npm i
EXPOSE 80
CMD [ "npm","run","start" ]

