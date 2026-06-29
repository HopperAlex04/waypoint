# Step 1: build React
FROM node:20 AS build

WORKDIR /app

COPY package*.json ./
RUN npm install

COPY . .

RUN npm run build


# Step 2: serve with nginx
FROM nginx:alpine

# copy build output
COPY --from=build /app/dist /usr/share/nginx/html

# replace default nginx config
COPY nginx.conf /etc/nginx/conf.d/default.conf

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]
